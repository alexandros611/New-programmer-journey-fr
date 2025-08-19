import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many times do you want this message to be replayed? ");
        int x = input.nextInt();
        System.out.print("How long should each message stay before the next one? (in milliseconds): ");
        int y = input.nextInt();
        for (int i = 1; i <= x; i++) {
            try {
                System.out.println("Hello Seggan,");
                Thread.sleep(y);
                System.out.println("Can you bully me into giving more of my freetime");
                Thread.sleep(y);
                System.out.println("On learning java?");
                Thread.sleep(y);
                System.out.println("for the past 3 weeks i've read nothing :sob:");
                Thread.sleep(y);
                System.out.println();
            } catch (InterruptedException e) {
                System.err.println("sorry code broke :)");
                e.printStackTrace();
            }
        }
    }
}
