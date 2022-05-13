package model;

public class FreeRoom extends Room {

    public FreeRoom(String roomNumber, RoomType enumeration){
        super(roomNumber,0.00,enumeration);
    }

    @Override
    public String toString() {
        return "FreeRoom: " + super.toString();
    }

}
