package com.idlejdr.model.skill;

import java.util.ArrayList;

import com.idlejdr.model.personnage.Personnage;

public interface SkillInterface {

	void use(ArrayList<Personnage> persoList);

	void use(Personnage perso);

}
