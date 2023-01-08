package homework;

import homework.drivers.CategoryB;
import homework.drivers.CategoryC;
import homework.drivers.CategoryD;
import homework.transport.Bus;
import homework.transport.Cars;
import homework.transport.Tracks;
import homework.transport.Tracks.LoadCapacity;
import homework.transport.Transport;

import java.util.Arrays;

import static homework.transport.Tracks.LoadCapacity.*;

//import static sun.security.util.Debug.args;

public class Main {

    public static void printTransport(Transport<?>... drivers) {
        for (Transport<?> driver : drivers) {
            System.out.println("Водитель " + driver.getDriver() + " управляет автомобилем " + driver.getBrand() + " " + driver.getModel() + " и будет участвовать в заезде!");
        }
    }

//    public void printLoadCapacity() {
//        System.out.println(homework.Transport.Tracks.LoadCapacity.getTracksLoadCapacity());
////            return homework.Transport.Tracks.LoadCapacity.valueOf();
////        System.out.println(Arrays.toString());
//    }
//        }

    public static void main(String[] args) {
        Bus bus1 = new Bus("Reno", "A5", 2.1, 1, "busType");
        Bus bus2 = new Bus("Reno", "Logan", 3.7, 49, "busType");
        Bus bus3 = new Bus("Reno", "F4", 4.5, 35, "");
        Bus bus4 = new Bus("Reno", "A6", 7.2, 150, "busType");
        Cars car1 = new Cars("Lada", "Granta", 3.4, Cars.BodyType.SUV, "carType");
        Cars car2 = new Cars("Lada", "Vesta1", 4.4, Cars.BodyType.VAN, "carType");
        Cars car3 = new Cars("Lada", "X-Ray", 5.4, Cars.BodyType.MINIVAN, "carType");
        Cars car4 = new Cars("Lada", "Vesta2", 6.4, Cars.BodyType.HATCHBACK, "carType");
        Tracks track1 = new Tracks("Kia", "A1", 10.1, N1, "trackType");
        Tracks track2 = new Tracks("Kia", "A1", 11.1, N2, "trackType");
        Tracks track3 = new Tracks("Kia", "A1", 12.1, N2, "trackType");
        Tracks track4 = new Tracks("Kia", "A1", 13.1, N3, "trackType");
        CategoryB carDriver1 = new CategoryB(1, "Ivan Ivanovich", true);
        CategoryB carDriver2 = new CategoryB(2, "Ivan Petrovich", true);
        CategoryB carDriver3 = new CategoryB(3, "Ivan Kuzmichov", true);
        CategoryB carDriver4 = new CategoryB(4, "Ivan Sergeevich", true);
        CategoryC trackDriver1 = new CategoryC(5, "Kuzma Petrovich", true);
        CategoryC trackDriver2 = new CategoryC(6, "Kuzma Kuzmich", true);
        CategoryC trackDriver3 = new CategoryC(7, "Kuzma Gregorevich", true);
        CategoryC trackDriver4 = new CategoryC(8, "Kuzma Mihailovich", true);
        CategoryD busDriver1 = new CategoryD(9, "Sergey Ivanovich", true);
        CategoryD busDriver2 = new CategoryD(10, "Sergey Petrovich", true);
        CategoryD busDriver3 = new CategoryD(11, "Sergey Gregorevich", true);
        CategoryD busDriver4 = new CategoryD(12, "Sergey Mihailovich", true);
        car1.setDriver(carDriver1);
        car2.setDriver(carDriver2);
        car3.setDriver(carDriver3);
        car4.setDriver(carDriver4);
        bus1.setDriver(busDriver1);
        bus2.setDriver(busDriver2);
        bus3.setDriver(busDriver3);
        bus4.setDriver(busDriver4);
        track1.setDriver(trackDriver1);
        track2.setDriver(trackDriver2);
        track3.setDriver(trackDriver3);
        track4.setDriver(trackDriver4);
        printTransport(car1, car2, car3, car4, track1, track2, track3, track4, bus1, bus2, bus3, bus4);
        car1.pitStopTime();
        car1.roundTime();
        car1.maxVelocity();
        car1.printInfo();
        car2.printInfo();
        car3.printInfo();
        car4.printInfo();
        bus1.printInfo();
        bus2.printInfo();
        bus3.printInfo();
        bus4.printInfo();
        track1.printInfo();
        track2.printInfo();
        track3.printInfo();
        track4.printInfo();
        Cars.BodyType.values();
        System.out.println(Arrays.toString(Cars.BodyType.values()));
//        System.out.println(track2.toString(LoadCapacity));
        System.out.println(Arrays.toString(Tracks.LoadCapacity.values()));
//        System.out.println(LoadCapacity.valueOf());
        track1.printInfo();
        track1.printLoadCapacity();
        bus1.printBusCapacity();
        bus1.printType();
        bus3.printType();
        car1.printType();
        track1.printType();
        car1.getCheckedOutDiagnostic();
        track1.getCheckedOutDiagnostic();
        carDriver2.getDrivingLicence();

    }
}


