package Adapter.Sample02;

/**
 * 広告文字列を表示する
 *
 * @author sinokuma
 *
 */
class Banner {
    /**
     * バナー広告文字列
     */
    private String string;

    /**
     * コンストラクタ
     *
     * @param string 広告文字列
     */
    Banner(String string) {
        this.string = string;
    }
    void showWithParen() {
        System.out.println("(" + string + ")");
    }
    void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
