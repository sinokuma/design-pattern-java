package Iterator;

/**
 * Iterator動作メインクラス
 *
 * @author sinokuma
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        bookShelf.appendBook(new Book("Effective Java"));
        Iterator it = bookShelf.iterator();
        // Iteratorパターンの使用により、whileループはBookShelf実装に依存しない
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}