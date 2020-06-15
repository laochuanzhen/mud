package com.company.Creature;

import java.util.ArrayList;

/**
 * @description:
 * @author: ASUS
 * @date: Created in 2020/6/15 23:27
 * @version: ${VERSION}
 * @modified By:
 */
public class MonsterTigerSet {
    private ArrayList<MonsterTiger>monsterTigers = new ArrayList<MonsterTiger>();
    public MonsterTigerSet(){

    }
    public MonsterTigerSet(ArrayList<MonsterTiger>monsterTigers){
        this.monsterTigers = monsterTigers;
    }
    public ArrayList<MonsterTiger>getMonsterTigers(){
        return monsterTigers;
    }
    public void setMonsterTigers(ArrayList<MonsterTiger>monsterTigers){
        this.monsterTigers = monsterTigers;
    }
}
