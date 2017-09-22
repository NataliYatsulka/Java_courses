import java.util.Scanner;

/**
 * Created by nyatsulk on 9/13/17.
 */
public class Main {

    public static double numb = 0;

    public static void main(String[] args) {
        double a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.print("First numb = ");
        a = sc.nextDouble();
        System.out.print("Second numb = ");
        b = sc.nextDouble();
        System.out.print("Third numb = ");
        c = sc.nextDouble();
        numb = addNumb(a, b);
        System.out.println(a + " + " + b + " = " + numb);
        numb = subNumb(a, b);
        System.out.println(a + " - " + b + " = " + numb);
        numb = multNumb(b, c);
        System.out.println(b + " * " + c + " = " + numb);
        numb = divNumb(b, c);
        System.out.println(b + " / " + c + " = " + numb);
    }

    public static double addNumb(double a, double b) {
        return (a + b);
    }

    public static double subNumb(double a, double b){
        return (a - b);
    }

    public static double multNumb(double a, double b){
        return (a * b);
    }

    public static double divNumb(double a, double b){
        return (a / b);
    }
}
