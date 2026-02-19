class GPSTracker {
    private double lat;
    private double lon;

    void updatePosition(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    String currentPosition() {
        return "LAT=" + lat + ", LON=" + lon;
    }
}