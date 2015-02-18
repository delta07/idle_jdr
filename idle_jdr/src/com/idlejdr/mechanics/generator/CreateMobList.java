package com.idlejdr.mechanics.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.idlejdr.function.ClassFinder;
import com.idlejdr.model.personnage.Personnage;

public class CreateMobList {

	/**
	 * Generate list of Monsters by level
	 * 
	 * @param nombre
	 * @param level
	 * @return listMonstre
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 */
	public static ArrayList<Personnage> createMobsListByLevel(long nombre,
			long level) {
		ArrayList<Personnage> listMonstre = new ArrayList<>();
		Object[] array = generateListMob((int) nombre, getMobByLevel(level));
		for (int i = 0; i < array.length; i++) {
			listMonstre.add((Personnage) array[i]);
		}
		return listMonstre;

	}

	/**
	 * Choose random Mob into a list of Monster into Classes of
	 * model.personnage.monster
	 * 
	 * @param nbMob
	 * @param classes
	 * @return array
	 */
	public static Object[] generateListMob(int nbMob, Class[] classes) {
		Object[] array = new Object[nbMob];
		int indexClass = new Random().nextInt(classes.length);
		for (int i = 0; i < nbMob; i++) {
			try {
				array[i] = classes[indexClass].newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				throw new RuntimeException(e);
			}
		}
		return array;
	}

	/**
	 * Return Classes Monster with level that is on paramater
	 * 
	 * @param level
	 * @return tabClass
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 */
	public static Class[] getMobByLevel(long level) {
		List<Class<?>> classes = ClassFinder
				.find("com.idlejdr.model.personnage.monsters");
		ArrayList<Class> listClass = new ArrayList<>();
		for (Class cla : classes) {
			try {
				if (cla.getDeclaredField("LEVEL").getLong(1) == level)
					listClass.add(cla);
			} catch (IllegalArgumentException | IllegalAccessException
					| NoSuchFieldException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Class[] tabClass = new Class[listClass.size()];
		for (int i = 0; i < listClass.size(); i++) {
			tabClass[i] = listClass.get(i);
		}

		return tabClass;

	}
}
