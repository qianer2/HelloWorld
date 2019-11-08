package com.classbook.chapter.six2;

public class TextBook extends ReadingImpl {

    String name = "课本";

    @Override
    public void Effect() {
        System.out.println("学生通过课本来认识世界");
    }
    @Override
    public void FitObject() {
        System.out.println("课本是学生接触最多的传播知识的媒介");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "课本 ：" +  "价格 = " + price + " , 页数 = " + pagination;
    }
}
