package com.company.Attack;

import com.company.Creature.Creature;

/**
 * @description:
 * @author: ASUS
 * @date: Created in 2020/6/15 23:28
 * @version: ${VERSION}
 * @modified By:
 */
public class Knife extends Attack{

    public Knife(String id, String  name, int point) {
        super(id, name, point);
    }

    @Override
    public void useKnife(Creature targetCreature) {
        targetCreature.setHp(targetCreature.getHp()-this.getPoint());
    }
}
