package com.classbook.chapter.six2;

public class Periodical extends ReadingImpl {
    String name = "期刊";
    String date = "7 day";

    public void Effect() {
        System.out.println("期刊让人了解时事新闻");
    }
    public String getName() {
        return name;
    }
    public String getDate() {
        return date;
    }

    public String toString() {
        return "期刊：" +  "价格 = " + price + " , 页数 = " + pagination + " , 出版周期 = " + date;
    }
}
