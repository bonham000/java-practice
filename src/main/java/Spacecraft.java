public class Spacecraft {
    private String name;
    private double altitude;

    public Spacecraft(String name, double altitude) {
        this.name = name;
        this.altitude = altitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }
}
