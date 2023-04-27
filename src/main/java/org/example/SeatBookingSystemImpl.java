package org.example;

public class SeatBookingSystemImpl implements SeatBookingSystem{
//    Seat seat;

    @Override
    public void bookSeat(String id, String name) {
        Seat seat;
        seat = new Seat(id, name);

    }


    }
}
