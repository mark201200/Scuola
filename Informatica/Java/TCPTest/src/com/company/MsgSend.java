package com.company;

import java.io.*;
import java.net.*;
import java.util.*;

public class MsgSend extends Thread {

    private InetAddress address;
    private Socket socket = null;                   //vedi MsgRcv
    private BufferedReader reader = null;
    private PrintWriter writer = null;
    private String uname = null;

    public MsgSend(String add) throws UnknownHostException {
        address = InetAddress.getByName(add);               //converte l'indirizzo da String a InetAddress, che viene usato dal socket.
    }

    public void run() {

        try {
            socket = new Socket(address, 1337);        //Crea il socket sulla porta 1337
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        boolean isRunning = true;                            		 	//vedi MsgRcv
        reader = new BufferedReader(new InputStreamReader(System.in));  //Un lettore, legge quello che scrivo in console.

        try {
            writer = new PrintWriter(socket.getOutputStream(), true);  //uno scrittore, scrive il mio messaggio nello stream del socket.
        } catch (IOException e) {
            e.printStackTrace();
        }

        String input;                                                   //Il mio input. Cioè quello che scrivo in console.

        while (isRunning) {
            if(uname==null){											//se non ho messo l'user, chiedilo.
                System.out.println("\nInserisci il tuo username: ");
                try {
                    input = reader.readLine();                              //Il reader legge ciò che scrivo
                    writer.println(input);
                    if (input.equals("Stop."))                              //se scrivo "Stop." il programma si ferma
                        isRunning = false;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("\nInserisci il tuo messaggio: ");
            try {
                input = reader.readLine();                              //Il reader legge ciò che scrivo
                writer.println(input);									//Il writer lo scrive nello stream, vedi riga 32 
                if (input.equals("Stop."))                              //se scrivo "Stop." il programma si ferma
                    isRunning = false;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
		
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}
