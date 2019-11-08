package com.classbook.chapter.six2;

public class Magazine extends ReadingImpl {
    String name = "杂志";
    //出版周期
    String date = "15 days";

    @Override
    public void Effect() {
        System.out.println("这是杂志类");
    }
    public String getName() {
        return name;
    }
    public String getDate() {
        return date;
    }

    public String toString() {
        return "杂志：" +  "价格 = " + price + " , 页数 = " + pagination + " , 出版周期 = " + date;
    }
}
