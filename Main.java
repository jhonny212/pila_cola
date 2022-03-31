public class Main{
    
    public static void main(String[] args) {
        Cola cola = new Cola();
        System.out.println(cola.estaVacio());
        cola.agregar(1);
        cola.agregar(2);
        cola.agregar(3);
        cola.agregar(4);
        cola.imprimir();
        System.out.println("------------------------");
        int valor = cola.remover();
        cola.remover();
        cola.imprimir();
        System.out.println(cola.estaVacio());
    }
}