package com.idlejdr.model.world.dungeons;

import java.util.ArrayList;

import com.idlejdr.model.personnage.Personnage;

public class Room {
	
	ArrayList<Personnage> characList ;

	public ArrayList<Personnage> getCharacList() {
		return characList;
	}

	public void setCharacList(ArrayList<Personnage> characList) {
		this.characList = characList;
	}
	public void addCharac(Personnage perso){
		characList.add(perso);
	}

}
