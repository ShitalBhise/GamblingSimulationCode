package Com.java;

import java.util.Random;

public class GamblingSimulation {
	public static final int STAKE_PRDAY = 100; // STAKE PER DAY
	public static final int BET_PER_GAME = 1;
	public static final int WIN = 1;
	public static int stake = 0; // Initial gambler bets

	/*
	 * win check function will check if gambler wins or loss
	 */

	public static void winCheck() {
		Random random = new Random();
		int betReturns = random.nextInt(2);
		if (betReturns == WIN) {
			/*
			 * incrementing the stake
			 */
			stake++;
		} else {
			/*
			 * Decrementing the stake
			 */
			stake--;
		}

	}
	/*
	 * Calculative Gambler if won or lost 50% of the stake. Resign the day
	 */

	public static void resignDay() {
		int totalStake = 0;
		stake = 0;
		while (stake != 50 && stake != -50) {
			winCheck();
		}
		totalStake = stake + STAKE_PRDAY;
		System.out.println("Total stake for resign for a day is  " + totalStake);

	}
	/*
	 * After 20 days of playin, to know the total amount won or lost.
	 */

	public static void twentyDayofPlaying() {
		int day;
		for (day = 1; day <= 20; day++) {
			System.out.printf("day %d\n", day);
			resignDay();
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulation");
		twentyDayofPlaying();
	}

}