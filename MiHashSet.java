
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
    
    /**
     * Devuelve el número de elementos del conjunto.
     */
    public int size()
    {
        return lista.size();
    }
    
    /**
     * Devuelve una cadena conteniendo todos los elementos del conjunto separados por comas y entre corchetes.
     */
    public String toString()
    {
        String texto = null;
        String listado = null;
        for( int i = 0; i < lista.size(); i++) {
            if (i == 0) {
               listado =  "[" + lista.get(i) + "]";
            }
            else {
                listado = "[" + lista.get(i) + "]";
            }
            
        }
        return listado;
    }
    
    /**
     * Devuelve verdadero si el parámetro es igual al conjunto sobre el que se invoca y falso en otro caso.
     */
    public boolean equals(MiHashSet otroConjunto)
    {
        boolean igual = false;
        if(otroConjunto.size() == lista.size()) {
            int i = 0;
            while (i < lista.size()) {
                if((otroConjunto.contains(lista.get(i))))
                {
                    igual = true;
                }
                i++;
            }
        }
        return igual;
    }
}
