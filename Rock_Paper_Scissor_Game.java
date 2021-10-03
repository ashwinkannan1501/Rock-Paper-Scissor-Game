// Rock Paper and Scissor game

// Import the necessary packages
import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor_Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        playGame();

        while(true) {
            System.out.print("Do ou want to play the game again ? (Y : Yes , N : No): ");
            String playAgain = input.nextLine().toUpperCase();
            if (playAgain.equals("Y")) {
                playGame();
            } else if (playAgain.equals("N")) {
                System.out.println("Thank you for playing the game .... 😊😊");
                break;
            }
        }
    }

    public static void playGame(){
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("-------- Rock, Paper, Scissor Game -----------");

        String[] collections = {"R", "P", "S"};
        String computer = collections[random.nextInt(collections.length)];

        System.out.print("Enter your choice (R, P or S): ");
        String player = input.next().toUpperCase();

        if (player.equals(computer)) {
            System.out.println("It's a tie ... 🙂🙂🙂🙂");
        } else {
            switch(player) {
                case "R":
                    if (computer.equals("P")) {
                        System.out.println("Computer wins the game ....... 😑😑😑");
                    } else if (computer.equals("S")) {
                        System.out.println("You win the game ...... 😎😎😎");
                    }
                    break;
                case "P":
                    if (computer.equals("R")) {
                        System.out.println("You win the game ...... 😎😎😎");
                    } else if (computer.equals("S")) {
                        System.out.println("Computer wins the game ....... 😑😑😑");
                    }
                    break;
                case "S":
                    if (computer.equals("R")) {
                        System.out.println("Computer wins the game ....... 😑😑😑");
                    } else if (computer.equals("P")) {
                        System.out.println("You win the game ...... 😎😎😎");
                    }
                    break;
                default:
                    System.out.println("Please enter the correct option : (R, P (or) S)");
            }
        }
    }
}