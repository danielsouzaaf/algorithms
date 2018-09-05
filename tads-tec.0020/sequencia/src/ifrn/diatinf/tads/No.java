package ifrn.diatinf.tads;

public class No {
    public No anterior;

    public No proximo;

    public Object valor;

    public void setAnterior(No n)
    {
        this.anterior = n;
    }

    public void setProximo(No n)
    {
        this.proximo = n;
    }

    public No getAnterior()
    {
        return this.anterior;
    }

    public No getProximo()
    {
        return this.proximo;
    }

    public void setValor(Object o)
    {
        this.valor = o;
    }

    public Object getValor()
    {
        return this.valor;
    }
}
