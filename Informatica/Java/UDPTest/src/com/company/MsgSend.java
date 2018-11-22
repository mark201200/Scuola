package com.company;

import java.io.*;
import java.net.*;
import java.util.*;

public class MsgSend extends Thread {

    private InetAddress address;

    private byte[] buffer = new byte[256];
    private DatagramSocket socket = null;                   //vedi MsgRcv
    private DatagramPacket packet = null;
    private BufferedReader reader = null;

    public MsgSend(String add) throws UnknownHostException {
        address = InetAddress.getByName(add);               //converte l'indirizzo da String a InetAddress, che viene usato dal socket.
    }

    public void run() {

        try {
            socket = new DatagramSocket(65534);        //Crea il socket sulla porta 65534, che è diversa da sotto
            // perchè apparentemente non posso ascoltare dalla stessa porta
        } catch (SocketException e) {
            e.printStackTrace();
        }

        boolean isRunning = true;                             //vedi MsgRcv
        reader = new BufferedReader(new InputStreamReader(System.in));  //Un lettore, legge quello che scrivo in console.
        String input;                                                   //Il mio input. Cioè quello che scrivo in console.

        while (isRunning) {
            System.out.println("\nInserisci il tuo messaggio: ");
            try {
                input = reader.readLine();                              //Il reader legge ciò che scrivo
                buffer = input.getBytes();                              //il mio input viene inserito nel buffer
                packet = new DatagramPacket(buffer, buffer.length, address, 1337); //dichiaro il pacchetto
                socket.send(packet);                                    //e lo mando.
                if (input.equals("Stop."))                               //se scrivo "Stop." il programma si ferma
                    isRunning = false;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        socket.close();
        System.exit(0);
    }
}
