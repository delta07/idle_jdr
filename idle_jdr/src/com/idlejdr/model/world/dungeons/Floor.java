package com.idlejdr.model.world.dungeons;

import java.util.ArrayList;

import com.idlejdr.function.Function;

public class Floor {

	ArrayList<Room> roomList;
	long noFloor, nbRoom, level;

	/**
	 * Constructor
	 * 
	 * @param floor
	 * @param level
	 */
	public Floor(long floor, long level) {
		roomList = new ArrayList<Room>();
		this.noFloor = floor;
		this.level = level;
		this.nbRoom = Function.diceRoll((int) this.level, 3);
		generateRooms();
	}

	/**
	 * 
	 * @return noFloor
	 */
	public long getFloor() {
		return noFloor;
	}

	/**
	 * 
	 * @param floor
	 */
	public void setFloor(int floor) {
		this.noFloor = floor;
	}

	/**
	 * 
	 * @return roomList
	 */
	public ArrayList<Room> getRoomList() {
		return roomList;
	}

	/**
	 * 
	 * @param roomList
	 */
	public void setRoomList(ArrayList<Room> roomList) {
		this.roomList = roomList;
	}

	/**
	 * 
	 * @param room
	 */
	public void addRoom(Room room) {
		roomList.add(room);
	}

	/**
	 * Geneting List of Rooms (by level) into this Floor
	 */
	public void generateRooms() {
		for (int i = 1; i <= this.nbRoom; i++) {
			Room fl = new Room(i, this.level);
			addRoom(fl);
		}
	}
}
