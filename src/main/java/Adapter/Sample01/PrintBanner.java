package Adapter.Sample01;

/**
 * バナーを表示する
 *
 * @author sinokuma
 *
 */
public class PrintBanner extends Banner implements Print {

    /**
     * コンストラクタ
     *
     * @param string 広告文字列
     */
    PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
