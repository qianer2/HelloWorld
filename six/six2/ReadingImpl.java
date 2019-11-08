package com.classbook.chapter.six2;

public class ReadingImpl implements ReadingInte {

    @Override
    public void Effect() {
        System.out.println("各种读物");
    }

    @Override
    public void FitObject() {
        System.out.println("读物不受人种影响");
    }

    public int getPrice() {
        return price;
    }

    public int getPagination() {
        return pagination;
    }

}
