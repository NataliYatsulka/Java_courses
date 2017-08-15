import java.util.Formatter;
import java.util.Scanner;

/**
 * Created by nyatsulk on 8/15/17.
 */
public class formatter {
    static Formatter x;
    static Scanner scn;

    public static void main(String args[]){
        try{
            x = new Formatter("res//1.txt");
            scn = new Scanner(System.in);
            System.out.println("How old are you?");
            String a = scn.next();
            System.out.println("What is your name?");
            String b = scn.next();
            System.out.println("Where are you from?");
            String c = scn.next();
            x.format("My name is %s, I'm %d years old, I live in %s", b, a, c);
            x.close();
        }catch (Exception e){};
    }
}
