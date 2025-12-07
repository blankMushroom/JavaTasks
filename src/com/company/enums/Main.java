package com.company.enums;

import java.util.Random;

enum State{//состояние некого обьекта. INIT - изначальное, GROW - растущее, ADULT - выросшее, DECAY - помеченное на удаление
    INIT, GROW, ADULT, DECAY;
    public boolean ShouldChange(){
        return this == GROW || this == DECAY;
    }
}
class A{
    private State state;
    public A(){
        this.state = State.INIT;
    }
    public State getState(){
        return this.state;
    }
    public void setState(State state){
        this.state = state;
    }
}
public class Main {
    public static void main(String[] args){
        A a = new A();
        Random r = new Random();
        while(true){
            if(a.getState().ShouldChange()&&r.nextInt()%4==1){
                if(a.getState()==State.DECAY){
                    break;
                }
                a.setState(State.ADULT);
            } else if (a.getState()==State.INIT&&r.nextInt()%16==1) {
                a.setState(State.GROW);
            }else if(r.nextInt()%100==1) {
                a.setState(State.GROW);
            }
        }
    }
}
