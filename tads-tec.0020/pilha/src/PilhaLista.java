public class PilhaLista implements Pilha{

    private No atual, inicio;

    public PilhaLista(int tam) {
        this.S = new Object[tam];
    }

    public Object pop() throws EPilhaVazia {
        if (isEmpty())
                throw new EPilhaVazia("A pilha tá vazia!");

        Object temp = S[t];
        S[t] = null;
        t--;

        return temp;
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

        return S[t];
    }

    public void push(Object o) {
        if (t + 1 == S.length)
        {
            Object temp[] = new Object[S.length * 2];

            for (int i = 0; i <= t; i++)
                temp[i] = S[i];

            S = temp;
        }
        S[++t] = o;
    }



}
