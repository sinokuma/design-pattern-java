package Adapter.Sample02;

/**
 * 文字列表示抽象クラス
 *
 * @author sinokuma
 *
 */
public abstract class Print {
    /**
     * 文字列を()付きで表示する
     */
    public abstract void printWeak();

    /**
     * 文字列を*で挟んで表示する
     */
    public abstract void printStrong();
}
