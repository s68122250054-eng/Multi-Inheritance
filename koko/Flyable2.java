interface Flyable2 {
    void takeOff();
    void land();
    double maxAltitude();

    default String status() {
        return "FLY MODE";
    }
}

interface Drivable {
    void startEngine();
    void stopEngine();
    double maxSpeed();

    default String status() {
        return "DRIVE MODE";
    }
}