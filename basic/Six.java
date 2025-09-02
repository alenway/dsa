public class Six {
    static class Complex {
        double real;
        double imagenery;

        Complex(double real, double imagenery) {
            this.real = real;
            this.imagenery = imagenery;
        }

        Complex add(Complex other) {
            return new Complex(this.real + other.real, this.imagenery + other.imagenery);
        }

        @Override
        public String toString() {
            return real + " + " + imagenery + "i";
        }
    }

    public static void main(String[] args) {
        Complex z1 = new Complex(3, 4);
        Complex z2 = new Complex(5, 7);

        Complex sum = z1.add(z2);

        System.out.println(sum);
    }
}
