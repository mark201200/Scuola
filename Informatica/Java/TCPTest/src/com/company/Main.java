package com.company;

import java.io.*;
import java.net.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws UnknownHostException {

        MsgSend sender = new MsgSend(args[0]);
        MsgRcv receiver = new MsgRcv();

        sender.start();
        receiver.start();

    }
}
