class ThermalCamera {
    double readTemperatureC() {
        return 37.2;
    }

    boolean detectHuman(double thresholdC) {
        return readTemperatureC() >= thresholdC;
    }
}