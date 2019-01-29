package 迭代模式;

public class BookShelf implements Aggregate {
    private Book[] books;
    private int last=0;

    public BookShelf(int maxsize) {
        books=new Book[maxsize];
    }
    public Book getBookAt(int index){
        if(index>=last) return null;
        return books[index];
    }

    public void append(Book book){
        books[last]=book;
        last++;
    }
    public int getLenght(){
        return last;
    }

    @Override
    public IteratorTest iteratorTest() {
        return new BookShelfIterator(this);
    }
}
