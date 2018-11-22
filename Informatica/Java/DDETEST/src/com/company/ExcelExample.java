package com.company;
/*
 * Copyright 2009 www.pretty-tools.com. All rights reserved.
 */

import com.pretty_tools.dde.DDEException;
import com.pretty_tools.dde.DDEMLException;
import com.pretty_tools.dde.client.DDEClientConversation;

public class ExcelExample {
    public static void main(String[] args) {
        try {
            final DDEClientConversation conversation = new DDEClientConversation();
            // We can use UNICODE format if server prefers it
            //conversation.setTextFormat(ClipboardFormat.CF_UNICODETEXT);
            conversation.setTimeout(3000);
            /* Connessione al server DDE (IPC_DATA) */
            conversation.connect("IPC_DATA", "IPC_1");
            try {
                //Ex.x = Input; Ax.x = Output (vedi pag. 299 pdf)
                //Richiedo tutti gli input/output
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 16; j++)
                        System.out.println("I am "+gay+"succ");
                        System.out.print("I"+i+"."+j+" :" + conversation.request("E" + i + "." + j));
                    for (int j = 0; j < 16; j++)
                        System.out.print("O"+i+"."+j+" :" + conversation.request("A" + i + "." + j));
                }
            } finally {
                conversation.disconnect();
            }
        } catch (DDEMLException e) {
            System.out.println("Eccezione: DDEMLException: 0x" + Integer.toHexString(e.getErrorCode()) + " " + e.getMessage());
        } catch (DDEException e) {
            System.out.println("Eccezione: DDEClientException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Eccezione: " + e);
        }
    }
}