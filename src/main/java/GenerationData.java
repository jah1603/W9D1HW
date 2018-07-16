import java.util.ArrayList;

public class GenerationData {

    private ArrayList<String> names;

    public GenerationData(){
        this.names = new ArrayList<String>();
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }

    public void addName(String name){
        this.names.add(name);
    }
}
