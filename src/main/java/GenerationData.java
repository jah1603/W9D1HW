import java.util.ArrayList;
import java.util.Random;

public class GenerationData {

    private ArrayList<String> names;

    public GenerationData() {
        this.names = new ArrayList<String>();
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }

    public void addName(String name) {
        this.names.add(name);
    }

    public String getRandomName() {
        String randomname = names.remove((int) (Math.random() * names.size()));
        return randomname;
    }

    public String getTwoNames() {
        String randomname = names.remove((int) (Math.random() * names.size()));
        String randomname2 = names.remove((int) (Math.random() * names.size()));
        return randomname + " and " + randomname2;
    }

    public String getThreeNames() {
        String randomname = names.remove((int) (Math.random() * names.size()));
        String randomname2 = names.remove((int) (Math.random() * names.size()));
        String randomname3 = names.remove((int) (Math.random() * names.size()));
        return randomname + ", " + randomname2 + " and " + randomname3;


    }

    public String getFourNames() {
        String randomname = names.remove((int) (Math.random() * names.size()));
        String randomname2 = names.remove((int) (Math.random() * names.size()));
        String randomname3 = names.remove((int) (Math.random() * names.size()));
        String randomname4 = names.remove((int) (Math.random() * names.size()));
        return randomname + ", " + randomname2 + ", " + randomname3 + " and " + randomname4;
    }
}
