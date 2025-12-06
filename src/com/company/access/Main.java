package com.company.access;

import com.company.access.vector.MovingVector;
import com.company.access.vector.MyVector;
class VectorUtils{
    static MyVector perpendicularLeftHand(MyVector a){
        return new MyVector(-a.getY(),a.getX());
    }
    final static double accelmult = 0.01;
}
public class Main {
    public static void main(String[] args){
        MovingVector dot = new MovingVector(10,0,new MyVector(0,1));
        double starttime = (double)System.nanoTime()/1000000;
        double curtime = (double)System.nanoTime()/1000000;
        do{
            MyVector temp = VectorUtils.perpendicularLeftHand(dot.getSpeed());
            temp.scalarMult(VectorUtils.accelmult);
            dot.updateSpeed(temp);
            dot.move(Math.abs((double)System.nanoTime()/1000000 - curtime));
            curtime = (double)System.nanoTime()/1000000;
            System.out.println("x: "+dot.getX()+" y: "+dot.getY());
        }while(curtime - starttime <= 100);
    }
}
