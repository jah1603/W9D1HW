import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class GenerationDataTest {

    GenerationData generationData;

    @Before
    public void before() {
        ArrayList<String> names = new ArrayList<String>();
        generationData = new GenerationData();
        String name1 = "Vladimir Putin";
        String name2 = "Angela Merkel";
        String name3 = "Donald Trump";
        String name4 = "Theresa May";
        String name5 = "Emmanuel Macron";
        String name6 = "Alexis Tsirpas";
        String name7 = "Mario Draghi";
        String name8 = "Donald Tusk";
        String name9 = "Justin Trudeau";
        generationData.getNames().add(name1);
        generationData.getNames().add(name2);
        generationData.getNames().add(name3);
        generationData.getNames().add(name4);
        generationData.getNames().add(name5);
        generationData.getNames().add(name6);
        generationData.getNames().add(name7);
        generationData.getNames().add(name8);
        generationData.getNames().add(name9);
    }

    @Test
    public void hasNames(){
        assertEquals("Vladimir Putin", generationData.getNames().get(0));
    }

}

