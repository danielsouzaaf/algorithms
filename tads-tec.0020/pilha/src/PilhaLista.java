public class PilhaLista implements Pilha{

    private No atual, inicio;

    private int t = -1;

    public Object pop() throws EPilhaVazia {
        if (isEmpty())
                throw new EPilhaVazia("A pilha tá vazia!");

        No n = inicio;
        while(n.getProximo() != atual)
            n = n.getProximo();
        No popped = n.getProximo();
        n.setProximo(null);
        t--;

        return popped.getElemento();
    }

    public int size() {
        return t + 1;
    }

    public boolean isEmpty() {
        return t < 0;
    }

    public Object top() throws EPilhaVazia {
        if (isEmpty())
            throw new EPilhaVazia("A pilha tá vazia!");

        return atual.getElemento();
    }

    public void push(Object o) {
        No node = new No();
        node.setElemento(o);
        if(t < 0)
            inicio = node;
        atual.setProximo(node);
        atual = node;
        ++t;

    }



}
