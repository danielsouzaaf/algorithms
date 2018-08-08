public interface Pilha {
    int size();

    boolean isEmpty();

    Object top() throws EPilhaVazia;

    void push(Object o);

    Object pop() throws EPilhaVazia;
}
