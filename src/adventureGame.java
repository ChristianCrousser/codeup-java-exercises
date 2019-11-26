import java.util.Random;
import java.util.Scanner;

public class adventureGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();

        // Player attributes
        int heroHealth = 100;
        int heroArmor = 25;
        int heroAttack = 25;
        int heroPotion = 5;
        boolean wearingHelm = false;

        // CPU attributes
        int actualCannibalLaBeoufHealth = 50;
        int actualCannibalLaBeoufArmor = 0;
        int actualCannibalLaBeoufAttack = 10;
        String actualCannibalLaBeoufName = "The Cannibal";

        // CPU attributes
        int darkKnightHealth = 100;
        int darkKnightArmor = 25;
        int darkKnightAttack = 15;
        String darkKnightName = "Death Knight";

        // CPU attributes
        int vampireLordHealth = 200;
        int vampireLordArmor = 50;
        int vampireLordAttack = 20;
        String vampireLordName = "Lord of the Castle";

        // CPU attributes
        int dragonHealth = 300;
        int dragonArmor = 0;
        int dragonAttack = 25;
        String dragonName = "Dragon";


        String heroName = "";


        System.out.println("          <|\n" +
                "           A             \n" +
                "          /.\\       \n" +
                "     <|  [\"\"M#      \n" +
                "      A   | #              The Castle on the Cliff\n" +
                "     /.\\ [\"\"M#            \n" +
                "    [\"\"M# | #  U\"U#U                 \n" +
                "     | #  | #  \\ .:/    \n" +
                "     | #  | #___| #     \n" +
                "     | \"--'     .-\"     \n" +
                "   |\"-\"-\"-\"-\"-#-#-##    \n" +
                "   |     # ## ######     \n" +
                "    \\       .::::'/     \n" +
                "     \\      ::::'/      \n" +
                "   :8a|    # # ##      \n" +
                "   ::88a      ###       \n" +
                "  ::::888a  8a ##::.    \n" +
                "  ::::::888a88a[]::::\n" +
                " :::::::::SUNDOGa8a::::. ..              \n" +
                " :::::8::::888:Y8888:::::::::...      \n" +
                "::':::88::::888::Y88a______________________________________________________\n" +
                ":: ::::88a::::88a:Y88a                                  __---__-- __\n" +
                "' .: ::Y88a:::::8a:Y88a                            __----_-- -------_-__\n" +
                "  :' ::::8P::::::::::88aa.                   _ _- --  --_ --- __  --- __--\n" +
                ".::  :::::::::::::::::::Y88as88a...s88aa.");

        System.out.println("You see a castle in the distance, something tells you there is treasure and adventure\n");
        System.out.println("Are you ready to start the game? yes or no");
        String userResponse = sc.nextLine();

        if (userResponse.trim().equalsIgnoreCase("yes")) {
            System.out.println("You are a hero of great standing in the local village, but what is your name?");
            heroName = sc.nextLine();
            if (heroName.trim().equalsIgnoreCase("cheater")) {
                heroHealth = 10000;
                heroArmor = 10000;
                heroAttack = 10000;
            }
            System.out.println("                             ___\n" +
                    "                            / : \\\n" +
                    "                            |===|\n" +
                    "                            >._.<\n" +
                    "                        .=-<     >-=.\n" +
                    "                       /.'`(`-+-')'`.\\\n" +
                    "                     _/`.__/  :  \\__.'\\_\n" +
                    "                    ( `._/\\`. : .'/\\_.' )\n" +
                    "                     >-(_) \\ `:' / (_)-<\n" +
                    "                     | |  / \\___/ \\  | |\n" +
                    "                     )^( | .' : `. | )^(\n" +
                    "                    |  _\\|`-._:_.-'| \\  |\n" +
                    "                    \"-<\\)| :  |  : |  \"-\"\n" +
                    "                      (\\\\| : / \\ : |\n" +
                    "                        \\\\-:-| |-:-')\n" +
                    "                         \\\\:_/ \\_:_/\n" +
                    "                         |\\\\_| |_:_|\n" +
                    "                         (;\\\\/ \\__;)\n" +
                    "                         |: \\\\  | :|\n" +
                    "                         \\: /\\\\ \\ :/\n" +
                    "                         |==| \\\\|==|\n" +
                    "                        /v-'(  \\\\`-v\\\n" +
                    "                       // .-'   \\\\. \\\\\n" +
                    "                       `-'       \\\\`-'    Hero\n" +
                    "                                  \\|");
        } else {
            System.out.println("Ok, I thought knights were supposed to be brave...");
            System.exit(0);
        }
        System.out.println("You must now approach the castle, the walk is long and has many turns and almost twist your ankle when you slip off of one of the rocks.\n However you've made it. Do you want to cross the drawbridge?");
        String drawBridgeChoice = sc.nextLine();
        if (drawBridgeChoice.trim().equalsIgnoreCase("yes")) {
            System.out.println("                           .-.\n" +
                    "                              \\\\\\V/// (o.o)\n" +
                    "                              #######  |=|\n" +
                    "                             //6 , 6\\\\  Y\n" +
                    "                              \\  =  /   |\n" +
                    "                             .-:---:---'B\n" +
                    "              (             /   `@` ,--'|\n" +
                    "               )  )        ( <|'   '|   |\n" +
                    "           ______(____      \\ \\__.__/   |\n" +
                    "          (___________)      `/<<<<<\\   |\n" +
                    "           /         \\       (>>>>>>>)  |\n" +
                    "          /           \\      `\"|\"|\"|\"`  |\n" +
                    "         |             |       |_| |    |\n" +
                    "     ____\\             /____  _(_| |_   |\n" +
                    "    ()____'.__     __.'____()(___|___)  |\n" +
                    "         .'` .'```'. `-.\n" +
                    "        ().'`       `'.()");
            System.out.println("Before you lays a man with a cauldron, there are arms and legs of his victims spinning around as he mixes.\n He looks up at you and says \"You look delicious!\" You know you must battle the actual cannibal!");
        } else {
            System.out.println("You have slipped and fell off the cliff, You have died!");
            System.out.println("                      ,____\n" +
                    "                      |---.\\\n" +
                    "              ___     |    `\n" +
                    "             / .-\\  ./=)\n" +
                    "            |  |\"|_/\\/|\n" +
                    "            ;  |-;| /_|\n" +
                    "           / \\_| |/ \\ |\n" +
                    "          /      \\/\\( |\n" +
                    "          |   /  |` ) |\n" +
                    "          /   \\ _/    |\n" +
                    "         /--._/  \\    |\n" +
                    "         `/|)    |    /\n" +
                    "           /     |   |\n" +
                    "         .'      |   |\n" +
                    "        /         \\  |\n" +
                    "       (_.-.__.__./  /");
            System.exit(0);
        }

        while (heroHealth > 0 && actualCannibalLaBeoufHealth > 0) {
            System.out.println(heroName + "'s Health: " + heroHealth + ", Armor: " + heroArmor + ", Potions: " + heroPotion);
            System.out.println(actualCannibalLaBeoufName + "'s Health: " + actualCannibalLaBeoufHealth + ", Armor: " + actualCannibalLaBeoufArmor);
            System.out.println("Attack, Drink Potion, Run");
            String choice = sc.nextLine();
            if (choice.trim().equalsIgnoreCase("attack")) {
                int[] updatedEnemyStats = attack(actualCannibalLaBeoufHealth, actualCannibalLaBeoufArmor, heroAttack);
                System.out.println("You hit the enemy for: " + (updatedEnemyStats[2]));
                actualCannibalLaBeoufHealth = updatedEnemyStats[0];
                actualCannibalLaBeoufArmor = updatedEnemyStats[1];
            } else if (choice.trim().equalsIgnoreCase("potion") || choice.trim().equalsIgnoreCase("drink potion")) {
                int[] updatedHeroStats = drinkPotion(heroPotion, heroHealth);
                heroHealth = updatedHeroStats[0];
                heroPotion = updatedHeroStats[1];
            } else if (choice.trim().equalsIgnoreCase("run")) {
                heroHealth = 0;
                System.out.println("                      ,____\n" +
                        "                      |---.\\\n" +
                        "              ___     |    `\n" +
                        "             / .-\\  ./=)\n" +
                        "            |  |\"|_/\\/|\n" +
                        "            ;  |-;| /_|\n" +
                        "           / \\_| |/ \\ |\n" +
                        "          /      \\/\\( |\n" +
                        "          |   /  |` ) |\n" +
                        "          /   \\ _/    |\n" +
                        "         /--._/  \\    |\n" +
                        "         `/|)    |    /\n" +
                        "           /     |   |\n" +
                        "         .'      |   |\n" +
                        "        /         \\  |\n" +
                        "       (_.-.__.__./  /");
                System.out.println("You are dead!");
            } else {
                continue;
            }

            int[] updatedHeroStats = attack(heroHealth, heroArmor, actualCannibalLaBeoufAttack);
            System.out.println("The enemy has hit you for: " + (updatedHeroStats[2]));
            heroHealth = updatedHeroStats[0];
            heroArmor = updatedHeroStats[1];

        }
        if (heroHealth <= 0) {
            System.out.println("                      ,____\n" +
                    "                      |---.\\\n" +
                    "              ___     |    `\n" +
                    "             / .-\\  ./=)\n" +
                    "            |  |\"|_/\\/|\n" +
                    "            ;  |-;| /_|\n" +
                    "           / \\_| |/ \\ |\n" +
                    "          /      \\/\\( |\n" +
                    "          |   /  |` ) |\n" +
                    "          /   \\ _/    |\n" +
                    "         /--._/  \\    |\n" +
                    "         `/|)    |    /\n" +
                    "           /     |   |\n" +
                    "         .'      |   |\n" +
                    "        /         \\  |\n" +
                    "       (_.-.__.__./  /");
            System.out.println("You are dead!");
        } else {
            System.out.println("88.._|      | `-.  | `.  -_-_ _-_  _-  _- -_ -  .'|   |.'|     |  _..88\n" +
                    "88   `-.._  |    |`!  |`.  -_ -__ -_ _- _-_-  .'  |.;'   |   _.!-'|  88\n" +
                    "88      | `-!._  |  `;!  ;. _______________ ,'| .-' |   _!.i'     |  88\n" +
                    "88..__  |     |`-!._ | `.| |_______________||.\"'|  _!.;'   |     _|..88\n" +
                    "88   |``\"..__ |    |`\";.| i|_|MMMMMMMMMMM|_|'| _!-|   |   _|..-|'    88\n" +
                    "88   |      |``--..|_ | `;!|l|MMoMMMMoMMM|1|.'j   |_..!-'|     |     88\n" +
                    "88   |      |    |   |`-,!_|_|MMMMP'YMMMM|_||.!-;'  |    |     |     88\n" +
                    "88___|______|____!.,.!,.!,!|d|MMMo * loMM|p|,!,.!.,.!..__|_____|_____88\n" +
                    "88      |     |    |  |  | |_|MMMMb,dMMMM|_|| |   |   |    |      |  88\n" +
                    "88      |     |    |..!-;'i|r|MPYMoMMMMoM|r| |`-..|   |    |      |  88\n" +
                    "88      |    _!.-j'  | _!,\"|_|M)(MMMMoMMM|_||!._|  `i-!.._ |      |  88\n" +
                    "88     _!.-'|    | _.\"|  !;|1|MbdMMoMMMMM|l|`.| `-._|    |``-.._  |  88\n" +
                    "88..-i'     |  _.''|  !-| !|_|MMMoMMMMoMM|_|.|`-. | ``._ |     |``\"..88\n" +
                    "88   |      |.|    |.|  !| |u|MoMMMMoMMMM|n||`. |`!   | `\".    |     88\n" +
                    "88   |  _.-'  |  .'  |.' |/|_|MMMMoMMMMoM|_|! |`!  `,.|    |-._|     88\n" +
                    "88  _!\"'|     !.'|  .'| .'|[@]MMMMMMMMMMM[@] \\|  `. | `._  |   `-._  88\n" +
                    "88-'    |   .'   |.|  |/| /                 \\|`.  |`!    |.|      |`-88\n" +
                    "88      |_.'|   .' | .' |/                   \\  \\ |  `.  | `._    |  88\n" +
                    "88     .'   | .'   |/|  /                     \\ |`!   |`.|    `.  |  88\n" +
                    "88  _.'     !'|   .' | /                       \\|  `  |  `.    |`.|  88");
            System.out.println("You have defeated the cannibal, as he lays mortally wounded he whispers to you \"Caliburn...\", his cauldron now grows colder has you proceed into the castle. \n");
            System.out.println("Would you like to check your current status?");
            String statusCheck = sc.nextLine();
            if (statusCheck.trim().equalsIgnoreCase("yes")) {
                System.out.println(heroName + "'s Health: " + heroHealth + ", Armor: " + heroArmor + ", Potions: " + heroPotion);
            }
            System.out.println("Drink a potion before proceeding?");
            String potionCheck = sc.nextLine();
            if (potionCheck.trim().trim().equalsIgnoreCase("yes")) {
                int[] updatedHeroStats = drinkPotion(heroPotion, heroHealth);
                heroHealth = updatedHeroStats[0];
                heroPotion = updatedHeroStats[1];
                System.out.println(heroName + "'s Health: " + heroHealth + ", Armor: " + heroArmor + ", Potions: " + heroPotion);
            }
            System.out.println("                   _.--.    .--._\n" +
                    "                 .\"  .\"      \".  \".\n" +
                    "                ;  .\"    /\\    \".  ;\n" +
                    "                ;  '._,-/  \\-,_.`  ;\n" +
                    "                \\  ,`  / /\\ \\  `,  /\n" +
                    "                 \\/    \\/  \\/    \\/\n" +
                    "                 ,=_    \\/\\/    _=,\n" +
                    "                 |  \"_   \\/   _\"  |\n" +
                    "                 |_   '\"-..-\"'   _|\n" +
                    "                 | \"-.        .-\" |\n" +
                    "                 |    \"\\    /\"    |\n" +
                    "                 |      |  |      |\n" +
                    "         ___     |      |  |      |     ___\n" +
                    "     _,-\",  \",   '_     |  |     _'   ,\"  ,\"-,_\n" +
                    "   _(  \\  \\   \\\"=--\"-.  |  |  .-\"--=\"/   /  /  )_\n" +
                    " ,\"  \\  \\  \\   \\      \"-'--'-\"      /   /  /  /  \".\n" +
                    "!     \\  \\  \\   \\                  /   /  /  /     !\n" +
                    ":      \\  \\  \\   \\                /   /  /  /       :");
            System.out.println("Before you lays a knight in black armor, his presence has a dark aura around him and he seems unfazed as you walk closer to him. \n");
            System.out.println("What do you want to say to the knight?");
            String herosChat = sc.nextLine();
            System.out.println("You exclaim to the knight:\"" + herosChat + "\"\n");
            if (herosChat.trim().equalsIgnoreCase("give me caliburn")) {
                System.out.println("The knight seems bewildered \'As you wish, brave one\". He places his sword on the ground and walks out of the castle.\n");
                System.out.println("With Caliburn in your possession, you feel more powerful! You have gained 20 attack power");
                heroAttack += 20;
                System.out.println("88.._|      | `-.  | `.  -_-_ _-_  _-  _- -_ -  .'|   |.'|     |  _..88\n" +
                        "88   `-.._  |    |`!  |`.  -_ -__ -_ _- _-_-  .'  |.;'   |   _.!-'|  88\n" +
                        "88      | `-!._  |  `;!  ;. _______________ ,'| .-' |   _!.i'     |  88\n" +
                        "88..__  |     |`-!._ | `.| |_______________||.\"'|  _!.;'   |     _|..88\n" +
                        "88   |``\"..__ |    |`\";.| i|_|MMMMMMMMMMM|_|'| _!-|   |   _|..-|'    88\n" +
                        "88   |      |``--..|_ | `;!|l|MMoMMMMoMMM|1|.'j   |_..!-'|     |     88\n" +
                        "88   |      |    |   |`-,!_|_|MMMMP'YMMMM|_||.!-;'  |    |     |     88\n" +
                        "88___|______|____!.,.!,.!,!|d|MMMo * loMM|p|,!,.!.,.!..__|_____|_____88\n" +
                        "88      |     |    |  |  | |_|MMMMb,dMMMM|_|| |   |   |    |      |  88\n" +
                        "88      |     |    |..!-;'i|r|MPYMoMMMMoM|r| |`-..|   |    |      |  88\n" +
                        "88      |    _!.-j'  | _!,\"|_|M)(MMMMoMMM|_||!._|  `i-!.._ |      |  88\n" +
                        "88     _!.-'|    | _.\"|  !;|1|MbdMMoMMMMM|l|`.| `-._|    |``-.._  |  88\n" +
                        "88..-i'     |  _.''|  !-| !|_|MMMoMMMMoMM|_|.|`-. | ``._ |     |``\"..88\n" +
                        "88   |      |.|    |.|  !| |u|MoMMMMoMMMM|n||`. |`!   | `\".    |     88\n" +
                        "88   |  _.-'  |  .'  |.' |/|_|MMMMoMMMMoM|_|! |`!  `,.|    |-._|     88\n" +
                        "88  _!\"'|     !.'|  .'| .'|[@]MMMMMMMMMMM[@] \\|  `. | `._  |   `-._  88\n" +
                        "88-'    |   .'   |.|  |/| /                 \\|`.  |`!    |.|      |`-88\n" +
                        "88      |_.'|   .' | .' |/                   \\  \\ |  `.  | `._    |  88\n" +
                        "88     .'   | .'   |/|  /                     \\ |`!   |`.|    `.  |  88\n" +
                        "88  _.'     !'|   .' | /                       \\|  `  |  `.    |`.|  88");
                System.out.println("The knight is now behind you. You see a hall leading further into the castle.");
                System.out.println("Would you like to check your current status?");
                statusCheck = sc.nextLine();
                if (statusCheck.trim().equalsIgnoreCase("yes")) {
                    System.out.println(heroName + "'s Health: " + heroHealth + ", Armor: " + heroArmor + ", Potions: " + heroPotion);
                }
                System.out.println("Drink a potion before proceeding?");
                potionCheck = sc.nextLine();
                if (potionCheck.trim().equalsIgnoreCase("yes")) {
                    int[] updatedHeroStats = drinkPotion(heroPotion, heroHealth);
                    heroHealth = updatedHeroStats[0];
                    heroPotion = updatedHeroStats[1];
                    System.out.println(heroName + "'s Health: " + heroHealth + ", Armor: " + heroArmor + ", Potions: " + heroPotion);
                }
                System.out.println("   ,-' ;  ! `-." + "        ,-' ;  ! `-.\n" +
                        "  / :  !  :  . \\" + "      / :  !  :  . \\\n" +
                        " |_ ;   __:  ;  |" + "    |_ ;   __:  ;  |\n" +
                        " )| .  :)(.  !  |" + "    )| .  :)(.  !  |\n" +
                        " |\"    (##)  _  |" + "    |\"    (##)  _  |\n" +
                        " |  :  ;`'  (_) (" + "    |  :  ;`'  (_) (\n" +
                        " |  :  :  .     |" + "    |  :  :  .     |\n" +
                        " )_ !  ,  ;  ;  |" + "    )_ !  ,  ;  ;  |\n" +
                        " || .  .  :  :  |" + "    || .  .  :  :  |\n" +
                        " |\" .  |  :  .  |" + "    |\" .  |  :  .  |\n" +
                        " |XOXXOX_;----._|" + "    |OXOOX_;----.__|");
                System.out.println("There are two paths before you, the doors are labeled with unreadable runes. Which path will you take? Left or Right");
                String pathChoice = sc.nextLine();
                if (pathChoice.trim().equalsIgnoreCase("left")) {
                    System.out.println("                      .      .       .       .\n" +
                            "  .   .       .          .      . .      .         .          .    .\n" +
                            "         .       .         .    .   .         .         .            .\n" +
                            "    .   .    .       .         . . .        .        .     .    .\n" +
                            " .          .   .       .       . .      .        .  .              .\n" +
                            "      .  .    .  .       .     . .    .       . .      .   .        .\n" +
                            " .   .       .    . .      .    . .   .      .     .          .     .\n" +
                            "    .            .    .     .   . .  .     .   .               .\n" +
                            "     .               .  .    .  . . .    .  .                 .\n" +
                            "                        . .  .  . . .  . .\n" +
                            "                            . . . . . .\n" +
                            "                              . . . .\n" +
                            "                               I . I\n" +
                            "                 _______________III_______________\n" +
                            "                /    .       .       .       .    \\\n" +
                            "               ( ~~~ .  ~~~  .  ~~~  .  ~~~  . ~~~ )\n" +
                            "                 \\SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS/\n" +
                            "                    \\ ======================= /\n" +
                            "                        \\SSSSSSSSSSSSSSSSS/\n" +
                            "                     ________\\       /________\n" +
                            "                    (=+=+=+=+=+=+=+=+=+=+=+=+=)\n" +
                            "                     ~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("There is a fountain before you, its water seems to be a light green, do you want to drink from the fountain?");
                    String fountainChoice = sc.nextLine();
                    if (fountainChoice.trim().equalsIgnoreCase("yes")) {
                        System.out.println("You feel revitalized!");
                        heroHealth = 150;
                    } else {
                        System.out.println("You walk away...");
                    }
                } else if (pathChoice.trim().equalsIgnoreCase("right")) {
                    System.out.println("                    ____...------------...____\n" +
                            "               _.-\"` /o/__ ____ __ __  __ \\o\\_`\"-._\n" +
                            "             .'     / /                    \\ \\     '.\n" +
                            "             |=====/o/======================\\o\\=====|\n" +
                            "             |____/_/________..____..________\\_\\____|\n" +
                            "             /   _/ \\_     <_o#\\__/#o_>     _/ \\_   \\\n" +
                            "             \\_________________\\####/_______________/\n" +
                            "              |===\\!/========================\\!/===|\n" +
                            "              |   |=|          .---.         |=|   |\n" +
                            "              |===|o|=========/     \\========|o|===|\n" +
                            "              |   | |         \\() ()/        | |   |\n" +
                            "              |===|o|======{'-.) A (.-'}=====|o|===|\n" +
                            "              | __/ \\__     '-.\\uuu/.-'    __/ \\__ |\n" +
                            "              |============= .'.'^'.'.=============|\n" +
                            "              |  _\\o/   __  {.' __  '.} _   _\\o/  _|\n" +
                            "              `\"\"\"\"-\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"-\"\"\"\"`");

                    System.out.println("There is a chest with spikes and a skull on it, do you wish to open it?");
                    String chestChoice = sc.nextLine();
                    if (chestChoice.trim().equalsIgnoreCase("yes")) {
                        System.out.println("              _..-..     \n" +
                                "            ,'      `.\n" +
                                "           /'       \\ \\\n" +
                                "          /:         \\ \\\n" +
                                "        ,;':._______...-'\\\n" +
                                "        \\:/-.._______..-_|\n" +
                                "         : :\\   `----'|'-;\n" +
                                "          \\ :\\    : : ;:/\n" +
                                "           \\ ``.   ; /;/\n" +
                                "            )   `.  /,'\n" +
                                "          ,'      `-' \\\n" +
                                "         /  .--.       )\n" +
                                "        /_.---._`._   /\n" +
                                "                `.__.'");
                        System.out.println("You see a helmet, it looks better than the one you are currently wearing however it is glowing strangely, do you want to wear it?");
                        String helmetChoice = sc.nextLine();
                        if (helmetChoice.trim().equalsIgnoreCase("yes")) {
                            wearingHelm = true;
                            System.out.println("You feel more protected!");
                            heroArmor += 50;
                        } else if (helmetChoice.trim().equalsIgnoreCase("no")) {
                            System.out.println("You walk away...");
                        }

                    } else if (chestChoice.trim().equalsIgnoreCase("no")) {
                        System.out.println("You walk away...");
                    }
                }

//                after Forked path
                System.out.println("88.._|      | `-.  | `.  -_-_ _-_  _-  _- -_ -  .'|   |.'|     |  _..88\n" +
                        "88   `-.._  |    |`!  |`.  -_ -__ -_ _- _-_-  .'  |.;'   |   _.!-'|  88\n" +
                        "88      | `-!._  |  `;!  ;. _______________ ,'| .-' |   _!.i'     |  88\n" +
                        "88..__  |     |`-!._ | `.| |_______________||.\"'|  _!.;'   |     _|..88\n" +
                        "88   |``\"..__ |    |`\";.| i|_|MMMMMMMMMMM|_|'| _!-|   |   _|..-|'    88\n" +
                        "88   |      |``--..|_ | `;!|l|MMoMMMMoMMM|1|.'j   |_..!-'|     |     88\n" +
                        "88   |      |    |   |`-,!_|_|MMMMP'YMMMM|_||.!-;'  |    |     |     88\n" +
                        "88___|______|____!.,.!,.!,!|d|MMMo * loMM|p|,!,.!.,.!..__|_____|_____88\n" +
                        "88      |     |    |  |  | |_|MMMMb,dMMMM|_|| |   |   |    |      |  88\n" +
                        "88      |     |    |..!-;'i|r|MPYMoMMMMoM|r| |`-..|   |    |      |  88\n" +
                        "88      |    _!.-j'  | _!,\"|_|M)(MMMMoMMM|_||!._|  `i-!.._ |      |  88\n" +
                        "88     _!.-'|    | _.\"|  !;|1|MbdMMoMMMMM|l|`.| `-._|    |``-.._  |  88\n" +
                        "88..-i'     |  _.''|  !-| !|_|MMMoMMMMoMM|_|.|`-. | ``._ |     |``\"..88\n" +
                        "88   |      |.|    |.|  !| |u|MoMMMMoMMMM|n||`. |`!   | `\".    |     88\n" +
                        "88   |  _.-'  |  .'  |.' |/|_|MMMMoMMMMoM|_|! |`!  `,.|    |-._|     88\n" +
                        "88  _!\"'|     !.'|  .'| .'|[@]MMMMMMMMMMM[@] \\|  `. | `._  |   `-._  88\n" +
                        "88-'    |   .'   |.|  |/| /                 \\|`.  |`!    |.|      |`-88\n" +
                        "88      |_.'|   .' | .' |/                   \\  \\ |  `.  | `._    |  88\n" +
                        "88     .'   | .'   |/|  /                     \\ |`!   |`.|    `.  |  88\n" +
                        "88  _.'     !'|   .' | /                       \\|  `  |  `.    |`.|  88");
                System.out.println("You feel an evil presence ahead...");
                System.out.println("Would you like to check your current status?");
                statusCheck = sc.nextLine();
                if (statusCheck.trim().equalsIgnoreCase("yes")) {
                    System.out.println(heroName + "'s Health: " + heroHealth + ", Armor: " + heroArmor + ", Potions: " + heroPotion);
                }
                System.out.println("Drink a potion before proceeding?");
                potionCheck = sc.nextLine();
                if (potionCheck.trim().equalsIgnoreCase("yes")) {
                    int[] updatedHeroStats = drinkPotion(heroPotion, heroHealth);
                    heroHealth = updatedHeroStats[0];
                    heroPotion = updatedHeroStats[1];
                    System.out.println(heroName + "'s Health: " + heroHealth + ", Armor: " + heroArmor + ", Potions: " + heroPotion);
                }
                System.out.println("                                  _.-.\n" +
                        "                                 ._.-.\\\n" +
                        "                    .^         _.-'=. \\\\\n" +
                        "                  .'  )    .-._.-=-..' \\'.\n" +
                        "               .'   .'   _.--._-='.'   |  `.  ^.\n" +
                        "             .'   .'    _`.-.`=-./'.-. / .-.\\ `. `.\n" +
                        "           .'    /      _.-=-=-/ | '._)`(_.'|   \\  `.\n" +
                        "          /    /|       _.--=.'  `. (.-v-.)/    |\\   \\\n" +
                        "        .'    / \\       _.-.' \\-.' `-..-..'     / \\   `.\n" +
                        "       /     /   `-.._ .-.'      `.'  \" \". _..-'  |    |\n" +
                        "      '      |    |   /   )        \\  /   \\   \\    \\    `.\n" +
                        "     /      /    /   /   /\\                \\   \\   |      \\\n" +
                        "    /      /    /  .'  .'\\ `.        .'     \\   |   \\      \\\n" +
                        "   /      /    /  /   /   \\  `-    -' .`.    .  \\    \\     |\n" +
                        "  |      /    / .''\\.'    | `.      .'   `.   \\  |    |    |\n" +
                        " .'     /    / /   |      |      .'/       `.- `./    /    |\n" +
                        " |     /    .-|   /--.    / `.    |    _.-''\\   |     |    \\\n" +
                        ".'    /  .-'  |  /    `-.|       .'\\_.'      `. |`.   |    |\n" +
                        "|    |.-'     / /       /           \\          \\ \\ `. \\     \\\n" +
                        "|    /       /  |      /             \\         |  `. `.|    |\n" +
                        "|   |       /   `.     |      `   .'  \\        /    \\  \\    /\n" +
                        "|   |      ///.-'.\\    |       \\ /    `\\      / /-.  \\ |    |\n" +
                        "|   /      \\\\\\\\    `    \\.-     |    `-.\\     |/   \\\\\\\\'.   |\n" +
                        " \\ |        \\\\\\|        |      / \\      |          //// |  /\n" +
                        " | |         '''        |     /   \\     |          |//  |  \\\n" +
                        " \\ |                    |.-  |     \\  .-|          ''   |  /\n" +
                        "  \\|                    /    |    / ` ../               / /\n" +
                        "                        |'   /    |    /               | /\n" +
                        "                        \\.'  |    | `./                |/\n" +
                        "                       | | | \\   .'  `.. \\\n" +
                        "                      / / / ._`. \\.'-. \\`/\n" +
                        "                      |/ / /  `'  `  |/|/\n" +
                        "                       \\|\\|\n");
                System.out.println("You have arrived in the Throne Room, there is a large winged figured in front of you, it is much scarier than your previous opponents.\n");
                System.out.println("\"Prepare yourself human, I have killed more people then you've ever met\" The winged figure says.");
                while (heroHealth > 0 && vampireLordHealth > 0) {
                    System.out.println(heroName + "'s Health: " + heroHealth + ", Armor: " + heroArmor + ", Potions: " + heroPotion);
                    System.out.println(vampireLordName + "'s Health: " + vampireLordHealth + ", Armor: " + vampireLordArmor);
                    System.out.println("Attack, Drink Potion, Run");
                    String choice = sc.nextLine();
                    if (choice.trim().equalsIgnoreCase("attack")) {
                        int[] updatedEnemyStats = attack(vampireLordHealth, vampireLordArmor, heroAttack);
                        System.out.println("You hit the enemy for: " + (updatedEnemyStats[2]));
                        vampireLordHealth = updatedEnemyStats[0];
                        vampireLordArmor = updatedEnemyStats[1];
                    } else if (choice.trim().equalsIgnoreCase("potion") || choice.trim().equalsIgnoreCase("drink potion")) {
                        int[] updatedHeroStats = drinkPotion(heroPotion, heroHealth);
                        heroHealth = updatedHeroStats[0];
                        heroPotion = updatedHeroStats[1];
                    } else if (choice.trim().equalsIgnoreCase("run")) {
                        heroHealth = 0;
                    } else {
                        continue;
                    }

                    int[] updatedHeroStats = attack(heroHealth, heroArmor, vampireLordAttack);
                    System.out.println("The enemy has hit you for: " + (updatedHeroStats[2]));
                    heroHealth = updatedHeroStats[0];
                    heroArmor = updatedHeroStats[1];

                }
                if (heroHealth <= 0) {
                    System.out.println("                      ,____\n" +
                            "                      |---.\\\n" +
                            "              ___     |    `\n" +
                            "             / .-\\  ./=)\n" +
                            "            |  |\"|_/\\/|\n" +
                            "            ;  |-;| /_|\n" +
                            "           / \\_| |/ \\ |\n" +
                            "          /      \\/\\( |\n" +
                            "          |   /  |` ) |\n" +
                            "          /   \\ _/    |\n" +
                            "         /--._/  \\    |\n" +
                            "         `/|)    |    /\n" +
                            "           /     |   |\n" +
                            "         .'      |   |\n" +
                            "        /         \\  |\n" +
                            "       (_.-.__.__./  /");
                    System.out.println("You are dead!");

                } else {
                    System.out.println("            ^^                   @@@@@@@@@\n" +
                            "       ^^       ^^            @@@@@@@@@@@@@@@\n" +
                            "                            @@@@@@@@@@@@@@@@@@              ^^\n" +
                            "                           @@@@@@@@@@@@@@@@@@@@\n" +
                            " ~~~~ ~~ ~~~~~ ~~~~~~~~ ~~ &&&&&&&&&&&&&&&&&&&& ~~~~~~~ ~~~~~~~~~~~ ~~~\n" +
                            " ~         ~~   ~  ~       ~~~~~~~~~~~~~~~~~~~~ ~       ~~     ~~ ~\n" +
                            "   ~      ~~      ~~ ~~ ~~  ~~~~~~~~~~~~~ ~~~~  ~     ~~~    ~ ~~~  ~ ~~\n" +
                            "   ~  ~~     ~         ~      ~~~~~~  ~~ ~~~       ~~ ~ ~~  ~~ ~\n" +
                            " ~  ~       ~ ~      ~           ~~ ~~~~~~  ~      ~~  ~             ~~\n" +
                            "       ~             ~        ~      ~      ~~   ~             ~");
                    System.out.printf("You have defeated your enemies and the castle lays empty. You have earned your place as lord of the castle.\n The treasure is yours, the throne is yours. All hail Lord %s\n\n", heroName);
                    if(wearingHelm == true){
                        System.out.println("Caliburn whispers to you. \"You must toss the cursed helmet to sea or you'll never be free.\"");
                        System.out.println("Do you want to throw the helmet?");
                        String helmThrow = sc.nextLine();
                        if(helmThrow.trim().equalsIgnoreCase("yes")){
                            System.out.println("You toss the helmet, you wouldn't want to upset Caliburn... You feel rejuvenated!");
                            heroHealth = 175;
                            System.out.println("                                               _   __,----'~~~~~~~~~`-----.__\n" +
                                    "                                        .  .    `//====-              ____,-'~`\n" +
                                    "                        -.            \\_|// .   /||\\\\  `~~~~`---.___./\n" +
                                    "                  ______-==.       _-~o  `\\/    |||  \\\\           _,'`\n" +
                                    "            __,--'   ,=='||\\=_    ;_,_,/ _-'|-   |`\\   \\\\        ,'\n" +
                                    "         _-'      ,='    | \\\\`.    '',/~7  /-   /  ||   `\\.     /\n" +
                                    "       .'       ,'       |  \\\\  \\_  \"  /  /-   /   ||      \\   /\n" +
                                    "      / _____  /         |     \\\\.`-_/  /|- _/   ,||       \\ /\n" +
                                    "     ,-'     `-|--'~~`--_ \\     `==-/  `| \\'--===-'       _/`\n" +
                                    "               '         `-|      /|    )-'\\~'      _,--\"'\n" +
                                    "                           '-~^\\_/ |    |   `\\_   ,^             /\\\n" +
                                    "                                /  \\     \\__   \\/~               `\\__\n" +
                                    "                            _,-' _/'\\ ,-'~____-'`-/                 ``===\\\n" +
                                    "                           ((->/'    \\|||' `.     `\\.  ,                _||\n" +
                                    "             ./                       \\_     `\\      `~---|__i__i__\\--~'_/\n" +
                                    "            <_n_                     __-^-_    `)  \\-.______________,-~'\n" +
                                    "             `B'\\)                  ///,-'~`__--^-  |-------~~~~^'\n" +
                                    "             /^>                           ///,--~`-\\\n" +
                                    "            `  `                                       ");
                            System.out.println("The ground shakes and you are suddenly staring at a 25 foot tall reptile with wings. You must fight to survive!");
                            while (heroHealth > 0 && dragonHealth > 0) {
                                System.out.println(heroName + "'s Health: " + heroHealth + ", Armor: " + heroArmor + ", Potions: " + heroPotion);
                                System.out.println(dragonName + "'s Health: " + dragonHealth + ", Armor: " + dragonArmor);
                                System.out.println("Attack, Drink Potion, Run");
                                String choice = sc.nextLine();
                                if (choice.trim().equalsIgnoreCase("attack")) {
                                    int[] updatedEnemyStats = attack(dragonHealth, dragonArmor, heroAttack);
                                    System.out.println("You hit the enemy for: " + (updatedEnemyStats[2]));
                                    dragonHealth = updatedEnemyStats[0];
                                    dragonArmor = updatedEnemyStats[1];
                                } else if (choice.trim().equalsIgnoreCase("potion") || choice.trim().equalsIgnoreCase("drink potion")) {
                                    int[] updatedHeroStats = drinkPotion(heroPotion, heroHealth);
                                    heroHealth = updatedHeroStats[0];
                                    heroPotion = updatedHeroStats[1];
                                } else if (choice.trim().equalsIgnoreCase("run")) {
                                    heroHealth = 0;
                                } else {
                                    continue;
                                }

                                int[] updatedHeroStats = attack(heroHealth, heroArmor, dragonAttack);
                                System.out.println("The enemy has hit you for: " + (updatedHeroStats[2]));
                                heroHealth = updatedHeroStats[0];
                                heroArmor = updatedHeroStats[1];

                            }
                            if (heroHealth <= 0) {
                                System.out.println("                      ,____\n" +
                                        "                      |---.\\\n" +
                                        "              ___     |    `\n" +
                                        "             / .-\\  ./=)\n" +
                                        "            |  |\"|_/\\/|\n" +
                                        "            ;  |-;| /_|\n" +
                                        "           / \\_| |/ \\ |\n" +
                                        "          /      \\/\\( |\n" +
                                        "          |   /  |` ) |\n" +
                                        "          /   \\ _/    |\n" +
                                        "         /--._/  \\    |\n" +
                                        "         `/|)    |    /\n" +
                                        "           /     |   |\n" +
                                        "         .'      |   |\n" +
                                        "        /         \\  |\n" +
                                        "       (_.-.__.__./  /");
                                System.out.println("You are dead!");

                            } else {
                                System.out.println("     __/)     (\\__\n" +
                                        "  ,-'~~(   _   )~~`-.\n" +
                                        " /      \\/'_`\\/      \\\n" +
                                        "|       /_(_)_\\       |\n" +
                                        "|     _(/(\\_/)\\)_     |\n" +
                                        "|    / // \\ / \\\\ \\    |\n" +
                                        " \\  | ``  / \\ ''  |  /\n" +
                                        "  \\  )   /   \\   (  /\n" +
                                        "   )/   /     \\   \\(\n" +
                                        "   '    `-`-'-'    `");
                                System.out.printf("\"You have defeated a great evil today and have earned our divine gratitude.\nLive the rest of your days in your castle.\nWell see you when you pass to the next realm, Great Hero %s\"", heroName);
                                System.exit(0);
                            }
                        }
                        else{
                            System.out.println("You choose to ignore Caliburn and your soul is cursed for all of eternity");
                            System.exit(0);
                        }
                    }
                    System.exit(0);
                }

            }
            System.out.println("\"Silence fool!\" He responds has he raises his blade.\n");
            while (heroHealth > 0 && darkKnightHealth > 0) {
                System.out.println(heroName + "'s Health: " + heroHealth + ", Armor: " + heroArmor + ", Potions: " + heroPotion);
                System.out.println(darkKnightName + "'s Health: " + darkKnightHealth + ", Armor: " + darkKnightArmor);
                System.out.println("Attack, Drink Potion, Run");
                String choice = sc.nextLine();
                if (choice.trim().equalsIgnoreCase("attack")) {
                    int[] updatedEnemyStats = attack(darkKnightHealth, darkKnightArmor, heroAttack);
                    System.out.println("You hit the enemy for: " + (updatedEnemyStats[2]));
                    darkKnightHealth = updatedEnemyStats[0];
                    darkKnightArmor = updatedEnemyStats[1];
                } else if (choice.trim().equalsIgnoreCase("potion") || choice.trim().equalsIgnoreCase("drink potion")) {
                    int[] updatedHeroStats = drinkPotion(heroPotion, heroHealth);
                    heroHealth = updatedHeroStats[0];
                    heroPotion = updatedHeroStats[1];
                } else if (choice.trim().equalsIgnoreCase("run")) {
                    heroHealth = 0;
                } else {
                    continue;
                }

                int[] updatedHeroStats = attack(heroHealth, heroArmor, darkKnightAttack);
                System.out.println("The enemy has hit you for: " + (updatedHeroStats[2]));
                heroHealth = updatedHeroStats[0];
                heroArmor = updatedHeroStats[1];

            }
            if (heroHealth <= 0) {
                System.out.println("                      ,____\n" +
                        "                      |---.\\\n" +
                        "              ___     |    `\n" +
                        "             / .-\\  ./=)\n" +
                        "            |  |\"|_/\\/|\n" +
                        "            ;  |-;| /_|\n" +
                        "           / \\_| |/ \\ |\n" +
                        "          /      \\/\\( |\n" +
                        "          |   /  |` ) |\n" +
                        "          /   \\ _/    |\n" +
                        "         /--._/  \\    |\n" +
                        "         `/|)    |    /\n" +
                        "           /     |   |\n" +
                        "         .'      |   |\n" +
                        "        /         \\  |\n" +
                        "       (_.-.__.__./  /");
                System.out.println("You are dead!");

            } else {
                System.out.println("88.._|      | `-.  | `.  -_-_ _-_  _-  _- -_ -  .'|   |.'|     |  _..88\n" +
                        "88   `-.._  |    |`!  |`.  -_ -__ -_ _- _-_-  .'  |.;'   |   _.!-'|  88\n" +
                        "88      | `-!._  |  `;!  ;. _______________ ,'| .-' |   _!.i'     |  88\n" +
                        "88..__  |     |`-!._ | `.| |_______________||.\"'|  _!.;'   |     _|..88\n" +
                        "88   |``\"..__ |    |`\";.| i|_|MMMMMMMMMMM|_|'| _!-|   |   _|..-|'    88\n" +
                        "88   |      |``--..|_ | `;!|l|MMoMMMMoMMM|1|.'j   |_..!-'|     |     88\n" +
                        "88   |      |    |   |`-,!_|_|MMMMP'YMMMM|_||.!-;'  |    |     |     88\n" +
                        "88___|______|____!.,.!,.!,!|d|MMMo * loMM|p|,!,.!.,.!..__|_____|_____88\n" +
                        "88      |     |    |  |  | |_|MMMMb,dMMMM|_|| |   |   |    |      |  88\n" +
                        "88      |     |    |..!-;'i|r|MPYMoMMMMoM|r| |`-..|   |    |      |  88\n" +
                        "88      |    _!.-j'  | _!,\"|_|M)(MMMMoMMM|_||!._|  `i-!.._ |      |  88\n" +
                        "88     _!.-'|    | _.\"|  !;|1|MbdMMoMMMMM|l|`.| `-._|    |``-.._  |  88\n" +
                        "88..-i'     |  _.''|  !-| !|_|MMMoMMMMoMM|_|.|`-. | ``._ |     |``\"..88\n" +
                        "88   |      |.|    |.|  !| |u|MoMMMMoMMMM|n||`. |`!   | `\".    |     88\n" +
                        "88   |  _.-'  |  .'  |.' |/|_|MMMMoMMMMoM|_|! |`!  `,.|    |-._|     88\n" +
                        "88  _!\"'|     !.'|  .'| .'|[@]MMMMMMMMMMM[@] \\|  `. | `._  |   `-._  88\n" +
                        "88-'    |   .'   |.|  |/| /                 \\|`.  |`!    |.|      |`-88\n" +
                        "88      |_.'|   .' | .' |/                   \\  \\ |  `.  | `._    |  88\n" +
                        "88     .'   | .'   |/|  /                     \\ |`!   |`.|    `.  |  88\n" +
                        "88  _.'     !'|   .' | /                       \\|  `  |  `.    |`.|  88");
                System.out.println("The knight is now behind you. You see a hall leading further into the castle.");
                System.out.println("Would you like to check your current status?");
                statusCheck = sc.nextLine();
                if (statusCheck.trim().equalsIgnoreCase("yes")) {
                    System.out.println(heroName + "'s Health: " + heroHealth + ", Armor: " + heroArmor + ", Potions: " + heroPotion);
                }
                System.out.println("Drink a potion before proceeding?");
                potionCheck = sc.nextLine();
                if (potionCheck.trim().equalsIgnoreCase("yes")) {
                    int[] updatedHeroStats = drinkPotion(heroPotion, heroHealth);
                    heroHealth = updatedHeroStats[0];
                    heroPotion = updatedHeroStats[1];
                    System.out.println(heroName + "'s Health: " + heroHealth + ", Armor: " + heroArmor + ", Potions: " + heroPotion);
                }
                System.out.println("   ,-' ;  ! `-." + "        ,-' ;  ! `-.\n" +
                        "  / :  !  :  . \\" + "      / :  !  :  . \\\n" +
                        " |_ ;   __:  ;  |" + "    |_ ;   __:  ;  |\n" +
                        " )| .  :)(.  !  |" + "    )| .  :)(.  !  |\n" +
                        " |\"    (##)  _  |" + "    |\"    (##)  _  |\n" +
                        " |  :  ;`'  (_) (" + "    |  :  ;`'  (_) (\n" +
                        " |  :  :  .     |" + "    |  :  :  .     |\n" +
                        " )_ !  ,  ;  ;  |" + "    )_ !  ,  ;  ;  |\n" +
                        " || .  .  :  :  |" + "    || .  .  :  :  |\n" +
                        " |\" .  |  :  .  |" + "    |\" .  |  :  .  |\n" +
                        " |XOXXOX_;----._|" + "    |OXOOX_;----.__|");
                System.out.println("There are two paths before you, the doors are labeled with unreadable runes. Which path will you take? Left or Right");
                String pathChoice = sc.nextLine();
                if (pathChoice.trim().equalsIgnoreCase("left")) {
                    System.out.println("                      .      .       .       .\n" +
                            "  .   .       .          .      . .      .         .          .    .\n" +
                            "         .       .         .    .   .         .         .            .\n" +
                            "    .   .    .       .         . . .        .        .     .    .\n" +
                            " .          .   .       .       . .      .        .  .              .\n" +
                            "      .  .    .  .       .     . .    .       . .      .   .        .\n" +
                            " .   .       .    . .      .    . .   .      .     .          .     .\n" +
                            "    .            .    .     .   . .  .     .   .               .\n" +
                            "     .               .  .    .  . . .    .  .                 .\n" +
                            "                        . .  .  . . .  . .\n" +
                            "                            . . . . . .\n" +
                            "                              . . . .\n" +
                            "                               I . I\n" +
                            "                 _______________III_______________\n" +
                            "                /    .       .       .       .    \\\n" +
                            "               ( ~~~ .  ~~~  .  ~~~  .  ~~~  . ~~~ )\n" +
                            "                 \\SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS/\n" +
                            "                    \\ ======================= /\n" +
                            "                        \\SSSSSSSSSSSSSSSSS/\n" +
                            "                     ________\\       /________\n" +
                            "                    (=+=+=+=+=+=+=+=+=+=+=+=+=)\n" +
                            "                     ~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("There is a fountain before you, its water seems to be a light green, do you want to drink from the fountain?");
                    String fountainChoice = sc.nextLine();
                    if (fountainChoice.trim().equalsIgnoreCase("yes")) {
                        System.out.println("You feel revitalized!");
                        heroHealth = 150;
                    } else {
                        System.out.println("You walk away...");
                    }
                } else if (pathChoice.trim().equalsIgnoreCase("right")) {
                    System.out.println("                    ____...------------...____\n" +
                            "               _.-\"` /o/__ ____ __ __  __ \\o\\_`\"-._\n" +
                            "             .'     / /                    \\ \\     '.\n" +
                            "             |=====/o/======================\\o\\=====|\n" +
                            "             |____/_/________..____..________\\_\\____|\n" +
                            "             /   _/ \\_     <_o#\\__/#o_>     _/ \\_   \\\n" +
                            "             \\_________________\\####/_______________/\n" +
                            "              |===\\!/========================\\!/===|\n" +
                            "              |   |=|          .---.         |=|   |\n" +
                            "              |===|o|=========/     \\========|o|===|\n" +
                            "              |   | |         \\() ()/        | |   |\n" +
                            "              |===|o|======{'-.) A (.-'}=====|o|===|\n" +
                            "              | __/ \\__     '-.\\uuu/.-'    __/ \\__ |\n" +
                            "              |============= .'.'^'.'.=============|\n" +
                            "              |  _\\o/   __  {.' __  '.} _   _\\o/  _|\n" +
                            "              `\"\"\"\"-\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"-\"\"\"\"`");

                    System.out.println("There is a chest with spikes and a skull on it, do you wish to open it?");
                    String chestChoice = sc.nextLine();
                    if (chestChoice.trim().equalsIgnoreCase("yes")) {
                        System.out.println("              _..-..     \n" +
                                "            ,'      `.\n" +
                                "           /'       \\ \\\n" +
                                "          /:         \\ \\\n" +
                                "        ,;':._______...-'\\\n" +
                                "        \\:/-.._______..-_|\n" +
                                "         : :\\   `----'|'-;\n" +
                                "          \\ :\\    : : ;:/\n" +
                                "           \\ ``.   ; /;/\n" +
                                "            )   `.  /,'\n" +
                                "          ,'      `-' \\\n" +
                                "         /  .--.       )\n" +
                                "        /_.---._`._   /\n" +
                                "                `.__.'");
                        System.out.println("You see a helmet, it looks better than the one you are currently wearing however it is glowing strangely, do you want to wear it?");
                        String helmetChoice = sc.nextLine();
                        if (helmetChoice.trim().equalsIgnoreCase("yes")) {
                            System.out.println("You feel more protected!");
                            heroArmor += 50;
                        } else if (helmetChoice.trim().equalsIgnoreCase("no")) {
                            System.out.println("You walk away...");
                        }

                    } else if (chestChoice.trim().equalsIgnoreCase("no")) {
                        System.out.println("You walk away...");
                    }
                }

//                after Forked path
                System.out.println("88.._|      | `-.  | `.  -_-_ _-_  _-  _- -_ -  .'|   |.'|     |  _..88\n" +
                        "88   `-.._  |    |`!  |`.  -_ -__ -_ _- _-_-  .'  |.;'   |   _.!-'|  88\n" +
                        "88      | `-!._  |  `;!  ;. _______________ ,'| .-' |   _!.i'     |  88\n" +
                        "88..__  |     |`-!._ | `.| |_______________||.\"'|  _!.;'   |     _|..88\n" +
                        "88   |``\"..__ |    |`\";.| i|_|MMMMMMMMMMM|_|'| _!-|   |   _|..-|'    88\n" +
                        "88   |      |``--..|_ | `;!|l|MMoMMMMoMMM|1|.'j   |_..!-'|     |     88\n" +
                        "88   |      |    |   |`-,!_|_|MMMMP'YMMMM|_||.!-;'  |    |     |     88\n" +
                        "88___|______|____!.,.!,.!,!|d|MMMo * loMM|p|,!,.!.,.!..__|_____|_____88\n" +
                        "88      |     |    |  |  | |_|MMMMb,dMMMM|_|| |   |   |    |      |  88\n" +
                        "88      |     |    |..!-;'i|r|MPYMoMMMMoM|r| |`-..|   |    |      |  88\n" +
                        "88      |    _!.-j'  | _!,\"|_|M)(MMMMoMMM|_||!._|  `i-!.._ |      |  88\n" +
                        "88     _!.-'|    | _.\"|  !;|1|MbdMMoMMMMM|l|`.| `-._|    |``-.._  |  88\n" +
                        "88..-i'     |  _.''|  !-| !|_|MMMoMMMMoMM|_|.|`-. | ``._ |     |``\"..88\n" +
                        "88   |      |.|    |.|  !| |u|MoMMMMoMMMM|n||`. |`!   | `\".    |     88\n" +
                        "88   |  _.-'  |  .'  |.' |/|_|MMMMoMMMMoM|_|! |`!  `,.|    |-._|     88\n" +
                        "88  _!\"'|     !.'|  .'| .'|[@]MMMMMMMMMMM[@] \\|  `. | `._  |   `-._  88\n" +
                        "88-'    |   .'   |.|  |/| /                 \\|`.  |`!    |.|      |`-88\n" +
                        "88      |_.'|   .' | .' |/                   \\  \\ |  `.  | `._    |  88\n" +
                        "88     .'   | .'   |/|  /                     \\ |`!   |`.|    `.  |  88\n" +
                        "88  _.'     !'|   .' | /                       \\|  `  |  `.    |`.|  88");
                System.out.println("You feel an evil presence ahead...");
                System.out.println("Would you like to check your current status?");
                statusCheck = sc.nextLine();
                if (statusCheck.trim().equalsIgnoreCase("yes")) {
                    System.out.println(heroName + "'s Health: " + heroHealth + ", Armor: " + heroArmor + ", Potions: " + heroPotion);
                }
                System.out.println("Drink a potion before proceeding?");
                potionCheck = sc.nextLine();
                if (potionCheck.trim().equalsIgnoreCase("yes")) {
                    int[] updatedHeroStats = drinkPotion(heroPotion, heroHealth);
                    heroHealth = updatedHeroStats[0];
                    heroPotion = updatedHeroStats[1];
                    System.out.println(heroName + "'s Health: " + heroHealth + ", Armor: " + heroArmor + ", Potions: " + heroPotion);
                }
                System.out.println("                                  _.-.\n" +
                        "                                 ._.-.\\\n" +
                        "                    .^         _.-'=. \\\\\n" +
                        "                  .'  )    .-._.-=-..' \\'.\n" +
                        "               .'   .'   _.--._-='.'   |  `.  ^.\n" +
                        "             .'   .'    _`.-.`=-./'.-. / .-.\\ `. `.\n" +
                        "           .'    /      _.-=-=-/ | '._)`(_.'|   \\  `.\n" +
                        "          /    /|       _.--=.'  `. (.-v-.)/    |\\   \\\n" +
                        "        .'    / \\       _.-.' \\-.' `-..-..'     / \\   `.\n" +
                        "       /     /   `-.._ .-.'      `.'  \" \". _..-'  |    |\n" +
                        "      '      |    |   /   )        \\  /   \\   \\    \\    `.\n" +
                        "     /      /    /   /   /\\                \\   \\   |      \\\n" +
                        "    /      /    /  .'  .'\\ `.        .'     \\   |   \\      \\\n" +
                        "   /      /    /  /   /   \\  `-    -' .`.    .  \\    \\     |\n" +
                        "  |      /    / .''\\.'    | `.      .'   `.   \\  |    |    |\n" +
                        " .'     /    / /   |      |      .'/       `.- `./    /    |\n" +
                        " |     /    .-|   /--.    / `.    |    _.-''\\   |     |    \\\n" +
                        ".'    /  .-'  |  /    `-.|       .'\\_.'      `. |`.   |    |\n" +
                        "|    |.-'     / /       /           \\          \\ \\ `. \\     \\\n" +
                        "|    /       /  |      /             \\         |  `. `.|    |\n" +
                        "|   |       /   `.     |      `   .'  \\        /    \\  \\    /\n" +
                        "|   |      ///.-'.\\    |       \\ /    `\\      / /-.  \\ |    |\n" +
                        "|   /      \\\\\\\\    `    \\.-     |    `-.\\     |/   \\\\\\\\'.   |\n" +
                        " \\ |        \\\\\\|        |      / \\      |          //// |  /\n" +
                        " | |         '''        |     /   \\     |          |//  |  \\\n" +
                        " \\ |                    |.-  |     \\  .-|          ''   |  /\n" +
                        "  \\|                    /    |    / ` ../               / /\n" +
                        "                        |'   /    |    /               | /\n" +
                        "                        \\.'  |    | `./                |/\n" +
                        "                       | | | \\   .'  `.. \\\n" +
                        "                      / / / ._`. \\.'-. \\`/\n" +
                        "                      |/ / /  `'  `  |/|/\n" +
                        "                       \\|\\|\n");
                System.out.println("You have arrived in the Throne Room, there is a large winged figured in front of you, it is much scarier than your previous opponents.\n");
                System.out.println("\"Prepare yourself human, I have killed more people then you've ever met\" The winged figure says.");
                while (heroHealth > 0 && vampireLordHealth > 0) {
                    System.out.println(heroName + "'s Health: " + heroHealth + ", Armor: " + heroArmor + ", Potions: " + heroPotion);
                    System.out.println(vampireLordName + "'s Health: " + vampireLordHealth + ", Armor: " + vampireLordArmor);
                    System.out.println("Attack, Drink Potion, Run");
                    String choice = sc.nextLine();
                    if (choice.trim().equalsIgnoreCase("attack")) {
                        int[] updatedEnemyStats = attack(vampireLordHealth, vampireLordArmor, heroAttack);
                        System.out.println("You hit the enemy for: " + (updatedEnemyStats[2]));
                        vampireLordHealth = updatedEnemyStats[0];
                        vampireLordArmor = updatedEnemyStats[1];
                    } else if (choice.trim().equalsIgnoreCase("potion") || choice.trim().equalsIgnoreCase("drink potion")) {
                        int[] updatedHeroStats = drinkPotion(heroPotion, heroHealth);
                        heroHealth = updatedHeroStats[0];
                        heroPotion = updatedHeroStats[1];
                    } else if (choice.trim().equalsIgnoreCase("run")) {
                        heroHealth = 0;
                    } else {
                        continue;
                    }

                    int[] updatedHeroStats = attack(heroHealth, heroArmor, vampireLordAttack);
                    System.out.println("The enemy has hit you for: " + (updatedHeroStats[2]));
                    heroHealth = updatedHeroStats[0];
                    heroArmor = updatedHeroStats[1];

                }
                if (heroHealth <= 0) {
                    System.out.println("                      ,____\n" +
                            "                      |---.\\\n" +
                            "              ___     |    `\n" +
                            "             / .-\\  ./=)\n" +
                            "            |  |\"|_/\\/|\n" +
                            "            ;  |-;| /_|\n" +
                            "           / \\_| |/ \\ |\n" +
                            "          /      \\/\\( |\n" +
                            "          |   /  |` ) |\n" +
                            "          /   \\ _/    |\n" +
                            "         /--._/  \\    |\n" +
                            "         `/|)    |    /\n" +
                            "           /     |   |\n" +
                            "         .'      |   |\n" +
                            "        /         \\  |\n" +
                            "       (_.-.__.__./  /");
                    System.out.println("You are dead!");

                } else {
                    System.out.println("            ^^                   @@@@@@@@@\n" +
                            "       ^^       ^^            @@@@@@@@@@@@@@@\n" +
                            "                            @@@@@@@@@@@@@@@@@@              ^^\n" +
                            "                           @@@@@@@@@@@@@@@@@@@@\n" +
                            " ~~~~ ~~ ~~~~~ ~~~~~~~~ ~~ &&&&&&&&&&&&&&&&&&&& ~~~~~~~ ~~~~~~~~~~~ ~~~\n" +
                            " ~         ~~   ~  ~       ~~~~~~~~~~~~~~~~~~~~ ~       ~~     ~~ ~\n" +
                            "   ~      ~~      ~~ ~~ ~~  ~~~~~~~~~~~~~ ~~~~  ~     ~~~    ~ ~~~  ~ ~~\n" +
                            "   ~  ~~     ~         ~      ~~~~~~  ~~ ~~~       ~~ ~ ~~  ~~ ~\n" +
                            " ~  ~       ~ ~      ~           ~~ ~~~~~~  ~      ~~  ~             ~~\n" +
                            "       ~             ~        ~      ~      ~~   ~             ~");
                    System.out.printf("You have defeated your enemies and the castle lays empty. You have earned your place as lord of the castle.\n The treasure is yours, the throne is yours. All hail Lord %s", heroName);

                }
            }
        }
    }


    public static int[] attack(int health, int armor, int maxDamage) {
        Random rand = new Random();
        // Health and armor is going to equal opposition health and armor.
        // Attack points is going to be whoever is attacking.
        int hit;
        if (maxDamage > 40) {

            hit = rand.nextInt(maxDamage - 15) + 15;
        } else {
            hit = rand.nextInt(maxDamage);

        }

        if (armor >= hit) {
            armor = armor - hit;
        } else {
            health -= (hit - armor);
            armor = 0;
        }

        return new int[]{health, armor, hit};
    }

    public static int[] drinkPotion(int potion, int health) {

        if (health < 100 && potion > 0) {
            health += 15;
            potion -= 1;
            System.out.println("You have regained 15 HP");
        }
        if (potion == 0) {
            System.out.println("You are out of potions");
        }
        return new int[]{health, potion};
    }

}
