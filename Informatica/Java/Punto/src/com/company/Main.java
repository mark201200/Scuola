package com.company;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(10, 10);
        Point p2 = new Point(9, 9);
        OrientedPoint p3 = new OrientedPoint(10, 10, 'N');
        OrientedPoint p4 = new OrientedPoint(10, 10, 'S');
        System.out.println("Distanza dall'origine p1: " + p1.DistanzaOriginePoint());
        System.out.println("Distanza p1 p2: " + p1.DistanzaPoint(p2));
        System.out.println("p1 piu vicino a 0 di p2?: " + p1.VicinanzaOriginePoint(p2));
        System.out.println("p1 = p2?: " + p1.UguaglianzaPoint(p2));
        p2.SpostaPoint(1, 1);
        System.out.println("p1 = p2 SPOSTATO?: " + p1.UguaglianzaPoint(p2));
        System.out.println("p3 = p4?: " + p3.UguaglianzaPoint(p4));
        System.out.println("p3 = p4Spostato?: " + p3.UguaglianzaPoint(p4));
        p3.giraPoint();
        p3.giraPoint();
        System.out.println("p3 = p4Spostato?: " + p3.UguaglianzaPoint(p4));
        System.out.println("p3 tostring: " + p3.toString());
        System.out.println("p4 tostring: " + p4.toString());



    }
}
