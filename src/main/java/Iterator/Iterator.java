package Iterator;

/**
 * イテレートインタフェース
 *
 * @author sinokuma
 *
 */
public interface Iterator {
    /**
     * 次の要素が存在するか確認する
     *
     * @return 存在する場合はtrue/存在しない場合はfalse
     */
    boolean hasNext();

    /**
     * 集合体の要素を返却する
     *
     * @return 集合体の要素オブジェクト
     */
    Object next();
}