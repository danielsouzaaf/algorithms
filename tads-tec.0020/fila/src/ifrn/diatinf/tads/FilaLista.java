package ifrn.diatinf.tads;

public class FilaLista implements Fila{

    private No primeiro, ultimo;
    private int qtdItens;

    public boolean enfileirar(Object o) {
        No n = new No();
        n.setElemento(o);
        if (primeiro == null && ultimo == null)
        {
            primeiro = n;
            ultimo = n;
            primeiro.setProximo(ultimo);
        }
        else {
            ultimo.setProximo(n);
            ultimo = n;
        }

        qtdItens++;

        return true;
    }

    public Object desenfileirar() {
        if (estaVazia()) {
            throw new NullPointerException("Tá vazia!");
        }

        No aux = primeiro;
        primeiro = primeiro.getProximo();

        return aux.getElemento();
    }

    public int tamanho()
    {
        return qtdItens;
    }

    public boolean estaVazia() {
        return (qtdItens == 0);
    }

    public Object inicio() {
        return primeiro.getElemento();
    }

    public Object fim() {
        return ultimo.getElemento();
    }
}
