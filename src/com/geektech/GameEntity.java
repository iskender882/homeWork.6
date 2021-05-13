package com.geektech;

public class GameEntity {

    private int heroesHealth;
    private int heroesDamage;

    private int bosshealth;
    private int bossDamage;

    public int getHeroesHealth() {
        return heroesHealth;
    }

    public void setHeroesHealth(int heroesHealth) {
        this.heroesHealth = heroesHealth;
    }

    public int getHeroesDamage() {
        return heroesDamage;
    }

    public void setHeroesDamage(int heroesDamage) {
        this.heroesDamage = heroesDamage;
    }

    public int getBosshealth() {
        return bosshealth;
    }

    public void setBosshealth(int bosshealth) {
        this.bosshealth = bosshealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }
}
