import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;
public class App {
    public static void main(String[] args) {

        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(new HashMap(), "squad.hbs");
        }, new HandlebarsTemplateEngine());

        get("/hero.hbs", (request, response) -> {
            Heros heros = new Heros("thor", 13, "Hammer", "cake");
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(new HashMap(), "hero.hbs");
        }, new HandlebarsTemplateEngine());

        get("/heroform.hbs", (request, response) -> {
//            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(new HashMap(), "heroform.hbs");
        }, new HandlebarsTemplateEngine());






//        get("/heroform.hbs", (request, response) -> {
//            Heros heros = new Heros("thor", 13, "Hammer", "cake");
//            Map<String, Object> model = new HashMap<String, Object>();
//            ArrayList myHerosArraylist = Heros.getAll();
//            model.put("myHeros", myHerosArraylist);
//            return new ModelAndView(new HashMap(), "heroform.hbs");
//        }, new HandlebarsTemplateEngine());


        post("/hero.hbs", (request, response) -> {
            Heros heros = new Heros("name", Integer.parseInt("age"), "power", "weakness");
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("name");
            String age = request.queryParams("age");
            String power = request.queryParams("power");
            String weakness = request.queryParams("weakness");
            return new ModelAndView(model, "heros.hbs");
        }, new HandlebarsTemplateEngine());

    }


}





