import java.util.Arrays;

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
        return this.tRubro + 1 + (S.length - this.tNegra);
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
            System.out.println("Encheu! Size: " + this.size() + "\nLength: " + this.S.length);
            Object temp[] = new Object[this.S.length * 2];
            for (int i = 0; i <= this.tRubro; i++)
                temp[i] = this.S[i];
            for (int i = this.tNegra; i < this.S.length; i++) {
                temp[this.S.length + i] = this.S[i];
            }
            System.out.println(this.tNegra);
            t = (this.tNegra == t) ? temp.length - (this.S.length - this.tNegra) : t;
            this.tNegra = temp.length - (this.S.length - this.tNegra);
            this.S = temp;
            System.out.println(Arrays.toString(this.S));
        }
        S[t] = o;
        System.out.println(Arrays.toString(this.S));

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
        for (int i = S.length - 1; i >= tNegra; i--)
            System.out.println(this.S[i]);
    }

    public void printarArray() {
        System.out.println(Arrays.toString(this.S));
    }
}
