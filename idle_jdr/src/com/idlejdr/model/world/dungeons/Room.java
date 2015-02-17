package com.idlejdr.model.world.dungeons;

import java.util.ArrayList;

import com.idlejdr.controler.generator.Generator;
import com.idlejdr.function.Function;
import com.idlejdr.model.personnage.Personnage;

public class Room {

	ArrayList<Personnage> characList;
	long noRoom, level, nbMob;

	/**
	 * Constructor
	 * 
	 * @param room
	 * @param level
	 */
	public Room(long room, long level) {
		this.noRoom = room;
		this.level = level;
		this.nbMob = Function.diceRoll((int) this.level, 2);
		generateMobs();
	}

	/**
	 * 
	 * @return characList
	 */
	public ArrayList<Personnage> getCharacList() {
		return characList;
	}

	/**
	 * 
	 * @return noRoom
	 */
	public long getNoRoom() {
		return noRoom;
	}

	/**
	 * 
	 * @param noRoom
	 */
	public void setNoRoom(long noRoom) {
		this.noRoom = noRoom;
	}

	/**
	 * 
	 * @return level
	 */
	public long getLevel() {
		return level;
	}

	/**
	 * 
	 * @param level
	 */
	public void setLevel(long level) {
		this.level = level;
	}

	/**
	 * 
	 * @return nbMob
	 */
	public long getNbMob() {
		return nbMob;
	}

	/**
	 * 
	 * @param nbMob
	 */
	public void setNbMob(long nbMob) {
		this.nbMob = nbMob;
	}

	/**
	 * 
	 * @param characList
	 */
	public void setCharacList(ArrayList<Personnage> characList) {
		this.characList = characList;
	}

	/**
	 * 
	 * @param perso
	 */
	public void addCharac(Personnage perso) {
		characList.add(perso);
	}

	/**
	 * Methdo for genating Monster into a room
	 */
	public void generateMobs() {
		try {
			characList = Generator
					.createMobsListByLevel(this.nbMob, this.level);
		} catch (IllegalArgumentException | IllegalAccessException
				| NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
