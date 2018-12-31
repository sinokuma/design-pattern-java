package Adapter.Sample01;

/**
 * 文字列表示インターフェース
 *
 * @author sinokuma
 *
 */
public interface Print {
    /**
     * 文字列を()付きで表示する
     */
    void printWeak();

    /**
     * 文字列を*で挟んで表示する
     */
    void printStrong();
}
