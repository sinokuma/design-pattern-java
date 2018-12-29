package Iterator;

/**
 * Bookエンティティ
 *
 * @author sinokuma
 *
 */
class Book {
    private String name;

    /**
     * コンストラクタ
     *
     * @param name 本の名称
     */
    Book(String name) {
        this.name = name;
    }


    /**
     * 本の名称を取得します
     *
     * @return 本の名称
     */
    String getName() {
        return name;
    }
}