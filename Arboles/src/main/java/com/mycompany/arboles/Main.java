
package com.mycompany.arboles;


public class Main {

    public static void main(String[] args) {
        Arbol arbol= new Arbol();
        arbol.insertRecursive(5, null, arbol.getRoot());
        arbol.insertRecursive(4, null, arbol.getRoot());
        arbol.insertRecursive(6, null, arbol.getRoot());
        
        arbol.insertRecursive(2, null, arbol.getRoot());
        arbol.insertRecursive(3, null, arbol.getRoot());
        arbol.pritnPreOrden(root);
    }
    
}
