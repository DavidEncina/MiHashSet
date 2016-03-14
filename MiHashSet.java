
/**
 * Write a description of class MiHashSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashSet
{
    // Es una lista que almacena enteros
    private ArrayListInt lista;

    /**
     * Constructor for objects of class MiHashSet
     */
    public MiHashSet()
    {
        lista = new ArrayListInt();
    }
    
    /**
     * Añade el elemento al conjunto si no estaba.
     * Devuelve verdadero en caso de que el elemento no estuviera presente en el conjunto y falso en caso contrario.
     */
    public boolean add(int valor)
    {
        boolean estaEnLista = false;
         if((lista.contains(valor)))
        {
            estaEnLista = true;
        }
        else
        {
            lista.add(valor);
        }
        return estaEnLista;
    }
    
    /**
     * Vacía el conjunto.
     */
    public void clear()
    {
        lista.clear();
    }
    
    /**
     * Devuelve verdadero si el conjunto contiene el elemento, falso en caso contrario.
     */
    public boolean contains(int elemento)
    {
        return lista.contains(elemento);        
    }
    
    /**
     * Devuelve verdadero si el conjunto no contiene elementos.
     */
    public boolean isEmpty()
    {
        return lista.isEmpty();
    }
    
    /**
     * Elimina del conjunto el elemento dado. 
     * Si no existiera devuelve falso; si existía en el conjunto devuelve verdadero.
     */
    public boolean remove(int elemento)
    {
        boolean existe = false;        
        if (contains(elemento) == true) {
            lista.remove(lista.indexOf(elemento));
            existe = true;
        }
        return existe;
    }
}
