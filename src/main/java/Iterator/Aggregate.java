package Iterator;

/**
 * 集合体インタフェース
 *
 * @author sinokuma
 *
 */
public interface Aggregate {
    /**
     * イテレータを作成する
     *
     * @return Iteratorインタフェース
     */
    Iterator iterator();
}
