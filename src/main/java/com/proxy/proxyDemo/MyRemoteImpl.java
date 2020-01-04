package com.proxy.proxyDemo;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {


    public MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayhello() throws RemoteException {
        return "Server syas,Hey";
    }

    public static void main(String[] args) {
        MyRemote service = null;
        try {
            service = new MyRemoteImpl();
            Naming.rebind("remoteHello",service);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
