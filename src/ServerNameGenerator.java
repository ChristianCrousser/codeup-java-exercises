import java.util.Arrays;

public class ServerNameGenerator {
    private static String[] adjectives = {"Aggressive", "Agreeable", "Ambitious", "Brave", "Calm", "Delightful", "Eager", "Faithful", "Beautiful", "Fancy"};

    private static String[] nouns = {"Dog", "Cat", "Mouse", "Bird", "Lizard", "Ferret", "Fish", "Monkey", "Chicken", "Horse"};

    private static String randomElement(String[] strings) {
        int sng = (int) (Math.random() * strings.length);
        return strings[sng];
        //sng = Server Name Generator. It's like RNG.
    }

    public static String generator(String[] strings1, String[] strings2) {
        String adj = randomElement(strings1);
        String noun = randomElement(strings2);
        String generatedName = adj + " - " + noun;
        return generatedName;
    }
    public static void main(String[] args) {
        System.out.println("Here is your server name: ");
        System.out.println(generator(adjectives, nouns));
    }
}
