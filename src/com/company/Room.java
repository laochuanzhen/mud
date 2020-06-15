package com.company;

import java.util.HashMap;

/**
 * @description:
 * @author: ASUS
 * @date: Created in 2020/6/15 23:20
 * @version: ${VERSION}
 * @modified By:
 */
public class Room {
    private String id;
    private String description;
    private HashMap<String, Room> reachableRooms = new HashMap();

    public void addReachableRoom(String roomId, Room room) {
        this.reachableRooms.put(roomId, room);
    }

    public Room searchReachableRoomById(String targetRoomId, HashMap<String, Room> reachableRooms) {
        Room room = null;
        if (reachableRooms.containsKey(targetRoomId)) {
            room = (Room)reachableRooms.get(targetRoomId);
        }

        return room;
    }

    public String toString() {
        return this.description;
    }

    public Room() {
    }

    public Room(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HashMap<String, Room> getReachableRooms() {
        return this.reachableRooms;
    }

    public void setReachableRooms(HashMap<String, Room> reachableRooms) {
        this.reachableRooms = reachableRooms;
    }
}
