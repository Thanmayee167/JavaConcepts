package relationships;

import java.util.ArrayList;
import java.util.List;

class Room {
    String name;

    Room(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class House {
    String address;
    List<Room> rooms;

    House(String address) {
        this.address = address;
        this.rooms = new ArrayList<>();
    }

    void addRoom(String roomName) {
        Room room = new Room(roomName);
        rooms.add(room);
    }

    void displayRooms() {
        for (Room room : rooms) {
            System.out.println(room.getName());
        }
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        House house = new House("123 Main St");
        house.addRoom("Living Room");
        house.addRoom("Bedroom");

        house.displayRooms();
    }
}

