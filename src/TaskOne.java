import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите L: ");
        double L = scaner.nextDouble();
        double R = getR(L);
        System.out.println("Радиус равен: " + R);
        double area = getS(R);
        System.out.println("Площадь круга равна: " + L);
    }


    public static double getR(double L) {
        double R = L / (2 * Math.PI);
        return R;
    }



    public static double getS(double R) {
        double S = Math.PI * (R * R);
        return S;
    }
}
