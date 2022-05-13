package model;
//methods in the interface so cannot have instance variable and have multiple inheritance
public interface IRoom {

    public String getRoomNumber();

    public Double getRoomPrice();

    public RoomType getRoomType();

    public boolean isFree();
}
