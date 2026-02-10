import java.util.Scanner;

public abstract class AaronAustinlab1madlibssp26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Arrays to store user inputs
        String[] nouns = new String[7];
        String[] verbs = new String[7];
        String[] adjectives = new String[7];
        
        // Collect nouns
        System.out.println("Enter 7 nouns:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter a noun: ");
            nouns[i] = scanner.nextLine();
        }
        
        // Collect verbs
        System.out.println("\nEnter 7 verbs:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter a verb: ");
            verbs[i] = scanner.nextLine();
        }
        
        // Collect adjectives
        System.out.println("\nEnter 7 adjectives:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter an adjective: ");
            adjectives[i] = scanner.nextLine();
        }
        
        // Create and display the story
        System.out.println("\n--- Your MadLibs Story ---\n");
        String story = "One day, a(n) " + adjectives[0] + " explorer decided to venture into the " + nouns[0] 
            + " to find lost treasure. They began to " + verbs[0] + " through the " + adjectives[1] 
            + " vines, carrying a heavy " + nouns[1] + ". Suddenly, they had to " + verbs[1] 
            + " because a(n) " + adjectives[2] + " monkey started to " + verbs[2] + " at them from a nearby " 
            + nouns[2] + ". The explorer felt " + adjectives[3] + " and tried to " + verbs[3] 
            + " away, but their " + nouns[3] + " got stuck in the mud. They used a(n) " + adjectives[4] 
            + " stick to " + verbs[4] + " it out. Just then, a(n) " + adjectives[5] + " tiger appeared near a(n) " 
            + nouns[4] + " and began to " + verbs[5] + " loudly. The explorer grabbed their " + nouns[5] 
            + " and decided to " + verbs[6] + " toward the " + adjectives[6] + " river. Finally, they reached a hidden " 
            + nouns[6] + " and celebrated their narrow escape!";
        
        System.out.println(story);
        
        scanner.close();
    }
}