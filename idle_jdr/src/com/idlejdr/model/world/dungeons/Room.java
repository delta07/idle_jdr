package com.idlejdr.model.world.dungeons;

import java.util.ArrayList;

import com.idlejdr.controler.construct.Construct;
import com.idlejdr.function.Function;
import com.idlejdr.model.personnage.Personnage;

public class Room {

	ArrayList<Personnage> characList;
	long noRoom, level, nbMob;

	public Room(long room, long level) throws IllegalArgumentException,
			IllegalAccessException, NoSuchFieldException, SecurityException {
		this.noRoom = room;
		this.level = level;
		this.nbMob = Function.diceRoll((int) this.level, 2);
		generateMobs();
	}

	public ArrayList<Personnage> getCharacList() {
		return characList;
	}

	public long getNoRoom() {
		return noRoom;
	}

	public void setNoRoom(long noRoom) {
		this.noRoom = noRoom;
	}

	public long getLevel() {
		return level;
	}

	public void setLevel(long level) {
		this.level = level;
	}

	public long getNbMob() {
		return nbMob;
	}

	public void setNbMob(long nbMob) {
		this.nbMob = nbMob;
	}

	public void setCharacList(ArrayList<Personnage> characList) {
		this.characList = characList;
	}

	public void addCharac(Personnage perso) {
		characList.add(perso);
	}

	public void generateMobs() throws IllegalArgumentException,
			IllegalAccessException, NoSuchFieldException, SecurityException {
		characList = Construct.createMobsListByLevel(this.nbMob, this.level);
	}
}
