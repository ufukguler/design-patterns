package com.patterns.builder;

import com.patterns.builder.enums.*;

/**
 * created by: ufuk on 6.10.2020 13:06
 */
public final class Hero {
    private final Profession profession;
    private final String name;
    private final HairType hairType;
    private final HairColor hairColor;
    private final Armor armor;
    private final Weapon weapon;

    public Hero(Builder builder) {
        this.profession = builder.getProfession();
        this.name = builder.getName();
        this.hairColor = builder.getHairColor();
        this.hairType = builder.getHairType();
        this.weapon = builder.getWeapon();
        this.armor = builder.getArmor();
    }

    @Override
    public String toString() {
        return "Hero{" +
                "profession=" + profession +
                ", name='" + name + '\'' +
                ", hairType=" + hairType +
                ", hairColor=" + hairColor +
                ", armor=" + armor +
                ", weapon=" + weapon +
                '}';
    }
}
