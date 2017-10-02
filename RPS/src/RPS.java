import java.util.Scanner;
import java.util.Random;
public class RPS {
// Author @ Omar Fernandez 
	public static void main(String[] args) {
	Random rnumber = new Random();
	Scanner input = new Scanner(System.in);
	int cpunum = rnumber.nextInt(3); 
	String cpuchoice , w = "You win. Congratulations!", l = "You lose!";
	if (cpunum == 0) {
		cpuchoice = "rock";}
	else if (cpunum == 1) {
		cpuchoice = "paper";}
	else  {
		cpuchoice = "scissor";}
//	System.out.println(cpuchoice);  rnumber test
	System.out.printf("Let's play rock, paper, scissors.%nThe computer will choose first. %nIt's your turn.%nChoose by typing in rock, paper, or scissor.");
	String player = input.next();
//	System.out.println(player); input test
	System.out.printf("The computer chose %s. %n",cpuchoice );
	if (cpuchoice.equalsIgnoreCase(player))
		System.out.println("The game is a tie.");
	else if (cpuchoice.equals("rock") && player.equalsIgnoreCase("paper"))
	System.out.println(w);
	else if (cpuchoice.equals("rock") && player.equalsIgnoreCase("scissor"))
		System.out.println(l);
	else if (cpuchoice.equals("paper") && player.equalsIgnoreCase("scissor"))
		System.out.println(w);
	else if (cpuchoice.equals("paper") && player.equalsIgnoreCase("rock"))
		System.out.println(l);
	else if (cpuchoice.equals("scissor") && player.equalsIgnoreCase("paper"))
		System.out.println(l);
	else if (cpuchoice.equals("scissor") && player.equalsIgnoreCase("rock"))
		System.out.println(w);
	else 
		System.out.println("Your choice is not a valid , You lose anyway.");
		}
}

// Good job, Omar.
