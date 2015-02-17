package com.idlejdr.model.world.dungeons;

import java.util.ArrayList;

import com.idlejdr.function.Function;

public class Floor {
	ArrayList<Room> roomList;
	long noFloor, nbRoom, level;

	public Floor(long floor, long level) throws IllegalArgumentException,
			IllegalAccessException, NoSuchFieldException, SecurityException {
		roomList = new ArrayList<Room>();
		this.noFloor = floor;
		this.level = level;
		this.nbRoom = Function.diceRoll((int) this.level, 3);
		generateRooms();
	}

	public long getFloor() {
		return noFloor;
	}

	public void setFloor(int floor) {
		this.noFloor = floor;
	}

	public ArrayList<Room> getRoomList() {
		return roomList;
	}

	public void setRoomList(ArrayList<Room> roomList) {
		this.roomList = roomList;
	}

	public void addRoom(Room room) {
		roomList.add(room);
	}

	public void generateRooms() throws IllegalArgumentException,
			IllegalAccessException, NoSuchFieldException, SecurityException {
		for (int i = 1; i <= this.nbRoom; i++) {
			Room fl = new Room(i, this.level);
			addRoom(fl);
		}
	}
}
