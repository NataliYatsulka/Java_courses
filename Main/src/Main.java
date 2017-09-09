import java.util.ArrayList;
import java.util.Random;

/**
 * Created by nyatsulk on 9/9/17.
 */
public class Main {

//    private static String[][] mobiles = {
//            {"Iphone", "1234567"},
//            {"Iphone", "1234567"},
//            {"Iphone", "1234567"}
//    };

//    private static Mobile[] mobiles = new Mobile[3];

    private static ArrayList<Mobile> mobiles = new ArrayList<>();
    public static Random r = new Random();
//    public static void main(String[] args){
//       mobiles[0] = new Mobile(123, "Sumsung");
//       mobiles[1] = new Mobile(1234, "Sumsung1");
//       mobiles[2] = new Mobile(1235679, "Sumsung2");
//
//       for(Mobile m: mobiles)
//           System.out.println(m.getNumber() + " " + m.getName());
    public static void main(String[] args){
        for(int i = 0; i < 300; i++){
            mobiles.add(new Mobile(r.nextInt(123465879), "aaaa"));
        }
        for(Mobile m: mobiles){
            System.out.println(m.getName()+ " " + m.getNumber());
        }
    }


}
