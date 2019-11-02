package com.apple.chapter.six;

/**
 * @program: classprogram
 * @Description: 创建Shape虚拟类，以及内部的抽象方法draw()和erase()，并且创建Circle类和Square类继承，并实现抽象方法（输出一段内容即可，可以参考书本108页，程序6-8），同时创建一个main()函数，调用Circle类和Square类中的方法。
 * @author: 卓佳倩
 * @date: 2019/11/02
 */


abstract class Shape{
    abstract void draw();
    abstract void erase();
}

class Circle extends Shape{
    void draw(){
        System.out.println("Circle.draw()");
    }

    @Override
    void erase() {

    }

    void earse(){
        System.out.println("Circle.erase()");
    }
}

class Square extends Shape{
    void draw(){
        System.out.println("Square.draw()");
    }
    void erase(){
        System.out.println("Square.erase()");
    }
}
public class Shapes {
    public static Shape randShape(){
        switch((int)(Math.random()*3)){
            default:
            case 0:return new Circle();
            case 1:return new Square();
        }
    }
    public static void main(String[] args){
        Shape[] s = new Shape[9];
        for (int i = 0;i<s.length;++i)
            s[i] = randShape();
        for(int i = 0;i<s.length;++i)
            s[i].draw();
    }
}
