package com.idlejdr.model.world.dungeons;

import java.util.ArrayList;

import com.idlejdr.function.Function;
import com.idlejdr.model.world.Place;

public class Dungeons extends Place {

	ArrayList<Floor> floorList;
	long level, nbFloor;

	public Dungeons(String name, int level) throws IllegalArgumentException,
			IllegalAccessException, NoSuchFieldException, SecurityException {
		floorList = new ArrayList<Floor>();
		this.name = name;
		this.level = level;
		this.nbFloor = Function.diceRoll((int) this.level, 2);
		generateFloors();
	}

	public ArrayList<Floor> getFloorList() {
		return floorList;
	}

	public void setFloorList(ArrayList<Floor> floorList) {
		this.floorList = floorList;
	}

	public long getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void addFloor(Floor floor) {
		floorList.add(floor);
	}

	public void generateFloors() throws IllegalArgumentException,
			IllegalAccessException, NoSuchFieldException, SecurityException {
		for (int i = 1; i <= this.nbFloor; i++) {
			Floor fl = new Floor(i, this.level);
			addFloor(fl);
		}
	}
}
