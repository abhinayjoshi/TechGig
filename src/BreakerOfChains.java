import java.util.ArrayList;
import java.util.Random;

public class BreakerOfChains {

    public static void main(String[] args) {
        InputReader inputReader = new InputReader();
        String[] competitors = inputReader.getCompetitors();

        ArrayList<CompetingMessage> competingMessages = new ArrayList<>();
        ArrayList<Competitors> competitors1ist = new ArrayList<>();
        ArrayList<String> competitorsNames1ist = new ArrayList<>();
        for (int i = 0; i < competitors.length; i++) {

            Competitors comp = new Competitors();
            comp.name = competitors[i];
            comp.allies = 0;
            competitors1ist.add(comp);
            competitorsNames1ist.add(comp.name);

            ArrayList<String> kingdoms = new ArrayList<>();
            kingdoms.add("LAND");
            kingdoms.add("WATER");
            kingdoms.add("ICE");
            kingdoms.add("AIR");
            kingdoms.add("FIRE");
            kingdoms.add("SPACE");
            kingdoms.remove(competitors[i].toUpperCase());
            for (int j = 0; j < 5; j++) {
                CompetingMessage competingMessage = new CompetingMessage();
                competingMessage.sender = competitors[i];
                competingMessage.receiver = kingdoms.remove(0);
                competingMessage.message = RandomMessage.getRandom();
                competingMessages.add(competingMessage);
            }

        }

        for (int j = 0; j < 6; j++) {
            int rnd = new Random().nextInt(competingMessages.size());
            CompetingMessage competingMessage = new CompetingMessage();
            competingMessage = competingMessages.remove(rnd);
            InputMessages inputMessages = new InputMessages();
            inputMessages.kingdoms = competingMessage.sender;
            inputMessages.message = competingMessage.message;
//            if(!competitorsNames1ist.contains(competingMessage.receiver) && competitors1ist != null)) {
//                Boolean value = DecodeSecretMessage.decodeSecretMessage(inputMessages);
//                if (value) {
//                    Competitors comp = new Competitors();
//                    ArrayList<String> ally = new ArrayList<>();
//                    ally.add(competingMessage.sender);
//                 //   comp = competitors1ist.removeIf(competitorsNames1ist.)
//                    int temp = comp.allies;
//                    comp.allies = temp + 1;
//                    competitors1ist.add(comp);
//                }
//            }
        }

    }
}
