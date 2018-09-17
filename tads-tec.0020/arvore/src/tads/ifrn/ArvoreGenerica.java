package tads.ifrn;
/**
 * Classe que extende de Arvore e acrescenta m�todos para adicionar 
 * n�s em uma �rvore e remover n�s da �rvore
 */
public interface ArvoreGenerica extends Arvore
{
    /**
     * @param v Posi��o que vai receber esse filho
     * @param o Objeto que vai ficar nessa posi��o
     */
    public void addChild(Position v, Object o);

    /**
     * @param v
     * @return Objeto que estava na pos��o que foi removida
     * @throws InvalidPositionException
     */
    public Object remove(Position v) throws InvalidPositionException;
}