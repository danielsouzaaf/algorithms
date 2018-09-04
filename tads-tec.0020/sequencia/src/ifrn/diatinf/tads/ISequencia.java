package ifrn.diatinf.tads;

public interface ISequencia {

    public int size();

    public boolean isEmpty();

    public No elemAtRank(int r);

    public void replaceAtRank(int r, Object o);

    public void insertAtRank(int r, Object o);

    public Object removeAtRank(int r);

    public Object first();

    public Object last();

    public Object before(No n);

    public Object after(No n);

    public Object replaceElement(Object n, Object o);

    public Object swapElements(Object n, Object q);

    public Object insertBefore(Object n, Object o);

    public Object insertAfter(Object n, Object o);

    public Object insertFirst(Object o);

    public Object insertLast(Object o);

    public Object remove(No n);

    public Object atRank(int r);

    public Object rankOf(Object n);
}
