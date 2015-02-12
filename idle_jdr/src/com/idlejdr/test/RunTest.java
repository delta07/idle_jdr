package com.idlejdr.test;

import com.idlejdr.controler.construct.Construct;
import com.idlejdr.model.personnage.Personnage;
import com.idlejdr.model.personnage.Personnage.Job;

public class RunTest {

	public static void main(String[] args) {
		Personnage perso = new Personnage(Job.Fighter, "Delta", 100, 50, 10, 10, 10, 10);
		Personnage monstre = new Personnage(Job.Fighter, "Gobelin", 100, 50, 10, 10, 10, 10);
		perso.addSkill(Construct.createSkill());
	}
	
	public void combat(Personnage perso, Personnage monstre){
		
		if (perso.getInitiative()>=monstre.getInitiative()){
			
			
		}else{
			
			
		}
		
		
		
		
		
		
	}
	
	

}
