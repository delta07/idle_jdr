package com.idlejdr.model.world.dungeons;

import java.util.ArrayList;

import com.idlejdr.model.world.Place;

public class Dungeons extends Place {
	
	ArrayList<Floor> floorList;
	int level;
	
	
	
	
	public ArrayList<Floor> getFloorList() {
		return floorList;
	}
	public void setFloorList(ArrayList<Floor> floorList) {
		this.floorList = floorList;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public void addFloor(Floor floor){
		floorList.add(floor);
	}

}
