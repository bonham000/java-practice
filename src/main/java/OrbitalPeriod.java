public class OrbitalPeriod {
    private static final double earthRadius = 6367.4447;
    private static final double gm = 398600.4418;

    private void orbitalPeriod(Spacecraft craft) {
        double alt = craft.getAltitude();
        double axis = alt + earthRadius;
        double pi = Math.PI;
        double sq = (axis * axis * axis) / gm;
        double result = Math.sqrt(sq) * 2 * pi;
        long answer = Math.round(result);
        System.out.println(craft.getName() + ", orbital period: " + answer);
    }

    private void processInput(Spacecraft[] fleet) {
        for (Spacecraft craft:fleet) {
            orbitalPeriod(craft);
        }
    }


    public void run() {
        System.out.println("Running...");
        Spacecraft s1 = new Spacecraft("sputnik", 35873.5553);
        Spacecraft s2 = new Spacecraft("iss", 413.6);
        Spacecraft s3 = new Spacecraft("hubble", 556.7);
        Spacecraft s4 = new Spacecraft("moon", 378632.553);

        Spacecraft[] fleet = { s1, s2, s3, s4 };
        processInput(fleet);

    }
}
