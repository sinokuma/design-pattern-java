package Adapter.Sample02;

/**
 * バナーを表示する
 *
 * @author sinokuma
 *
 */
public class PrintBanner extends Print {
    /**
     * 広告文字列表示クラス
     */
    private Banner banner;

    /**
     * コンストラクタ
     *
     * @param string 広告文字列
     */
    PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
