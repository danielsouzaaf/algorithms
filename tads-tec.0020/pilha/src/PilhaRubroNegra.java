public class PilhaRubroNegra implements Pilha {

    private Object S[];

    private int tRubro = -1;

    private int tNegra;

    public PilhaRubroNegra(int tam)
    {
        this.S = new Object[tam];
        this.tNegra = tam;
    }

    public Object pop()
    {
        return null;
    }

    public Object top() {
        return null;
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
        Object popped = pop(this.tNegra);
        this.tNegra++;
        return popped;
    }

    public Object popRubro() throws EPilhaVazia {
        Object popped = pop(this.tRubro);
        this.tRubro--;
        return popped;
    }

    public int size() {
        return this.tRubro + 1 + (S.length - this.tNegra);
    }

    public boolean isEmpty() {
        return tRubro < 0 && tNegra == S.length;
    }

    private Object top(int t) throws EPilhaVazia {
        if (isEmpty())
            throw new EPilhaVazia("A pilha tá vazia!");

        return S[t];
    }

    public Object topRubro() throws EPilhaVazia {
        return top(tRubro);
    }

    public Object topNegra() throws EPilhaVazia {
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
        System.out.println("testando se entrou");
        S[t] = o;
    }

    public void pushRubro(Object o) {
        push(o, ++this.tRubro);
    }

    public void pushNegra(Object o) {
        push(o, --this.tNegra);
    }

    public void printarRubro() {
        System.out.println("Printando o lado RUBRO: ");
        for (int i = 0; i <= tRubro; i++)
            System.out.println(this.S[i] + " - ");
    }

    public void printarNegra() {
        System.out.println("Printando o lado NEGRA: ");
        System.out.println("indice tnegra:" + tNegra);
        for (int i = S.length - 1; i > tNegra; i--)
            System.out.println(this.S[i]);
    }
}
