package com.patterns.builder;

import com.patterns.builder.enums.*;

/**
 * created by: ufuk on 6.10.2020 13:06
 */
public class App {
    public static void main(String[] args) {
        Hero myHero = new Builder(Profession.MESMER, "myHero")
                .withArmor(Armor.LIGHT)
                .withHairColor(HairColor.PURPLE)
                .withHairType(HairType.COILY)
                .withWeapon(Weapon.STAFF)
                .build();
        System.out.println(myHero.toString());
    }
}
