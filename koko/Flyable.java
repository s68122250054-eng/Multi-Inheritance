interface Flyable {
    void takeOff();
    void land();
    double maxAltitude();
}

interface Drivable {
    void startEngine();
    void stopEngine();
    double maxSpeed();
}

interface ThermalSensor {
    double readTemperatureC();
    boolean detectHuman(double thresholdC);
}

interface Communicable {
    void send(String message);
    String getDeviceId();
}