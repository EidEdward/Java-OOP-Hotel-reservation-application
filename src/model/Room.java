package model;
//implements the Iroom interface
public class Room implements IRoom {

    private String roomNumber;
    private Double price;

    private RoomType enumeration; // using the RoomType enum

    public Room (String roomNumber, Double price, RoomType enumeration){
        this.roomNumber = roomNumber;
        this.price = price;
        this.enumeration = enumeration;

    }


    @Override
    public String getRoomNumber() {
        return this.roomNumber;
    }

    @Override
    public Double getRoomPrice() {
        return this.price;
    }

    @Override
    public RoomType getRoomType() {
        return this.enumeration;
    }

    @Override
    public boolean isFree() {
        return (this.price == 0);
    }

    @Override
    public String toString() {
        return "Room Number: " + this.roomNumber
                + " Price: $" + this.price
                + " Enumeration: " + this.enumeration;
    }
}
