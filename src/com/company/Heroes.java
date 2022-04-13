package com.company;

public class Heroes {
    private int health;
    private String  ability;
    private int damage;

    public Heroes(int health, String ability, int damage) {
        this.health = health;
        this.ability = ability;
        this.damage = damage;
    }

    public Heroes(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public String getAbility() {
        return ability;
    }

    public int getDamage() {
        return damage;
    }
}
