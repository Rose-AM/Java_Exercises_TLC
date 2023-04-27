package org.example;

public class Martian extends Seat{

    private Seat martianSeat;

    public Martian(String id, String nameOfPerson) {
        super(id, nameOfPerson);
    }

    @Override
    public void meal() {
        System.out.println("Martian Food");
    }


}
