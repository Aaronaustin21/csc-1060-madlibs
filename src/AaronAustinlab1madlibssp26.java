import java.util.Scanner;

public abstract class AaronAustinlab1madlibssp26 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get 7 Nouns
        System.out.println("Please give me a noun: ");
        String noun1 = scanner.nextLine();
        System.out.println("noun 1 is: " + noun1);

        System.out.println("Please give me a noun: ");
        String noun2 = scanner.nextLine();
        System.out.println("noun 2 is: " + noun2);

        System.out.println("Please give me a noun: ");
        String noun3 = scanner.nextLine();
        System.out.println("noun 3 is: " + noun3);

        System.out.println("Please give me a noun: ");
        String noun4 = scanner.nextLine();
        System.out.println("noun 4 is: " + noun4);

        System.out.println("Please give me a noun: ");
        String noun5 = scanner.nextLine();
        System.out.println("noun 5 is: " + noun5);

        System.out.println("Please give me a noun: ");
        String noun6 = scanner.nextLine();
        System.out.println("noun 6 is: " + noun6);

        System.out.println("Please give me a noun: ");
        String noun7 = scanner.nextLine();
        System.out.println("noun 7 is: " + noun7);

        // Get 7 Verbs
        System.out.println("Please give me a verb: ");
        String verb1 = scanner.nextLine();
        System.out.println("verb 1 is: " + verb1);

        System.out.println("Please give me a verb: ");
        String verb2 = scanner.nextLine();
        System.out.println("verb 2 is: " + verb2);

        System.out.println("Please give me a verb: ");
        String verb3 = scanner.nextLine();
        System.out.println("verb 3 is: " + verb3);

        System.out.println("Please give me a verb: ");
        String verb4 = scanner.nextLine();
        System.out.println("verb 4 is: " + verb4);

        System.out.println("Please give me a verb: ");
        String verb5 = scanner.nextLine();
        System.out.println("verb 5 is: " + verb5);

        System.out.println("Please give me a verb: ");
        String verb6 = scanner.nextLine();
        System.out.println("verb 6 is: " + verb6);

        System.out.println("Please give me a verb: ");
        String verb7 = scanner.nextLine();
        System.out.println("verb 7 is: " + verb7);

        // Get 7 Adjectives
        System.out.println("Please give me an adjective: ");
        String adjective1 = scanner.nextLine();
        System.out.println("adjective 1 is: " + adjective1);

        System.out.println("Please give me an adjective: ");
        String adjective2 = scanner.nextLine();
        System.out.println("adjective 2 is: " + adjective2);

        System.out.println("Please give me an adjective: ");
        String adjective3 = scanner.nextLine();
        System.out.println("adjective 3 is: " + adjective3);

        System.out.println("Please give me an adjective: ");
        String adjective4 = scanner.nextLine();
        System.out.println("adjective 4 is: " + adjective4);

        System.out.println("Please give me an adjective: ");
        String adjective5 = scanner.nextLine();
        System.out.println("adjective 5 is: " + adjective5);

        System.out.println("Please give me an adjective: ");
        String adjective6 = scanner.nextLine();
        System.out.println("adjective 6 is: " + adjective6);

        System.out.println("Please give me an adjective: ");
        String adjective7 = scanner.nextLine();
        System.out.println("adjective 7 is: " + adjective7);

        // Print story
        System.out.println();
        System.out.println("----- Your MadLibs Story -----");
        System.out.println();

        System.out.println("One day, a(n) " + adjective1 + " explorer decided to venture into the " + noun1 +
                " to find lost treasure. They began to " + verb1 + " through the " + adjective2 +
                " vines, carrying a heavy " + noun2 + ". Suddenly, they had to " + verb2 +
                " because a(n) " + adjective3 + " monkey started to " + verb3 +
                " at them from a nearby " + noun3 + ". The explorer felt " + adjective4 +
                " and tried to " + verb4 + " away, but their " + noun4 +
                " got stuck in the mud. They used a(n) " + adjective5 + " stick to " + verb5 +
                " it out. Just then, a(n) " + adjective6 + " tiger appeared near a(n) " + noun5 +
                " and began to " + verb6 + " loudly. The explorer grabbed their " + noun6 +
                " and decided to " + verb7 + " toward the " + adjective7 +
                " river. Finally, they reached a hidden " + noun7 +
                " and celebrated their narrow escape!");

        scanner.close();
    }
}