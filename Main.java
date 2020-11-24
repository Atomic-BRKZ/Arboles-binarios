package Main;

public class Main {
    public static void main(String[] args) {
        Arbol arbolito = new Arbol();
        arbolito.insertar(40);
        arbolito.insertar(60);
        arbolito.insertar(10);
        arbolito.insertar(30);
        arbolito.insertar(80);
        arbolito.insertar(70);
        arbolito.insertar(40);
        arbolito.encontrar(600);
        
        
        arbolito.inorder();
        arbolito.borrar(40);        
        System.out.println("xd");
        arbolito.encontrar(60);
        arbolito.inorder();
    }
    
}
