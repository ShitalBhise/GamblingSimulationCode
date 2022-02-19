package Com.java;

import java.util.Random;

public class GamblingSimulation {
	public static final int STAKE_PAY = 100;
	public static final int PER_BET_GAME = 1;
	public static final int win = 1;
	public static int stake = 0;

//	public static Scanner scanner = new Scanner(System.in);

	// public static void Gambler() {
	// System.out.println("Enter the value of stake : ");
	// int stake = scanner.nextInt();
	// System.out.println("Enter the value of Bet : ");
	// int bet = scanner.nextInt();
	// }

	/*
	 * Win/loss Check function
	 */

	public static void winCheck() {
		Random random = new Random();
		int bet = random.nextInt(2);

		if (bet == win) {
			/*
			 * incrementing the stake
			 */
			stake++;
			System.out.println("Win");
		} else {
			/*
			 * Decrementing the stake
			 */
			stake--;
			System.out.println("Loss");
		}
		System.out.println("Stake = " + stake);

	}

	public static void resignDay() {
		int totalstake = 0;
		while (stake != 50 && stake != -50) {
			winCheck();
		}
		totalstake = stake + STAKE_PAY;
		System.out.println("Total Stake for Resign Day :- " + totalstake);
		// scanner.close();

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulation");
		/*
		 * Calling win check function
		 */
		resignDay();

	}
}
