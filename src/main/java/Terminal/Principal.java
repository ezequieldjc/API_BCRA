package Terminal;

import com.google.gson.Gson;

public class Principal {

    public static void main_v2 (String[] args){

        Principal a = new Principal();
        //a.serializeUser();
        a.deserializeUser();

    }
    //serializar es transformar JAVA -> JSON
    private static void serializeUser(){
        User user = new User("ezequiel.djc@gmail.com", "Ezequiel",27, true);
        Gson gson = new Gson();
        String json = gson.toJson(user);
        System.out.println(json);
    }

    //deserializar es tranformar JSON->JAVA
    private static void deserializeUser(){
        String userJson = "{'name':'Ezequiel','email':'ezequiel.djc@gmail.com','id':25,'isDeveloper':false}";
        Gson gson = new Gson();
        User u = gson.fromJson(userJson, User.class);
        System.out.println(u.getEmail());
        System.out.println(u.getName());
        System.out.println(u.getId());
        System.out.println(u.isDeveloper());


    }
}
