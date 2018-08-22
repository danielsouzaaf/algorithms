public class No {
    private Object elemento;
    private No proximo;

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object o) {
        elemento = o;
    }

    public void setProximo(No n) { proximo = n;}

    public No getProximo() { return proximo; }
}