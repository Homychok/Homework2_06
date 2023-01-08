package homework.transport;


import homework.drivers.CategoryD;

public class Bus extends Transport<CategoryD> {
    protected CategoryD driver;
    protected String type;

    Integer busCapacity;
    ClassificationBusCapacity capacity;
    ClassificationBusCapacity minCapacity;
    ClassificationBusCapacity maxCapacity;

    public Bus(String brand, String model, Double engineVolume, int busCapacity, String type) {
        super(brand, model, engineVolume, type);
        this.busCapacity = busCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public enum BusCapacity {
        TENSEATS(10),
        TWENTYFIVESEATS(20),
        FORTYSEATS(40),
        FIFTYSEATS(50),
        SIXTYSEATS(60),
        EIGHTYSEATS(80),
        ONEHUNDREDSEATS(100),
        TWOHUNDREDSEATS(200);
        public Integer busCapacity;

        BusCapacity(Integer busCapacity) {
            this.busCapacity = busCapacity;
        }

        public Integer getBusCapacity() {
            return busCapacity;
        }

        public void setBusCapacity(Integer busCapacity) {
            this.busCapacity = busCapacity;
        }

        @Override
        public String toString() {
            return "Вместимость составляет " + busCapacity;
        }
    }

    public enum ClassificationBusCapacity {
        ESPECIALLYSMALLCAPACITY(0, 10),
        SMALLCAPACITY(10, 20),
        MEDIUMCAPACITY(40, 50),
        LARGECAPACITY(60, 80),
        PARTICULARLYLARGECAPACITY(100, 200);
        private Integer minCapacity;
        private Integer maxCapacity;
        private String capacity;
        Integer busCapacity;
//        BusCapacity TENSEATS;
//        BusCapacity TWENTYSEATS;
//        BusCapacity FORTYSEATS;
//        BusCapacity FIFTYSEATS;
//        BusCapacity SIXTYSEATS;
//        BusCapacity EIGHTYSEATS;

        ClassificationBusCapacity(Integer minCapacity, Integer maxCapacity) {
            setCapacity(minCapacity, maxCapacity);

        }

        public String getCapacity() {
            return capacity;
        }

        public void setCapacity(Integer minCapacity, Integer maxCapacity) {
            if (busCapacity <= 10 && busCapacity >= 0) {
                this.minCapacity = ESPECIALLYSMALLCAPACITY.minCapacity;
                this.maxCapacity = ESPECIALLYSMALLCAPACITY.maxCapacity;
                capacity = "Особо малая";
            } else if (busCapacity > 10 && busCapacity <= 25) {
                this.minCapacity = SMALLCAPACITY.minCapacity;
                this.maxCapacity = SMALLCAPACITY.maxCapacity;
                capacity = "Малая";
            }else if (busCapacity > 40 && busCapacity <= 50) {
                this.minCapacity = MEDIUMCAPACITY.minCapacity;
                this.maxCapacity = MEDIUMCAPACITY.maxCapacity;
                capacity = "Средняя";
            } else if (busCapacity > 60 && busCapacity <= 80) {
                this.minCapacity = LARGECAPACITY.minCapacity;
                this.maxCapacity = LARGECAPACITY.maxCapacity;
                capacity = "Большая";
            } else {
                this.minCapacity = PARTICULARLYLARGECAPACITY.minCapacity;
                this.maxCapacity = PARTICULARLYLARGECAPACITY.maxCapacity;
                capacity = "Особо большая";
            }
        }

//        public void setMaxCapacity(Integer maxCapacity) {
//            this.maxCapacity = maxCapacity;
//        }

        public Integer getMinCapacity() {
            return minCapacity;
        }

        public Integer getMaxCapacity() {
            return maxCapacity;
        }


        @Override
        public String toString() {
            return "Автобус bv" + busCapacity + " мест " +
                    "автобусы классифицируются, как " + getCapacity() + " при диапазоне значений: от"
                     + minCapacity + " до " + maxCapacity;
        }
    }
    public void printType() {
        if (type != null ) {
            System.out.println("Автобус" + brand + " " + model + " с типом " + type);

        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }
    public void printBusCapacity() {
        System.out.println("Автобус " + brand + " " + model + " при вместимости в " + busCapacity + " мест " +
                "автобусы классифицируются, как " + capacity + " при диапазоне значений: от"
                + minCapacity + " до " + maxCapacity);
    }
    public CategoryD getDriver() {
        return driver;

    }

    public void setDriver(CategoryD driver) {
        this.driver = driver;
    }
    public void printInfo() {
        System.out.println("Водитель " + driver + " управляет автомобилем " + brand + " " + model + " будет участвовать в заезде!");
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
        return "Автобус" +
                "марка " + brand + '\'' +
                ", модель " + model + '\'' +
                ", объем двигателя " + engineVolume +
                ", водитель " + driver;
    }
}
