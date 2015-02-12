package com.idlejdr.model.world.dungeons;

import java.util.ArrayList;

public class Floor {
	ArrayList<Room> roomList;

	public ArrayList<Room> getRoomList() {
		return roomList;
	}

	public void setRoomList(ArrayList<Room> roomList) {
		this.roomList = roomList;
	}
	public void addRoom(Room room){
		roomList.add(room);
	}
}
