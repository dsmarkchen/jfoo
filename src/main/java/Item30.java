package main.java;

public class Item30 {
    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append((new WeightTable()).weight("175"));
        b.append("Item 30: Use Enums Instead of Int Constants");
        return b.toString();
    }

    public enum Planet {
        MERCURY(3.302e+23, 2.439e6),
        EARTH(5.975e+24, 6.378e6);

        private final double mass;
        private final double radius;
        private final double surfaceGravity;

        private static final double G = 6.67300E-11;

        Planet(double mass, double radius) {
            this.mass = mass;
            this.radius = radius;
            surfaceGravity = G * mass / (radius * radius);
        }

        public double mass() {
            return mass;
        }

        public double radius() {
            return radius;
        }

        public double surfaceGravity() {
            return surfaceGravity;
        }

        public double surfaceWeight(double mass) {
            return mass * surfaceGravity;
        }
    }

    class WeightTable {
        public String weight(String arg) {
            StringBuilder b = new StringBuilder();
            double earthWeight = Double.parseDouble(arg);
            double mass = earthWeight / Planet.EARTH.surfaceGravity();
            for (Planet p : Planet.values()) {
                String s = String.format("Weight on %s is %f%n", p, p.surfaceWeight(mass));
                b.append(s);
            }
            return b.toString();
        }
    }


}
