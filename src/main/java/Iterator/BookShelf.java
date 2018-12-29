package Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 本棚クラス
 *
 * @author sinokuma
 *
 */
public class BookShelf implements Aggregate {
    private List<Book> books;
    private int last = 0;

    /**
     * コンストラクタ
     *
     * @param initialSize 本棚サイズ
     */
    BookShelf(int initialSize) {
        this.books = new ArrayList<>(initialSize);
    }

    /**
     * 本を取り出す
     *
     * @param index 本の位置
     * @return 本
     */
    Book getBookAt(int index) {
        return books.get(index);
    }

    /**
     * 本棚に本を入れる
     *
     * @param book 本
     */
    void appendBook(Book book) {
        this.books.add(book);
        last++;
    }

    /**
     * 本棚にある本の数を取得する
     *
     * @return 本の数
     */
    int getLength() {
        return last;
    }

    /**
     * イテレータを取得する
     *
     * @return イテレータ
     */
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}