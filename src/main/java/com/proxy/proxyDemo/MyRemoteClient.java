package com.proxy.proxyDemo;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyRemoteClient {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {

        MyRemote myRemote = (MyRemote) Naming.lookup("rmi://127.0.0.1/remoteHello");
        String s = myRemote.sayhello();
        System.out.println(s);
        System.out.println("over");

    }
}
