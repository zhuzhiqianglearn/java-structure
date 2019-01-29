package 迭代模式;

public class BookShelfIterator implements IteratorTest {
    private BookShelf bookShelf;
    private int index=0;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hashNext() {
        return false;
    }

    @Override
    public Object next() {
        Book book=bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
