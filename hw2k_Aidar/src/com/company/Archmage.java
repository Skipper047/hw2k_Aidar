package com.company;

public class Archmage extends Hero{
    private String staff;
    private kindOfMagic kindOfMagic;
    private SuperPowers superPowers;

    public Archmage(int heal, int damage, String staff, com.company.kindOfMagic kindOfMagic, SuperPowers superPowers) {
        super(heal, damage);
        this.staff = staff;
        this.kindOfMagic = kindOfMagic;
        this.superPowers = superPowers;
    }
    public Archmage(int heal, int damage, String staff, com.company.kindOfMagic kindOfMagic) {
        super(heal, damage);
        this.staff = staff;
        this.kindOfMagic = kindOfMagic;
    }

    public String getStaff() { return staff; }
    public com.company.kindOfMagic getKindOfMagic() { return kindOfMagic; }
    public SuperPowers getSuperPowers() { return superPowers; }

    public final void castingASpell(){
        System.out.println("Четверо книжье");
    }
    public void castingASpell(String voice){
        System.out.println(voice);
    }

    public String getInfo(){
        if (superPowers==null){
            return "Heal: " +getHeal() + "\nDamage: " + getDamage() + "\nstaff: "+staff+"\nkind of magic: "+
                    kindOfMagic;
        }else {
            return "Heal: " +getHeal() + "\nDamage: " + getDamage() + "\nstaff: "+staff+"\nkind of magic: "+
                    kindOfMagic+ "\nsuper power: "+ superPowers.getCriticalDamage()+"\nsecond super power:"+
                    superPowers.getTimeBend();
        }

    }





}
