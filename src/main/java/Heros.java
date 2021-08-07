import java.util.ArrayList;

public class Heros {
    private String name;
    private int age;
    private String power;
    private String weakness;
    private static ArrayList<Heros>mInstance= new ArrayList<>();


    public Heros(String name,int age ,String power,String weakness){
        this.name=name;
        this.age=age;
        this.power=power;
        this.weakness=weakness;
        this.mInstance.add(this);

    }
    public String getName() {return name;}

    public int getAge(){ return age;}

    public String getPower(){ return power;}

    public String getWeakness() {return weakness;}

    public static ArrayList<Heros> getAll(){return mInstance;}


}
