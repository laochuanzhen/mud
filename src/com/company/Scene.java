package com.company;

import com.company.Creature.MonsterTiger;
import com.company.Creature.MonsterTigerSet;
import com.company.Creature.Person;

/**
 * @description:
 * @author: ASUS
 * @date: Created in 2020/6/15 23:21
 * @version: ${VERSION}
 * @modified By:
 */
public class Scene {
    RoomSet roomSet = new RoomSet();
    Person person = new Person();
    MonsterTigerSet monsterTigerSet = new MonsterTigerSet();
    public Scene() {
    }

    public void initScene() {
        this.initRooms();
        this.initPerson(this.roomSet.searchRoomById("1"));
    }

    private void initRooms() {
        Room outside = new Room("1", "院子");
        Room pub = new Room("2", "酒吧");

        outside.addReachableRoom("2", pub);

        pub.addReachableRoom("1", outside);

        this.roomSet.addRoom(outside);
        this.roomSet.addRoom(pub);

    }

    private void initPerson(Room room) {
        this.person.setId("01");
        this.person.setName("zs");
        this.person.setCurrentRoom(room);
    }

    public RoomSet getRoomSet() {
        return this.roomSet;
    }

    public void setRoomSet(RoomSet roomSet) {
        this.roomSet = roomSet;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public MonsterTigerSet getMonsterTigerSet() {
        return monsterTigerSet;
    }

    public void setMonsterTigerSet(MonsterTigerSet monsterTigerSet) {
        this.monsterTigerSet = monsterTigerSet;
    }

}