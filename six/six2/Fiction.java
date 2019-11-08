package com.classbook.chapter.six2;

public class Fiction extends ReadingImpl {

    String name = "小说";

    @Override
    public void Effect() {
        //调用父类方法
        super.Effect();
        System.out.println( "小说有很多种类型，阅读形式也很多" );
    }

        public void ReadingWay(){
        System.out.println("网络，实体书");
    }

    public String getName() {
        return name;
    }

    //重写toString方法
    @Override
    public String toString() {
        return "小说 ：" +  "价格 = " + price + " , 页数 = " + pagination;
    }
}
