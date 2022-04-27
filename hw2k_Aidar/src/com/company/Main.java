package com.company;

public class Main {

    public static void main(String[] args) {
        Archmage archmage = new Archmage(700,109,"Chastifol",kindOfMagic.FIRE,
                new SuperPowers("Double","Anytime"));
	Wizard merlinB = new Wizard(500,75,"Askalon",kindOfMagic.LIGHT,
            new SuperPowers("Time clock","DC"),"crystals");
	Wizard merlinC = new Wizard(435,90,"Rubidii",kindOfMagic.LIGHTNING,"Shield");
		System.out.println("Archmage");
	System.out.println(archmage.getInfo());
	archmage.castingASpell();
		System.out.println("-----------------------------------------");
		System.out.println("Merlin B");
		System.out.println(merlinB.getInfo());
	merlinB.castingASpell();
	merlinB.castingASpell("Раскаты грома");
		System.out.println("-----------------------------------------");
		System.out.println("Merlin C");
	System.out.println(merlinC.getInfo());
	merlinC.castingASpell();
	merlinC.castingASpell("Огненные копья");

    }
}
