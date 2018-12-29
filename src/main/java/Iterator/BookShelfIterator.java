package Iterator;

/**
 * 本棚イテレータクラス
 *
 * @author sinokuma
 *
 */
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    /**
     * コンストラクタ
     *
     * @param bookShelf 本棚
     */
    BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < bookShelf.getLength();
    }
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}