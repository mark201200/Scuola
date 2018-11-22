package com.company;

import java.io.*;
import java.net.*;
import java.util.*;

public class MsgRcv extends Thread {

    private byte[] buffer = new byte[256];  //Creo un buffer, conterrà il messaggio ricevuto.
    private DatagramSocket socket = null;
    private DatagramPacket packet = null;
    //^Inizializzo socket e pacchetto, mi serviranno dopo.


    public void run() {                     //Faccio l'override del metodo run, cosi chiamando .start() nel main...
        //... mi si creerà un thread. Notare che la classe estende Thread.

        boolean isRunning = true;           //se è falsa, esce. Vedi rigo 37
        String recv = null;                 //Stringa che conterrà il messaggio ricevuto, tutto bello formattato.

        try {
            socket = new DatagramSocket(1337); //creo un socket sulla porta
        } catch (SocketException e) {
            e.printStackTrace();
        }

        packet = new DatagramPacket(buffer, buffer.length); //inizializzo il pacchetto, gli dò il buffer.
        // Non gli dò ip/porta perche ora deve ricevere, non gli serve.

        while (isRunning) {
            try {
                socket.receive(packet);     //Riceve un pacchetto dalla porta 1337
            } catch (IOException e) {
                e.printStackTrace();
            }

            //Una volta ricevuto, lo metto in una stringa.
            recv = new String(packet.getData(), 0, packet.getLength());


            //Lo stampo, ovviamente
            System.out.println("\nRicevuto messaggio da: " + packet.getAddress() + "  " + recv);

            if (recv.equals("Stop."))        // Se il messaggio che mi arriva è "Stop." allora si chiude.
                isRunning = false;

        }
        socket.close();
        System.exit(0);
    }

}
