
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
}
