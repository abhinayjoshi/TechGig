import java.util.HashMap;

public class DecodeSecretMessage {

    public static Boolean decodeSecretMessage(InputMessages inputMessages) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for ( int i = 0; i < inputMessages.message.length(); i++){
            hashMap.merge(inputMessages.message.toLowerCase().charAt(i), 1, Integer::sum);
        }
        String animal = Util.getAnimal(inputMessages.kingdoms);
        for ( int i = 0; i < animal.length(); i++){
            if (hashMap.containsKey(animal.charAt(i))){
                int value = hashMap.get(animal.charAt(i));
                hashMap.put(animal.charAt(i), value-1);
            }
            else return false;
        }
        return true;
    }
}
