package com.company.Creature;

import com.company.Attack.Knife;

/**
 * @description:
 * @author: ASUS
 * @date: Created in 2020/6/15 23:26
 * @version: ${VERSION}
 * @modified By:
 */
public abstract class Creature {
    private String id;
    private String name;
    private int hp;
    private Knife currentKnife;
    //使用武器攻击对手，但是无法具体实现，所以采用抽象方法
    public abstract void useKnife(Knife currentWeapon, Creature targetCreature);
    public Creature() {
    }

    public Creature(String id, String name, int hp) {
        this.id = id;
        this.name = name;
        this.hp = hp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Knife getCurrentWeapon() {
        return currentKnife;
    }

    public void setCurrentWeapon(Knife currentWeapon) {
        this.currentKnife = currentWeapon;
    }


}
