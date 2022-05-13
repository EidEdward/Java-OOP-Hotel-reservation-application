package service;

import model.Customer;
import model.Reservation;
import model.IRoom;

import java.util.*;

public class ReservationService {
    public static List<IRoom> rooms = new ArrayList<IRoom>();
    static List<Reservation> reservations = new ArrayList<Reservation>();

    private ReservationService() {

    }

    public static ReservationService getInstance() {
        return new ReservationService();
    }

    public void addRoom(IRoom room) {
        rooms.add(room);
    }

    public IRoom getARoom(String roomId) {
        for(IRoom room:rooms) {
            if(room.getRoomNumber().equals(roomId)) {
                return room;
            }
        }
        return null;
    }

    public Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {
        Reservation reservation = new Reservation(customer, room, checkInDate, checkOutDate);
        reservations.add(reservation);
        return reservation;
    }

    public Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate) {
        ArrayList<IRoom> available = new ArrayList<IRoom>();
        for(Reservation reservation:reservations) {
            boolean flag = true;
            for(IRoom room:rooms) {
                if(room.getRoomNumber().equals(reservation.getRoom().getRoomNumber())) {
                    if(checkInDate.equals(reservation.getCheckInDate()) || checkInDate.equals(reservation.getCheckOutDate())||
                            checkOutDate.equals(reservation.getCheckInDate()) || checkOutDate.equals(reservation.getCheckOutDate())) {
                        flag = false;
                    }
                    else if((checkInDate.after(reservation.getCheckInDate()) && checkInDate.before(reservation.getCheckOutDate())) ||
                            (checkOutDate.after(reservation.getCheckInDate()) && checkOutDate.before(reservation.getCheckOutDate())) ||
                            (checkInDate.before(reservation.getCheckInDate()) && checkOutDate.after(reservation.getCheckInDate())) ||
                            (checkInDate.before(reservation.getCheckInDate()) && checkOutDate.after(reservation.getCheckOutDate()))) {
                        flag = false;
                    }
                }
                if(flag) {
                    if(!available.contains(room)) {
                        available.add(room);
                    }
                }
                else {
                    if(available.contains(room)) {
                        available.remove(room);
                    }
                }

            }
        }
        return available;
    }

    public Collection<Reservation> getCustomerReservation(Customer customer) {
        ArrayList<Reservation> reservation = new ArrayList<Reservation>();
        for(Reservation reserve:reservations) {
            if(reserve.getCustomer().equals(customer)) {
                reservation.add(reserve);
            }
        }
        return reservation;
    }

    public void printAllReservation() {
        for(Reservation reservation: reservations) {
            System.out.println(reservation);
        }
    }
}

