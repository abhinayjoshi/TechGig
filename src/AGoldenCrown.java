import java.util.HashMap;
import java.util.HashSet;

public class AGoldenCrown {

    public static void main(String[] args) {
        InputReader inputReader = new InputReader();
        System.out.print("Enter the number of secret messages you want to send : ");
        int numberOfMessages = inputReader.nextInt();
        HashSet<String> set = new HashSet<>();
        InputMessages inputMessages;
        for(int i = 0; i < numberOfMessages; i++){
            inputMessages = inputReader.fullLine();
            Boolean sh = DecodeSecretMessage.decodeSecretMessage(inputMessages);
            if (sh && !set.contains(inputMessages.kingdoms)){
                set.add(inputMessages.kingdoms);
            }
        }
        System.out.println("Who is the ruler of Southeros?");
        if ( set.size() > 2){
            System.out.println("King Shan");
            System.out.println("Allies of Ruler? ");
            System.out.println(set);
        }
        else {
            System.out.println("None");
            System.out.println("Allies of Ruler? ");
            System.out.println("None");
        }

    }

}
