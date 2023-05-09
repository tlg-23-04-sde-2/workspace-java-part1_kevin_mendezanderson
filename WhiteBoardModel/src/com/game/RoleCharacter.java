package com.game;

import javax.management.relation.Role;

/*
 * Business class, also known as a system class to model the workings of a television.
 */
public class RoleCharacter {
    //constructors
    public RoleCharacter(){
        //no op
    }
    public RoleCharacter(Spells spell){
        setSpell(spell);
    }
    public RoleCharacter(Spells spell, String name){
        this(spell);
        setName(name);
    }
    public RoleCharacter(Spells spell, String name, int level){

    }
    //First set the attributes/ Instance variables / Data / properties / fields
    private Spells spell;
    private int level;
    private String name;



    //second set the methods / functions / operations
    public void CastSpell(){

        System.out.println(getName()+" Casts "+ getSpell());
    }
    public void LevelUp(){
        System.out.println("your new level is " + getLevel());
    }
    public void UsePotion(){
        System.out.println(getName() + " health is restored");
    }
    //add data encapsulation and toString method


    public Spells getSpell() {
        return spell;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public void setSpell(Spells Spell) {
        this.spell = Spell;
    }

    public void setLevel(int level) {
        if (level >=1)
        this.level = level;
        else System.out.println("input a valid level");
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "character info: " + getName() + " level: " + getLevel() + " available spell: " + getSpell();
    }
}