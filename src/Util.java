public class Util {
    public static String getAnimal(String kingdom){
        if (kingdom.toUpperCase().equals("LAND")){
            return "panda";
        }
        if (kingdom.toUpperCase().equals("WATER")){
            return "octopus";
        }
        if (kingdom.toUpperCase().equals("ICE")){
            return "mammoth";
        }
        if (kingdom.toUpperCase().equals("AIR")){
            return "owl";
        }
        if (kingdom.toUpperCase().equals("FIRE")){
            return "dragon";
        }
        if (kingdom.toUpperCase().equals("SPACE")){
            return "gorilla";
        }
        return null;
    }
}
