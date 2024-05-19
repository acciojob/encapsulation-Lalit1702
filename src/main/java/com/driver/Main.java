package com.driver;
public class Main {
  public static void main(String[] args) {
    RWOnly read = new RWOnly();
    read.setName("Lalit");
    System.out.print(read.getName());
  }
}