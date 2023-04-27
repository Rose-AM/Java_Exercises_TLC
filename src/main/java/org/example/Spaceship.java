package org.example;

public class Spaceship {
    Seat seat = new Seat();

    //book a new seat
    public void bookSeat(String id, String name, Seat seat) {
//        Seat seat;
        if (seat instanceof Human){
            seat = new Human(id, name);
        }
        else {
            seat = new Martian(id, name);
        }

    }







//    public Spaceship(Seat seat){
//        this.seat = seat;
//    }

//    public void bookAseat(String id, String name){
//        this.seat = new Seat(id, name);
//    }
}
