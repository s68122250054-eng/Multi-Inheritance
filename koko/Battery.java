class Battery {
    private double level = 100;

    void drain(double amount) {
        level -= amount;
        if (level < 0) level = 0;
    }

    void charge(double amount) {
        level += amount;
        if (level > 100) level = 100;
    }

    double getLevel() {
        return level;
    }
}