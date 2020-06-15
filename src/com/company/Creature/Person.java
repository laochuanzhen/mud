package com.company.Creature;

import com.company.Attack.Knife;
import com.company.Room;
import com.company.Ui;

/**
 * @description:
 * @author: ASUS
 * @date: Created in 2020/6/15 23:20
 * @version: ${VERSION}
 * @modified By:
 */
public class Person extends  Creature{
    private String id;
    private String name;
    private Room currentRoom;

    public void go(String targetRoomId) {
        Room room = this.currentRoom.searchReachableRoomById(targetRoomId, this.currentRoom.getReachableRooms());
        if (room != null) {
            this.currentRoom = room;
            Ui.displayReachableRooms(this);
        } else {
            Ui.printNoRoom();
        }

    }

    @Override
    public void useKnife(Knife currentknife, Creature targetCreature) {
       currentknife.useKnife(targetCreature);
    }

    public Person() {
    }

    public Person(String id, String name, Room currentRoom) {
        this.id = id;
        this.name = name;
        this.currentRoom = currentRoom;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room getCurrentRoom() {
        return this.currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }
}

