package com.company.Creature;

import com.company.Attack.Knife;

/**
 * @description:
 * @author: ASUS
 * @date: Created in 2020/6/15 23:27
 * @version: ${VERSION}
 * @modified By:
 */
public class MonsterTiger extends Creature{

    @Override
    public void useKnife(Knife currentWeapon, Creature targetCreature) {
        currentWeapon.useKnife(targetCreature);
    }

}
