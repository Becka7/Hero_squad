import java.util.ArrayList;

public class Squad {
    private String name;
    private  String cause;
    private int maxsize;
    private static ArrayList<Squad>mInstances=new ArrayList<>();

    public Squad(String name, String cause,int maxsize){
        this.name=name;
        this.cause=cause;
        this.maxsize=maxsize;
        this.mInstances.add(this);
    }

    public String getName() {
        return name;
    }

    public String getCause() {
        return cause;
    }

    public void setMaxsize(int maxsize) {
        this.maxsize = maxsize;
    }

    public static ArrayList<Squad> getAll() {
        return mInstances;
    }
}

