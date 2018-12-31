package Adapter;

import java.io.IOException;

/**
 * FileIOインタフェース
 *
 * @author sinokuma
 *
 */
public interface FileIO {
    /**
     * ファイル読み込み
     *
     * @param filename ファイル名
     */
    void readFromFile(String filename) throws IOException;

    /**
     * ファイル書き込み
     *
     * @param filename ファイル名
     */
    void writeToFile(String filename) throws IOException;

    /**
     * 値を設定する
     *
     * @param key キー値
     * @param value 設定値
     */
    void setValue(String key, String value);

    /**
     * 値を取得する
     *
     * @param key キー値
     * @return 設定値
     */
    String getValue(String key);

}
