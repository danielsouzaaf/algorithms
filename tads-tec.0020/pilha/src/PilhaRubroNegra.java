public class PilhaRubroNegra implements Pilha {

    private Object S[];

    private int tRubro = -1;

    private int tNegra;

    public PilhaRubroNegra(int tam) {
        this.tNegra = tam - 1;
    }

    public Object pop()
    {
        return null;
    }

    public Object top() {
        return null;
    }

    public boolean isEmpty()
    {
        return isEmptyNegra() && isEmptyRubro();
    }

    public void push(Object o){

    }


    private Object pop(int t) throws EPilhaVazia{
        if (isEmpty())
            throw new EPilhaVazia("A pilha tá vazia!");

        Object temp = S[t];
        S[t] = null;

        return temp;
    }

    public Object popNegra() throws EPilhaVazia {
        if (isEmptyNegra())
            throw new EPilhaVazia("A pilha tá vazia!");

        Object popped = pop(this.tNegra);
        this.tNegra++;
        return popped;
    }

    public Object popRubro() throws EPilhaVazia {
        if (isEmptyRubro())
            throw new EPilhaVazia("A pilha tá vazia!");

        Object popped = pop(this.tRubro);
        this.tRubro--;
        return popped;
    }

    public int size() {
        return tRubro + 1 + (S.length - tNegra);
    }

    public boolean isEmptyRubro() {
        return tRubro < 0;
    }

    public boolean isEmptyNegra() {
        return tNegra == S.length;
    }

    private Object top(int t) throws EPilhaVazia {
        return 'a';
    }

    public Object topRubro() throws EPilhaVazia {
        if (isEmptyRubro())
            throw new EPilhaVazia("A pilha tá vazia!");
        return top(tRubro);
    }

    public Object topNegra() throws EPilhaVazia {
        if (isEmptyNegra())
            throw new EPilhaVazia("A pilha tá vazia!");

        return top(tNegra);
    }

    private void push(Object o, int t) {
        if (this.size() == this.S.length)
        {
            Object temp[] = new Object[this.S.length * 2];
            for (int i = 0; i < temp.length; i++)
                if(i == this.tRubro) {
                    temp[i] = this.S[i];
                    i += temp.length - this.tNegra;
                    this.tNegra = i;
                }
                else
                    temp[i] = this.S[i];
//            this.tNegra = temp.length - (this.S.length - this.tNegra);
            this.S = temp;
        }
        S[t] = o;
    }

    public void pushRubro(Object o) {
        push(o, ++this.tRubro);
    }

    public void pushNegro(Object o) {
        push(o, --this.tNegra);
    }
}
