/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latian5;

/**
 *
 * @author Lenovo
 */
public class MountainTruck extends Truck 
{
public int seatHigh;
  public MountainTruck (int startHeight, int startCadence, int startSpeed, int startGear){
        super (startCadence, startSpeed, startGear);
    int seatHeight;
    seatHeight = startHeight;
    }
    //the mountain subclass adds one method
    public void setHeight(int newValue){
    int seatHeight = newValue;
    }
    public static void main(String[] args) {
        System.out.println("mulai berjalan");
        MountainTruck MB = new MountainTruck(0,0,0,0);
        System.out.println("gear = "+MB.gear);
        System.out.println("speed = "+MB.speed);
        MB.setGear(2);
        MB.speedUp(2);
        System.out.println("gear = "+MB.gear);
        System.out.println("speed = "+MB.speed);
        MB.speedUp(2);
        System.out.println("gear = "+MB.gear);
        System.out.println("speed = "+MB.speed);
    }
    
}