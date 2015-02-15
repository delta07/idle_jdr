package com.idlejdr.model.skill;

import java.util.ArrayList;

import com.idlejdr.model.personnage.Personnage;

public interface SkillInterface {

	void use(Personnage caster, ArrayList<Personnage> persoList);

	void use(Personnage caster, Personnage perso);

}
