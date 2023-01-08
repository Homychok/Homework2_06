package homework.transport;

import homework.drivers.CategoryB;

import java.util.Arrays;

public class Cars extends Transport<CategoryB> {
//    public static String BodyType;
    protected CategoryB driver;
    protected String type;
    BodyType bodyType;
    public Cars(String brand, String model, Double engineVolume, BodyType bodyType, String type) {
        super(brand,
                model,
                engineVolume, type);
        this.bodyType = bodyType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public enum BodyType {
                SEDAN ("Седан"),
                HATCHBACK ("Хетчбек"),
                COUPE ("Купе"),
                UNIVERSAL ("Универсал"),
                SUV ("Внедорожник"),
                CROSSOVER ("Кроссовер"),
                PICKUP ("Пикап"),
                VAN ("Фургон"),
                MINIVAN ("Минивэн");
                public String carBodyType;
                BodyType(String carBodyType) {
                    this.carBodyType = carBodyType;}

                @Override
                public String toString() {
                    return "Тип кузова - " +
                            carBodyType ;
                }

                public String getCarBodyType() {
                    return carBodyType;

                }
                public void printBodyType() {
                    for (BodyType bodyType : BodyType.values()) {
                        System.out.println(Arrays.toString(BodyType.values()));
                    }
            }
            }

    @Override
    public String toString() {
        return "Автомобиль" +
                "марка" + brand + '\'' +
                ", модель" + model + '\'' +
                ", объем двигателя" + engineVolume +
                ", водитель" + driver;
    }
    @Override
    public void getCheckedOutDiagnostic() {
        System.out.println("Необходимо пройти диагностику транспортного средства");
        System.out.println("Автомобиль прошел диагностику");
    }
    public void printType() {
        if (type == null ) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Машина" + brand + " " + model + " с типом " + getType());
        }
    }
    public void printInfo() {
        System.out.println("Водитель " + driver + " управляет автомобилем " + brand + " " + model + " будет участвовать в заезде!");
//        System.out.println("Водитель " + driver.getFullName() + " управляет автомобилем " + brand + " " + model + " будет участвовать в заезде!");

    }
    public void setDriver(CategoryB driver) {
        this.driver = driver;
    }

    public CategoryB getDriver() {
        return driver;
    }
    public Boolean getCheckedOut() throws MyException {
        Boolean s = driver.getDrivingLicence();
        if (s.equals(false)) {
            throw new MyException("String can not be empty!");
        }
        System.out.println("Необходимо указать тип прав! " );
        return s;
    }
}


