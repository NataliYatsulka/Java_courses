/**
 * Created by nyatsulk on 9/9/17.
 */
public class Mobile {
    private int number;
    private String name;

    public Mobile(int number, String name){
        this.name = name;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
