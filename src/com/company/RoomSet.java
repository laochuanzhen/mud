package com.company;

/**
 * @description:
 * @author: ASUS
 * @date: Created in 2020/6/15 23:21
 * @version: ${VERSION}
 * @modified By:
 */
import java.util.ArrayList;
import java.util.Iterator;

public class RoomSet {
    ArrayList<Room> rooms = new ArrayList();

    public RoomSet() {
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public Room searchRoomById(String roomId) {
        Room room = null;
        Iterator var3 = this.rooms.iterator();

        while(var3.hasNext()) {
            Room item = (Room)var3.next();
            if (item.getId().equals(roomId)) {
                room = item;
                break;
            }
        }

        return room;
    }
}

