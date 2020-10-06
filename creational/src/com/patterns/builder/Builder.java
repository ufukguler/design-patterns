package com.patterns.builder;

import com.patterns.builder.enums.*;

/**
 * created by: ufuk on 6.10.2020 13:13
 */
public class Builder {
    private Profession profession;
    private String name;
    private HairType hairType;
    private HairColor hairColor;
    private Armor armor;
    private Weapon weapon;

    public Builder(Profession profession, String name) {
        if (profession == null || name == null) {
            throw new IllegalArgumentException("profession and name cannot be null");
        }
        this.profession = profession;
        this.name = name;
    }

    public Hero build() {
        return new Hero(this);
    }

    public Builder withHairType(HairType hairType) {
        this.hairType = hairType;
        return this;
    }

    public Builder withHairColor(HairColor hairColor) {
        this.hairColor = hairColor;
        return this;
    }

    public Builder withArmor(Armor armor) {
        this.armor = armor;
        return this;
    }

    public Builder withWeapon(Weapon weapon) {
        this.weapon = weapon;
        return this;
    }

    public Profession getProfession() {
        return profession;
    }

    public String getName() {
        return name;
    }

    public HairType getHairType() {
        return hairType;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public Armor getArmor() {
        return armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
