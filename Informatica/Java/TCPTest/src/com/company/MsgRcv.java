package com.company;

import java.io.*;
import java.net.*;
import java.util.*;

public class MsgRcv extends Thread {

    private ServerSocket socket = null;
    private Socket clientSocket = null;
    private BufferedReader in;
    //^Inizializzo socket e reader, mi serviranno dopo.

    public void run() {                     //Faccio l'override del metodo run, cosi chiamando .start() nel main...
        //... mi si creerà un thread. Notare che la classe estende Thread.

        boolean isRunning = true;           //se è falsa, esce. Vedi rigo 30
        boolean gotName = false;			//se è falsa, chiede l'username
        String uname = null;
        String recv = null;                 //Stringa che conterrà il messaggio ricevuto, tutto bello formattato.

        try {
            socket = new ServerSocket(1337); //creo un socket sulla porta
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            clientSocket = socket.accept();     //Accetta la connessione del client
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (isRunning) {

            try {
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));		//legge lo stream del socket. praticamente mette ciò che arriva in recv
            } catch (IOException e) {
                e.printStackTrace();
            }

            //Una volta ricevuto, lo metto in una stringa.
            try {
                recv = in.readLine();												//mette il messaggio nella stringa recv
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (uname != null)
                System.out.println("\nRicevuto messaggio da " + uname + " : " + recv);	//se ho già settato l'user, mostra il messaggio normalmente
            else
                uname = recv;															//altrimenti, il primo messaggio ricevuto è sempre l'username dell'altro.
                
            if (recv.equals("Stop."))        // Se il messaggio che mi arriva è "Stop." allora si chiude.
                isRunning = false;

        }

        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

}
