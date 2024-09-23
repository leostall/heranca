class Circulo {
    static float PI = 3.14F;

    static float area(float r) {
        float a = PI * r * r;
        return a;
    }

    static float perimetro(float r) {

        float p = 2 * PI * r;
        return p;
    }

    public static void main(String[] args) {

        float x = area(5);
        float y = perimetro(8);
        System.out.println(x);
        System.out.println(y);
    }
}