package Adapter.Sample01;

/**
 * Adapter動作メインクラス
 *
 * 継承を使うAdapterパターン
 *
 */
public class Main {
    public static void main(String[] args) {
        // Printインタフェースのメソッドのみ用いる点を強調するためPrint型で宣言
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
