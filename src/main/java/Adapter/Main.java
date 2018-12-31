package Adapter;

import java.io.IOException;

/**
 * Adaptor動作用クラス
 *
 * プロパティをファイルに保存する
 *
 */
public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            // ファイルはdesign-pattern-java直下に配置
            f.readFromFile("file.txt");
            f.setValue("year", "2018");
            f.setValue("month", "12");
            f.setValue("day", "31");
            f.writeToFile("new-file.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
