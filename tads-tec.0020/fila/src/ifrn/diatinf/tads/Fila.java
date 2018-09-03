package ifrn.diatinf.tads;

public interface Fila {
    public int tamanho();
    public boolean estaVazia();
    public Object inicio()
            throws EFilaVazia;
    public boolean enfileirar(Object o);
    public Object desenfileirar()
            throws EFilaVazia;
}
