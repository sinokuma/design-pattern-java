package Adapter.Sample02;

/**
 * Adapter動作メインクラス
 *
 * 委譲を使うAdapterパターン
 *
 */
public class Main {
    public static void main(String[] args) {
        // Printクラスのメソッドのみ用いる点を強調するためPrint型で宣言
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
