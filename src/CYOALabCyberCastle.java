import java.util.Scanner;

public class CYOALabCyberCastle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===============================================");
        System.out.println("        C Y B E R   C A S T L E   H E I S T    ");
        System.out.println("===============================================");
        System.out.println();
        System.out.println("You stand beneath stormy skies outside a fortress of steel and stone.");
        System.out.println("Legend says the castle holds the 'Root Key'—a master key to everything.");
        System.out.println("Your breath fogs the air. The walls hum softly, like a giant server rack.");
        System.out.println();

        String castle =
"        .         .      /\\\\      .:  *       .          .              .\n" +
"                 *    .'  `.      .     .     *      .                  .\n" +
"  :             .    /      \\\\  _ .________________  .                    .\n" +
"       |            `.+-~~-+.'/.' `.^^^^^^^^\\\\~~~~~\\\\.                      .\n" +
" .    -*-   . .       |u--.|  /     \\\\~~~~~~~|~~~~~|\n" +
"       |              |   u|.'       `.\" \"  |\" \" \"|                        .\n" +
"    :            .    |.u-./ _..---.._ \\\\\" \" | \" \" |\n" +
"   -*-            *   |    ~-|U U U U|-~____L_____L_                      .\n" +
"    :         .   .   |.-u.| |..---..|\"//// ////// /\\\\       .            .\n" +
"          .  *        |u   | |       |// /// // ///==\\\\     / \\\\          .\n" +
" .          :         |.--u| |..---..|//////~\\\\////====\\\\   /   \\\\       .\n" +
"      .               | u  | |       |~~~~/\\\\u |~~|++++| .`+~~~+'  .\n" +
"                      |.-|~U~U~|---..|u u|u | |u ||||||   |  U|\n" +
"                   /~~~~/-\\\\---.'     |===|  |u|==|++++|   |   |\n" +
"          aaa      |===| _ | ||.---..|u u|u | |u ||HH||U~U~U~U~|        aa@@\n" +
"     aaa@@@@@@aa   |===|||||_||      |===|_.|u|_.|+HH+|_/_/_/_/aa    a@@@@@@\n" +
" aa@@@@@@@@@@@@@@a |~~|~~~~\\\\---/~-.._|--.---------.~~~`.__ _.@@@@@@a    ~~~~\n" +
"   ~~~~~~    ~~~    \\\\_\\\\\\\\ \\\\  \\\\/~ //\\\\  ~,~|  __   | |`.   :||  ~~~~\n" +
"                     a\\\\`| `   _//  | / _| || |  | `.'  ,''|     aa@@@@@@@a\n" +
" aaa   aaaa       a@@@@\\\\| \\\\  //'   |  // \\\\`| |  `.'  .' | |  aa@@@@@@@@@@@@@\n" +
"@@@@@a@@@@@@a      ~~~~~ \\\\\\\\`//| | \\\\ \\\\//   \\\\`  .-'  .' | '/      ~~~~~~~  ~~\n" +
"@S.C.E.S.W.@@@@a          \\\\// |.`  ` ' /~  :-'   .'|  '/~aa\n" +
"~~~~~~ ~~~~~~         a@@@|   \\\\\\\\ |   // .'    .'| |  |@@@@@@a\n" +
"                    a@@@@@@@\\\\   | `| ''.'     .' | ' /@@@@@@@@@a ;\n";
System.out.println(castle);


        System.out.println("START: You are Outside the Cyber Castle.");
        System.out.println("Your choices are:");
        System.out.println("  1) Approach the Front Gate");
        System.out.println("  2) Enter through the Sewer Entrance");
        System.out.print("Enter your decision (1-2): ");
        int choice1 = scanner.nextInt();
        System.out.println();

        if (choice1 == 1) {
            // FRONT GATE
            System.out.println("You step onto a path of wet cobblestone leading to the FRONT GATE.");
            System.out.println("A guard stands under a flickering lantern, armor polished like chrome.");
            System.out.println("Behind him: a massive gate with a keypad that clicks softly...");
            System.out.println();

            System.out.println("   [==== GATE KEYPAD ====]");
            System.out.println("   |  1  2  3   ENTER   |");
            System.out.println("   |  4  5  6   CLEAR   |");
            System.out.println("   |  7  8  9   ALARM   |");
            System.out.println("   |     0            |");
            System.out.println("   [====================]");
            System.out.println();

            System.out.println("Decision 2: At the gate, you can:");
            System.out.println("  1) Talk to the Guard");
            System.out.println("  2) Sneak Along the Wall");
            System.out.print("Enter your decision (1-2): ");
            int choice2 = scanner.nextInt();
            System.out.println();

            if (choice2 == 1) {
                // TALK TO GUARD
                System.out.println("You walk up calmly. The guard narrows his eyes.");
                System.out.println("\"State your access level,\" he says, hand resting on a baton.");
                System.out.println("The lantern buzzes overhead. You must act confident.");
                System.out.println();

                System.out.println("Decision 3: You decide to:");
                System.out.println("  1) Offer a 'Security Badge' you found earlier");
                System.out.println("  2) Tell a funny lie to distract him");
                System.out.print("Enter your decision (1-2): ");
                int choice3 = scanner.nextInt();
                System.out.println();

                if (choice3 == 1) {
                    // ENDING A: WIN
                    System.out.println("You hold up the badge. The guard scans it with a tiny reader.");
                    System.out.println("BEEP... GREEN.");
                    System.out.println("\"Looks good,\" he mutters, stepping aside.");
                    System.out.println("The gate unlocks with a satisfying CLUNK.");
                    System.out.println();
                    System.out.println("ENDING (WIN): You enter the castle and claim the Root Key. Mission accomplished!");
                } else if (choice3 == 2) {
                    // ENDING B: NEUTRAL
                    System.out.println("You crack a ridiculous joke about 'password123' being the strongest spell.");
                    System.out.println("The guard tries not to laugh... and fails.");
                    System.out.println("\"Alright, alright—move along before I get in trouble,\" he says.");
                    System.out.println("He does NOT open the gate, but he also stops watching you closely.");
                    System.out.println();
                    System.out.println("ENDING (NEUTRAL): You slip away safely, but you do not get inside tonight.");
                } else {
                    System.out.println("Invalid choice. The guard frowns at your hesitation.");
                    System.out.println("ENDING (NEUTRAL): You retreat into the darkness to avoid trouble.");
                }

            } else if (choice2 == 2) {
                // SNEAK ALONG WALL
                System.out.println("You crouch and move along the cold stone wall.");
                System.out.println("Rain drips from ledges. Your shoes splash in shallow puddles.");
                System.out.println("You spot ivy climbing upward—and a side door cracked open.");
                System.out.println();

                System.out.println("Decision 3: You choose to:");
                System.out.println("  1) Climb the Ivy");
                System.out.println("  2) Slip Through the Side Door");
                System.out.print("Enter your decision (1-2): ");
                int choice3 = scanner.nextInt();
                System.out.println();

                if (choice3 == 1) {
                    // ENDING C: LOSE
                    System.out.println("You grab the ivy. It feels slick and weak.");
                    System.out.println("Halfway up—SNAP!");
                    System.out.println("You tumble into a noisy pile of metal scrap.");
                    System.out.println("A siren wails. Footsteps rush toward you.");
                    System.out.println();
                    System.out.println("ENDING (LOSE): You are captured by castle security. Game over.");
                } else if (choice3 == 2) {
                    // ENDING D: WIN
                    System.out.println("You ease the side door open and slip inside like a shadow.");
                    System.out.println("A warm hallway glows with blue server-light. No alarms.");
                    System.out.println("You spot a pedestal with a key-shaped device labeled: ROOT KEY.");
                    System.out.println();
                    System.out.println("ENDING (WIN): You successfully infiltrate and steal the Root Key!");
                } else {
                    System.out.println("Invalid choice. You freeze, unsure what to do.");
                    System.out.println("ENDING (NEUTRAL): You back away before you get spotted.");
                }

            } else {
                System.out.println("Invalid choice. The front gate feels too risky now.");
                System.out.println("ENDING (NEUTRAL): You walk away into the rain to plan better.");
            }

        } else if (choice1 == 2) {
            // SEWER ENTRANCE
            System.out.println("You pry open a heavy sewer grate. A wave of damp air rises up.");
            System.out.println("The tunnel below is dark. Water trickles. Something skitters nearby.");
            System.out.println("You climb down carefully. The castle above rumbles like distant thunder.");
            System.out.println();

            System.out.println("     _________");
            System.out.println("   /          /|");
            System.out.println("  /  SEWER   / |");
            System.out.println(" /__________/  |");
            System.out.println(" |   ~~~    |  |");
            System.out.println(" |  ~~~~~   |  /");
            System.out.println(" |__________| /");
            System.out.println();

            System.out.println("Decision 2: In the tunnel, you can:");
            System.out.println("  1) Follow the Rats (they seem to know a path)");
            System.out.println("  2) Follow the Water Pipe (it leads deeper)");
            System.out.print("Enter your decision (1-2): ");
            int choice2 = scanner.nextInt();
            System.out.println();

            if (choice2 == 1) {
                // FOLLOW RATS
                System.out.println("You follow the rats. Surprisingly organized. Almost... professional.");
                System.out.println("They weave through bricks and broken grates like they own the place.");
                System.out.println("Ahead, something glows faintly in the sludge: a small key-shaped object.");
                System.out.println();

                System.out.println("Decision 3: You choose to:");
                System.out.println("  1) Grab the Glowing Key");
                System.out.println("  2) Ignore it and run after the rats");
                System.out.print("Enter your decision (1-2): ");
                int choice3 = scanner.nextInt();
                System.out.println();

                if (choice3 == 1) {
                    // ENDING E: WIN
                    System.out.println("You grab the glowing key. It’s warm, humming softly.");
                    System.out.println("A hidden door clicks open in the wall, revealing a ladder up.");
                    System.out.println("You climb into a maintenance room—right inside the castle!");
                    System.out.println();
                    System.out.println("ENDING (WIN): The Sewer Key grants you access. You infiltrate successfully!");
                } else if (choice3 == 2) {
                    // ENDING F: LOSE
                    System.out.println("You ignore the glow and sprint after the rats.");
                    System.out.println("You miss a step—your foot plunges into a deep channel.");
                    System.out.println("The current drags you into a grate. Everything goes sideways.");
                    System.out.println();
                    System.out.println("ENDING (LOSE): Swept away in the sewer tunnels. Game over.");
                } else {
                    System.out.println("Invalid choice. You hesitate too long.");
                    System.out.println("ENDING (NEUTRAL): The rats vanish, and you climb out before things get worse.");
                }

            } else if (choice2 == 2) {
                // FOLLOW WATER PIPE
                System.out.println("You follow the water pipe as it hugs the wall like a metal spine.");
                System.out.println("The air grows hotter. Steam hisses from cracks in the joints.");
                System.out.println("A giant valve wheel blocks part of the passage.");
                System.out.println();

                System.out.println("Decision 3: You decide to:");
                System.out.println("  1) Turn the Valve");
                System.out.println("  2) Crawl past the Steam anyway");
                System.out.print("Enter your decision (1-2): ");
                int choice3 = scanner.nextInt();
                System.out.println();

                if (choice3 == 1) {
                    // ENDING G: NEUTRAL
                    System.out.println("You turn the valve slowly. The pipe groans, then the steam stops.");
                    System.out.println("A hidden hatch opens... but it leads to a storage room full of mops.");
                    System.out.println("At least you are inside, but not near anything important.");
                    System.out.println();
                    System.out.println("ENDING (NEUTRAL): You get in, but find nothing valuable before dawn.");
                } else if (choice3 == 2) {
                    // ENDING H: LOSE
                    System.out.println("You crawl forward. Steam blasts your face like a dragon’s breath.");
                    System.out.println("You jerk back, lose balance, and slide into the hot runoff channel.");
                    System.out.println();
                    System.out.println("ENDING (LOSE): Too dangerous. You fail the mission. Game over.");
                } else {
                    System.out.println("Invalid choice. You step back from the steam.");
                    System.out.println("ENDING (NEUTRAL): You escape the tunnel and live to try again.");
                }

            } else {
                System.out.println("Invalid choice. The tunnel echoes with unsettling noises.");
                System.out.println("ENDING (NEUTRAL): You climb back out and leave the sewer behind.");
            }

        } else {
            System.out.println("Invalid choice. You stand still as thunder cracks overhead.");
            System.out.println("ENDING (NEUTRAL): You decide to go home and return another night.");
        }

        scanner.close();
    }
}