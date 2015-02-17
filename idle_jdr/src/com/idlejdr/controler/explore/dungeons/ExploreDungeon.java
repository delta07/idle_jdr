package com.idlejdr.controler.explore.dungeons;

import java.util.ArrayList;

import com.idlejdr.controler.fight.Fight;
import com.idlejdr.model.personnage.Personnage;
import com.idlejdr.model.world.dungeons.Dungeons;
import com.idlejdr.model.world.dungeons.Floor;
import com.idlejdr.model.world.dungeons.Room;

public class ExploreDungeon {

	public ExploreDungeon(Dungeons donjon, ArrayList<Personnage> listPerso) {
		System.out.println("Vous entrez dans " + donjon.getNom());
		for (Floor flo : donjon.getFloorList()) {
			exploreFloor(flo, listPerso);
		}

	}

	public void exploreFloor(Floor floor, ArrayList<Personnage> listPerso) {
		System.out.println("Floor no : " + floor.getFloor());
		for (Room ro : floor.getRoomList()) {
			explorRoom(ro, listPerso);
		}
	}

	public void explorRoom(Room room, ArrayList<Personnage> listPerso) {
		System.out.println("Room no : " + room.getNoRoom());
		ArrayList<Personnage> p = new ArrayList<>();
		p.addAll(room.getCharacList());
		p.addAll(listPerso);
		Fight f = new Fight(p);

	}

}
