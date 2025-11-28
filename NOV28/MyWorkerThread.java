package com.mphasis.Maven_JDBC;

public class MyWorkerThread extends Thread{

	@Override
    public void run() {
        System.out.println("Hello from MyWorkerThread!");
    }
}
