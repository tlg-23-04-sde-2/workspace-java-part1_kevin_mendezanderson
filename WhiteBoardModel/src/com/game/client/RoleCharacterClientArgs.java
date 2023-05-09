package com.game.client;

import com.game.RoleCharacter;
import com.game.Spells;

class RoleCharacterClientArgs {
    //create args that take input for the 3 fields spell, name, level
    public static void main(String[] args) {
        Spells spell = Spells.valueOf(args[0].toUpperCase());
        String name = args[1];
        int level = Integer.parseInt(args[2]);

        //create a character object from these inputs
        RoleCharacter c1 = new RoleCharacter(spell, name,level);

        //
        System.out.println("Congratulations on getting this program to work!!! yay you rock");
        System.out.println(c1);
    }


}