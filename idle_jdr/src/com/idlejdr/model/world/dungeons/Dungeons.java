package com.idlejdr.model.world.dungeons;

import java.util.ArrayList;

import com.idlejdr.function.Function;
import com.idlejdr.model.world.Place;

public class Dungeons extends Place {

	ArrayList<Floor> floorList;
	long level, nbFloor;

	/**
	 * 
	 * @param name
	 * @param level
	 */
	public Dungeons(String name, int level) {
		floorList = new ArrayList<Floor>();
		this.name = name;
		this.level = level;
		this.nbFloor = Function.diceRoll((int) this.level, 2);
		generateFloors();
	}

	/**
	 * 
	 * @return floorList
	 */
	public ArrayList<Floor> getFloorList() {
		return floorList;
	}

	/**
	 * 
	 * @param floorList
	 */
	public void setFloorList(ArrayList<Floor> floorList) {
		this.floorList = floorList;
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
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * 
	 * @param floor
	 */
	public void addFloor(Floor floor) {
		floorList.add(floor);
	}

	/**
	 * Geneting List of Floor (by level) into this Dunjon
	 */
	public void generateFloors() {
		for (int i = 1; i <= this.nbFloor; i++) {
			Floor fl = new Floor(i, this.level);
			addFloor(fl);
		}
	}
}
