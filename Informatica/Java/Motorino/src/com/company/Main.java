package com.company;

public class Main {

    public static void main(String[] args) {
        Motorino m1 = new Motorino("grigioMetallizzato", 40.5, "Piagio Liberty");
        MotorinoImmatricolato m2 = new MotorinoImmatricolato("rosso", 30.5, "Aprilia Scarabeo", "CV1234", 60);
        System.out.println("MaxV M2: "+m2.getMax());
        m1.accelera(30.7);
        m2.accelera(30.7);
        System.out.println("Velocita m1: "+m1.getVelocita());
        System.out.println("Velocita m2: "+m2.getVelocita());

    }
}
