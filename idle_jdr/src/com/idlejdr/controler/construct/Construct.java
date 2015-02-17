package com.idlejdr.controler.construct;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.idlejdr.function.ClassFinder;
import com.idlejdr.model.personnage.Personnage;
import com.idlejdr.model.skill.Skill;
import com.idlejdr.model.world.dungeons.Dungeons;
import com.idlejdr.model.world.dungeons.Floor;
import com.idlejdr.model.world.dungeons.Room;

public class Construct {

	public static Skill createSkill() {
		// Skill sk = new Heal(1, 0.2);

		return null;

	}

	public static Dungeons CreateDungeons(int level, int nbFloor, int nbRoom)
			throws IllegalArgumentException, IllegalAccessException,
			NoSuchFieldException, SecurityException {
		Dungeons donjon = new Dungeons("DeadMines", 1);
		for (int i = 0; i <= nbFloor; i++) {
			Floor fl = new Floor(i, donjon.getLevel());
			for (int y = 0; y <= nbRoom; y++) {
				Room ro = new Room(y, donjon.getLevel());
				fl.addRoom(ro);
			}
			donjon.addFloor(fl);
		}

		return donjon;
	}

	/*
	 * Genere une list de monstre par niveau
	 */
	public static ArrayList<Personnage> createMobsListByLevel(long nombre,
			long level) throws IllegalArgumentException,
			IllegalAccessException, NoSuchFieldException, SecurityException {
		ArrayList<Personnage> listMonstre = new ArrayList<>();
		Object[] array = generateListMob((int) nombre, getMobByLevel(level));
		for (int i = 0; i < array.length; i++) {
			listMonstre.add((Personnage) array[i]);
		}
		return listMonstre;

	}

	/*
	 * choisi aleatoirement parmis un monstre les classe de monstre de level
	 * choisi, et renvoi le nb de mob choisi
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

	/*
	 * Renvoi les classe de monstre dont le level corespond
	 */
	public static Class[] getMobByLevel(long level)
			throws IllegalArgumentException, IllegalAccessException,
			NoSuchFieldException, SecurityException {
		List<Class<?>> classes = ClassFinder
				.find("com.idlejdr.model.personnage.monsters");
		ArrayList<Class> listClass = new ArrayList<>();
		for (Class cla : classes) {
			if (cla.getDeclaredField("LEVEL").getLong(1) == level)
				listClass.add(cla);
		}
		Class[] tabClass = new Class[listClass.size()];
		for (int i = 0; i < listClass.size(); i++) {
			tabClass[i] = listClass.get(i);
		}

		return tabClass;

	}
}
