package com.company.Attack;

import com.company.Creature.Creature;

/**
 * @description:
 * @author: ASUS
 * @date: Created in 2020/6/15 23:27
 * @version: ${VERSION}
 * @modified By:
 */
public abstract class Attack {
    private String id;
    private String name;
    private int point;
    //向上造型,抽象
    public abstract void useKnife(Creature targetCreature);

    public Attack() {
    }

    public  Attack(String id, String name, int point) {
        this.id = id;
        this.name = name;
        this.point = point;
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

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
