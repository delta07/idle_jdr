package com.idlejdr.controler.construct;

import com.idlejdr.model.personnage.Personnage;
import com.idlejdr.model.personnage.Personnage.Job;
import com.idlejdr.model.skill.Heal;
import com.idlejdr.model.skill.Skill;
import com.idlejdr.model.world.dungeons.Dungeons;
import com.idlejdr.model.world.dungeons.Floor;
import com.idlejdr.model.world.dungeons.Room;

public class Construct {
	
	
	public static Skill createSkill(){
		Skill sk = new Heal("Soigne 30 pv");
		return sk;
		
	}
	
	public static Dungeons CreateDungeons(){
		
		Dungeons donjon = new Dungeons();
		Floor flo = new Floor();
		Room ro = new Room();
		Personnage monstre = new Personnage(Job.Fighter, "Gobelin", 100, 50, 10, 10, 10, 10);
		ro.addCharac(monstre);
		flo.addRoom(ro);
		donjon.addFloor(flo);
		
		
		
		
		
		return null;
	}

}
