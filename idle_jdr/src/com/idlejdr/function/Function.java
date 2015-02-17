package com.idlejdr.function;

import java.util.Random;

public class Function {

	public static long diceRoll(int nbDice, int dice) {
		return (nbDice) + new Random().nextInt(nbDice * dice - nbDice);

	}

}
