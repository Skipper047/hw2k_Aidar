package com.company;

public final class Wizard extends Archmage{
    private String beginnerGear;

    public Wizard(int heal, int damage, String staff, com.company.kindOfMagic kindOfMagic, SuperPowers superPowers, String beginnerGear) {
        super(heal, damage, staff, kindOfMagic, superPowers);
        this.beginnerGear = beginnerGear;
    }
    public Wizard(int heal, int damage, String staff, com.company.kindOfMagic kindOfMagic, String beginnerGear) {
        super(heal, damage, staff, kindOfMagic);
        this.beginnerGear = beginnerGear;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nbeginner gear: " + beginnerGear;
    }

    public String getBeginnerGear() { return beginnerGear; }



}
