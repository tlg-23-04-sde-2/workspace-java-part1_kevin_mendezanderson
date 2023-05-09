package com.game.client;

import com.game.RoleCharacter;
import com.game.Spells;

class RoleCharacterClient {

    public static void main(String[] args) {
        //Assigns the values to a new instance of Role Character
        RoleCharacter char1 = new RoleCharacter();
        char1.setName("Leroy Jenkins");
        char1.setSpell(Spells.FIREBALL);
        char1.setLevel(99);

        char1.CastSpell();
        char1.LevelUp();
        char1.UsePotion();

        System.out.println(char1);
    }
}