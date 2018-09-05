package ifrn.diatinf.tads;

public class Sequencia implements ISequencia{

    private No inicio;

    private No fim;

    private int quantidade = 0;

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return this.quantidade == 0;
    }

    @Override
    public No elemAtRank(int r) {
        if (r > this.quantidade) {
            return null;
        }

        No node = this.inicio;
        for (int i = 0; i < r; i++)
        {
            node = node.getProximo();
        }

        return node;
    }

    @Override
    public void replaceAtRank(int r, Object o) {
        if (r > this.quantidade) {
            throw new IndexOutOfBoundsException();
        }

        No node = new No();
        node.setValor(o);
        No replacable = this.inicio;
        for (int i = 0; i < r; i++)
        {
            replacable = this.inicio.getProximo();
        }
        node.setAnterior(replacable.getAnterior());
        node.setProximo(replacable.getProximo());

        replacable.getAnterior().setProximo(node);
        replacable.getProximo().setAnterior(node);
    }

    @Override
    public void insertAtRank(int r, Object o) {
        //Perguntar a coleguinha qual a diferença do insert at rank para o replace at rank?
    }

    @Override
    public Object removeAtRank(int r) {
        if (r > this.quantidade) {
            throw new IndexOutOfBoundsException();
        }

        No replacable = this.inicio;
        for (int i = 0; i < r; i++)
        {
            replacable = this.inicio.getProximo();
        }

        replacable.getProximo().setAnterior(replacable.getAnterior());
        replacable.getAnterior().setProximo(replacable.getProximo());

        return replacable.getValor();
    }

    @Override
    public Object first() {
        return this.inicio.getValor();
    }

    @Override
    public Object last() {
        return this.inicio.getValor();
    }

    @Override
    public Object before(No n) {
        return n.getAnterior().getValor();
    }

    @Override
    public Object after(No n) {
        return n.getProximo().getValor();
    }

    @Override
    public Object replaceElement(Object n, Object o) {

        return null;
    }

    @Override
    public Object swapElements(Object n, Object q) {
        return null;
    }

    @Override
    public Object insertBefore(Object n, Object o) {
        return null;
    }

    @Override
    public Object insertAfter(Object n, Object o) {
        return null;
    }

    @Override
    public Object insertFirst(Object o) {
        return null;
    }

    @Override
    public Object insertLast(Object o) {
        return null;
    }

    @Override
    public Object remove(No n) {
        return null;
    }

    @Override
    public Object atRank(int r) {
        return null;
    }

    @Override
    public Object rankOf(Object n) {
        return null;
    }
}
