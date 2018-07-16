import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

import static spark.Spark.staticFileLocation;
import static spark.route.HttpMethod.get;

public class GenerationDataController {
    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        ArrayList<String> names = new ArrayList<>();
        GenerationData generationData = new GenerationData();
        generationData.setNames(names);
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
        String onename = generationData.getRandomName();
        String twonames = generationData.getTwoNames();
        String threenames = generationData.getThreeNames();
        String fournames = generationData.getFourNames();



        get("/one", (req, res) -> {
            HashMap<String, Object> model = new HashMap<>();
            model.put("onename", onename);
            return new ModelAndView(model, "newname.vtl");
        }, velocityTemplateEngine);

    }}
