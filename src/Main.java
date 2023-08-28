import fraction.Fraction;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(16,24);
        System.out.println(f1);
        System.out.println(f2);
        Fraction f3 = f1.plus(f2);
        System.out.println(f3);
        Fraction f4 = f1.minus(f2);
        System.out.println(f4);
        f4.reduction();
        System.out.println(f4);
    }
}