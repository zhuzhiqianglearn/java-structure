package 迭代模式;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf=new BookShelf(4);
        bookShelf.append(new Book("java"));
        bookShelf.append(new Book("c"));
        System.out.println(bookShelf.getLenght());
        bookShelf.append(new Book("c++"));
        bookShelf.append(new Book("python"));
        System.out.println(bookShelf.getLenght());
        IteratorTest iteratorTest = bookShelf.iteratorTest();
        System.out.println(((Book)iteratorTest.next()).getName());
        System.out.println(((Book)iteratorTest.next()).getName());
        ArrayList arrayList=new ArrayList(2);
        arrayList.add(1,"1");
        Iterator iterator = arrayList.iterator();
        System.out.println((String)iterator.next());
        System.out.println(((String)iterator.next()));

    }
}
