package homework.transport;

import homework.drivers.CategoryC;

public class Tracks extends Transport<CategoryC> {
    protected CategoryC driver;

    LoadCapacity trackLoadCapacity;

    private String type;

    public Tracks(String brand, String model, Double engineVolume, LoadCapacity trackLoadCapacity, String type) {
        super(brand, model, engineVolume, type);
        this.trackLoadCapacity = trackLoadCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public enum LoadCapacity {
        N1("С полной массой до 3.5 тонн."),
        N2("С полной массой свыше 3,5 до 12 тонн."),
        N3("С полной массой свыше 12 тонн.");
        //        N1 (trackLoadCapacityMin = 0F ,trackLoadCapacityMax = 3.5F),
//        N2 (trackLoadCapacityMin = 3.5F, trackLoadCapacityMax = 12F),
//        N3 (trackLoadCapacityMin = 12F, trackLoadCapacityMax = 1.0F/0.0F);
//
//        private static float trackLoadCapacityMin;
//        private static float trackLoadCapacityMax;
        private String tracksLoadCapacity;
        private final float minLoadCapacity = 3.5f;
        private final float maxLoadCapacity = 12f;

        LoadCapacity(String tracksLoadCapacity) {
            this.tracksLoadCapacity = tracksLoadCapacity;
        }

        //        public final float INFINITY1 = (float) (1.0 / 0.0);
        //        public final double INFINITY2 = -1.0 / 0.0;
//        LoadCapacity loadCapacity;
//        LoadCapacity(float trackLoadCapacityMin, float trackLoadCapacityMax) {
//            this.trackLoadCapacityMin = trackLoadCapacityMin;
//            this.trackLoadCapacityMax = trackLoadCapacityMax;
//        }
        public String getTracksLoadCapacity() {
            return tracksLoadCapacity;
        }

        //        public void setTracksLoadCapacity(String tracksLoadCapacity) {
//            this.tracksLoadCapacity = tracksLoadCapacity;
//        }

        @Override
        public String toString() {
            if (tracksLoadCapacity == N1.getTracksLoadCapacity()) {
                return "Грузоподъемность: от " + 0 + " тонн до " + minLoadCapacity + " тонн.";
            } else if (tracksLoadCapacity == N3.getTracksLoadCapacity()) {
                return "Грузоподъемность: от " + maxLoadCapacity + " тонн до " + (1.0 / 0.0) + " тонн.";
            } else {
                return "Грузоподъемность: от " + minLoadCapacity + " тонн до " + maxLoadCapacity + " тонн.";
            }
        }

//        public void printLoadCapacity() {
//        }

//        public static float getTrackLoadCapacityMin() {
//            return trackLoadCapacityMin;
//        }
//
//        public static float getTrackLoadCapacityMax() {
//            return trackLoadCapacityMax;
//        }
//        //        private int trackLoadCapacity;
////        double LOADCAPACITY1 = 3.5d;
////        double LOADCAPACITY2 = 12d;
//
//
//
////        public float getTracksLoadCapacityMin() {
////            return tracksLoadCapacityMin;
////        }
    }

    public void printType() {
        if (type == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Грузовик" + brand + " " + model + " с типом " + type);
        }
    }

    public void printLoadCapacity() {
        System.out.println("Грузовик " + brand + " " + model + " имеет " + trackLoadCapacity);
    }

    public void setDriver(CategoryC driver) {
        this.driver = driver;
    }

    public CategoryC getDriver() {
        return driver;
    }

    public void setmaxVelocity(CategoryC driver) {
        this.driver = driver;
    }

    public CategoryC getmaxVelocity() {
        return driver;
    }

    public void printInfo() {
        System.out.println("Водитель " + driver + " управляет автомобилем " + brand + " " + model + " будет участвовать в заезде!");
    }

    public void getCheckedOutDiagnostic() {
        System.out.println("Необходимо пройти диагностику транспортного средства");
        System.out.println("Грузовик прошел диагностику");
    }
    public Boolean getCheckedOut() throws MyException {
        Boolean s = driver.getDrivingLicence();
        if (s.equals(false)) {
            throw new MyException("String can not be empty!");
        }
        System.out.println("Необходимо указать тип прав! " );
        return s;
    }
    @Override
    public String toString() {
        return "Грузовик" +
                "марка" + brand + '\'' +
                ", модель" + model + '\'' +
                ", объем двигателя" + engineVolume +
                ", водитель" + driver;

    }
}
