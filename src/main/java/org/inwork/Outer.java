package org.inwork;

public class Main {
    public static void main(String[] args) {
    }
}

/**
 * Local_inner_classes
 * example_1
 */


public class Outer {

    private int x = 8;

    void someMethod() {

        final int x = 10;

        class LocalInner {

            private void print(int x) {
                System.out.println(x);
            }
        }

        LocalInner inner = new LocalInner();
        inner.print(15);
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.someMethod();
    }
}

/**
 * Local_inner_classes
 * example_2
 */

class Apple {

    //Apple Gala is ready to be eaten!

    private String appleVariety;

    public Apple(String appleVariety) {
        this.appleVariety = appleVariety;
    }

    void cutApple() {

        // create local inner class Knife
        class Knife {
            // create method makeSlices()
            public void makeSlices() {
                System.out.println("Apple " + Apple.this.appleVariety + " is ready to be eaten!");
            }
        }
        Knife knife = new Knife();
        knife.makeSlices();
    }

    public static void main(String[] args) {
        Apple apple = new Apple("Gala");
        apple.cutApple();
    }
}

//class StringOperations {
//
//    // create static nested class EngString
//    public static class EngString{
//        private boolean english;
//        private String string;
//
//        public EngString(boolean english, String string) {
//            this.english = english;
//            this.string = string;
//        }
//
//        public boolean isEnglish() {
//            return english;
//        }
//
//        public String getString() {
//            return string;
//        }
//    }
//
//}

//class Main {
//
//    public enum Planet {
//
//        VENUS   (4.869e+24, 6.0518e+6),
//        EARTH   (5.976e+24, 6.37814e+6),
//        MARS    (6.421e+23, 3.3972e+6),
//        JUPITER (1.9e+27,   7.1492e+7),
//        SATURN  (5.688e+26, 6.0268e+7),
//        URANUS  (8.686e+25, 2.5559e+7);
//
//        private final double m; // mass in kilograms
//        private final double r; // radius in meters
//
//        Planet(double mass, double radius) {
//            this.m = mass;
//            this.r = radius;
//        }
//
//        public double mass() { return m; }
//
//        public double radius() { return r; }
//    }
//
//    public static void main(String[] args) {
//        for (Planet planet : Planet.values()) {
//            if (planet.mass() > 5.0e+24 && planet.radius() > 6.0e+7) {
//                System.out.println(planet);
//            }
//        }
//    }
//}

/**
 * example_2
 */


//    enum DangerLevel {
//        HIGH(3),
//        MEDIUM(2),
//        LOW(1);
//
//        private int level;
//
//        DangerLevel(int level) {
//            this.level = level;
//        }
//
//        public int getLevel() {
//            return level;
//        }
//    }
//
//
//    public static void main(String[] args) {
//        DangerLevel high = DangerLevel.HIGH;
//        DangerLevel medium = DangerLevel.MEDIUM;
//
//        System.out.println(high.getLevel() > medium.getLevel()); // true
//    }
//}

/**
 * example_3
 */
//enum SI {
//
//    M("length"),
//    KG("mass"),
//    S("time");
//
//    public final String quantityName;
//
//    SI(String quantityName) {
//        this.quantityName = quantityName;
//    }
//
//    // implement getQuantityName() method here
//    public String getQuantityName(){
//        return quantityName;
//    }
//
//}
//
//class EnjoyVehicle{
//    public static void main(String[] args) {
//        System.out.println(SI.M.getQuantityName());
//    }
//}

/**
 * example_4
 */

//class Vehicle {
//
//    // vehicle of your dream
//
//    class Engine {
//
//        void start() {
//            System.out.println("RRRrrrrrrr....");
//        }
//    }
//}
//public class EnjoyVehicle {
//    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
//        Vehicle.Engine engine = vehicle.new Engine();
//        engine.start();
//    }
//}

/**
 * example_5
 */

//
//class Vehicle {
//
//    private String name;
//
//    // create constructor
//
//    public Vehicle(String name) {
//        this.name = name;
//    }
//
//    class Engine {
//
//        void start() {
//            System.out.println("RRRrrrrrrr....");
//        }
//
//    }
//
//    // create class Body
//    class Body {
//        private String color;
//
//        public Body(String color) {
//            this.color = color;
//        }
//
//        void printColor() {
//            System.out.println("Vehicle " + Vehicle.this.name + " has " + this.color + " body.");
//            //Vehicle Dixi has red body.
//
//        }
//
//    }
//}

// this code should work
//class Main {
//
//    public static void main(String[] args) {
//
//        Vehicle vehicle = new Vehicle("Dixi");
//        Vehicle.Body body = vehicle.new Body("red");
//        body.printColor();
//    }
//}

/**
 * example_6
 */

//class ChristmasTree {
//
//    private String color;
//
//    public ChristmasTree(String color) {
//        this.color = color;
//    }
//
//    // create method putTreeTopper()
//    void putTreeTopper(String colorTr){
//        ChristmasTree christmasTree = new ChristmasTree(this.color);
//        TreeTopper treeTopper = christmasTree.new TreeTopper(colorTr);
//        treeTopper.sparkle();
//    }
//
//    class TreeTopper {
//
//        private String color;
//
//        public TreeTopper(String color) {
//            this.color = color;
//        }
//
//        // create method sparkle()
//        void sparkle(){
//            //Sparkling silver tree topper looks stunning with green Christmas tree!
//            System.out.println("Sparkling "+this.color+" tree topper looks stunning with "
//                    +ChristmasTree.this.color+" Christmas tree!");
//
//        }
//    }
//}
//
//// this code should work
//class CreateHoliday {
//
//    public static void main(String[] args) {
//
//        ChristmasTree christmasTree = new ChristmasTree("green");
//        christmasTree.putTreeTopper("silver");
//    }
//}

/**
 * example_7
 */

//class Pumpkin {
//
//    private boolean forHalloween;
//
//    public Pumpkin(boolean forHalloween) {
//        this.forHalloween = forHalloween;
//    }
//
//    // create method addCandle()
//    void addCandle(){
//        if (forHalloween == true){
//            Candle candle = new Candle();
//            candle.burning();
//        }
//        else System.out.println("We don't need a candle.");
//    }
//
//    class Candle {
//
//        void burning() {
//            System.out.println("The candle is burning! Boooooo!");
//        }
//    }
//}

/**
 * example_8
 */
//
//class Vehicle {
//
//    private String name;
//
//    // create constructor
//
//    public Vehicle(String name) {
//        this.name = name;
//    }
//
//    class Engine {
//
//        // add field horsePower
//        private int horsePower;
//        // create constructor
//
//
//        public Engine(int horsePower) {
//            this.horsePower = horsePower;
//        }
//
//        void start() {
//            System.out.println("RRRrrrrrrr....");
//        }
//
//        // create method printHorsePower()
//        //Vehicle Dixi has 20 horsepower
//        void printHorsePower() {
//            System.out.println("Vehicle " + Vehicle.this.name + " has " + this.horsePower + " horsepower");
//        }
//    }
//}
//
//// this code should work
//class EnjoyVehicle {
//
//    public static void main(String[] args) {
//
//        Vehicle vehicle = new Vehicle("Dixi");
//        Vehicle.Engine engine = vehicle.new Engine(20);
//        engine.printHorsePower();
//    }
//}
//
/**
 * example_9
 */
//enum Currency {
//    USD,
//    EUR,
//    GBP,
//    RUB,
//    UAH,
//    KZT,
//    CAD,
//    JPY,
//    CNY
//};
//
//enum Secret {
//    STAR, CRASH, START
//}

//public class App {
//
//    public static void main(String[] args) {
//        int counter = 0;
//
//        // write your code here
//        for (Secret secret : Secret.values()) {
//            if (secret.name().contains("STAR")) counter++;
//        }
//
//        System.out.println(counter);
//    }
//}System.out.println("Hello world!");

/**
 * example_10
 */

//public enum ChargeLevel {
//
//    FULL(4, "green"),
//    HIGH(3, "green"),
//    MEDIUM(2, "yellow"),
//    LOW(1, "red");
//
//    private final int sections;
//    private final String color;
//
//    ChargeLevel(int sections, String color) {
//        this.sections = sections;
//        this.color = color;
//    }
//
//    public int getSections() {
//        return sections;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public static ChargeLevel findByNumberOfSections(int sections) {
//        for (ChargeLevel value: values()) {
//            if (value.sections == sections) {
//                return value;
//            }
//        }
//        return null;
//    }
//}
