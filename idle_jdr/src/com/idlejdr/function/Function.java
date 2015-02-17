package com.idlejdr.function;

import java.util.Random;

public class Function {
	/**
	 * Simulating function of Dice. ex: 2D6,3D10,etc
	 * 
	 * @param nbDice
	 * @param dice
	 * @return int
	 */
	public static long diceRoll(int nbDice, int dice) {
		return (nbDice) + new Random().nextInt(nbDice * dice - nbDice);

	}

}
