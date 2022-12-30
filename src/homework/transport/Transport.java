package homework.transport;

import homework.Competing;
import homework.drivers.Driver;

import java.io.IOException;

public abstract class Transport<T extends Driver> implements Competing {
    private String type;
    protected String brand;
    protected String model;
    protected Double engineVolume;
//    protected String type;
   protected T driver;

    public Transport(String brand, String model, Double engineVolume, String type) {
        if (brand != null  && !brand.isBlank()) {
            this.brand = brand;
        }
        if (model != null && !model.isBlank()) {
            this.model = model;
        }
        setEngineVolume(this.engineVolume);
        this.type = type;

    }
        public void startMoving() {
        System.out.println("Транспорт начинает движение!");
    }

    public void stopMoving() {
        System.out.println("Транспорт останавливается!");
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver() {
        this.driver = driver;
    }

    public void setEngineVolume(Double engineVolume) {
        if (engineVolume != null && engineVolume <= 0) {
            this.engineVolume = engineVolume;

        }
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }
    public void roundTime() {
        System.out.println("roundTime");
    }

    public void pitStopTime() {
        System.out.println("PitStopTime");
    }

    public  void maxVelocity() {
        System.out.println("maxVelocity");
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public void printInfo() {
}
    public abstract void printType();

    public Boolean getCheckedOut() throws MyException {
        Boolean s = null;
        s = driver.getDrivingLicence();
        if (s.equals("")) {
            throw new MyException("String can not be empty!");
        }
        System.out.println("Необходимо указать тип прав! " );
        return s;
        }
    }
