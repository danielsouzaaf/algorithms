package ifrn.diatinf.tads;

public class FilaArray implements Fila{

    private int primeiro;
    private int ultimo;
    private int qtdItens;
    private int tMaximo;

    private Object Q[];

    public FilaArray(int t) {
        Q = new Object[t];
        primeiro = 0;
        ultimo = -1;
        tMaximo = t;
    }

    public boolean enfileirar(Object o) {
        if (estaCheia())
            return false;

        if (ultimo == tMaximo - 1)
        {
            ultimo  = -1;
        }
        ++ultimo;

        Q[ultimo] = o;

        qtdItens++;

        return true;
    }

    public Object desenfileirar() {
        if (estaVazia()) {
            throw new NullPointerException("Tá vazia!");
        }

        Object o = Q[primeiro];
        primeiro++;
        if (primeiro == tMaximo)
            primeiro = 0;

        --qtdItens;

        return o;
    }

    public int tamanho()
    {
        return qtdItens;
    }

    public boolean estaVazia() {
        return (qtdItens == 0);
    }

    public boolean estaCheia()
    {
        return (qtdItens == tMaximo);
    }

    public Object inicio() {
        return Q[primeiro];
    }

    public Object fim() {
        return Q[ultimo];
    }

}
