package com.apple.chapter.six;

/**
 * @program: classprogram
 * @Description: 继承父类Book
 * @author: 卓佳倩
 * @date: 2019/10/27 上午
 */
public class Dictionary extends Book {
    private int definitions;
//使用this调用另外一种构造方法
    public Dictionary(int definitions) {
        this.definitions = definitions;
    }
//使用super把bookId, bookName, pages作为参数传递给父类。注意：这个super一定要放在构造方法第一行，并且每个构造方法只可以有一个super（）
    public Dictionary(String bookId, String bookName, int pages, int definitions) {
        super(bookId, bookName, pages);
        this.definitions = definitions;
    }

    public int getDefinitions() {
        return definitions;
    }

    public void setDefinitions(int definitions) {
        this.definitions = definitions;
    }


    //覆盖
    public String getBookId(){
        return DefaultValue.DICTIONARY_SKU + super.getBookId();
    }
}
