package com.company.finalmethods;

class A{
    protected int val;
    final public int getVal(){
        return this.val;
    }
    final public void setVal(int val){
        this.val = val;
    }
}
class Astar extends A{
    @Override
    public int getVal(){//Ошибка. Метод getVal - final
        return this.val + 1;
    }

}
final class B{
    public String str;
}
class Bstar extends B{//Ошибка. Класс B - final

}

public class Main {
}
