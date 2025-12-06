package com.company.access.vector;
import com.company.access.vector.MyVector;
public class MovingVector extends MyVector{
    private MyVector speed;//private для инкапсуляции
    public MovingVector(){
        super();
        this.speed = new MyVector();
    }
    public MovingVector(double x, double y) {
        super(x, y);
        this.speed = new MyVector();
    }
    public MovingVector(double x, double y, MyVector speed){
        super(x,y);
        this.speed = speed;
    }
    public MyVector getSpeed() {
        return this.speed;
    }
    public void updateSpeed(MyVector adj){//update the vector's current velocity
        this.speed.addVector(adj);
    }
    public void move(double t){//move the vector with the current velocity based on time passed
        MyVector temp = new MyVector();
        temp.matchVector(speed);
        temp.scalarMult(t);
        this.addVector(temp);
    }
}
