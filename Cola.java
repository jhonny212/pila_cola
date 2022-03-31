public class Cola{

    private Nodo inicio;
    private Nodo nodo;

    public void agregar(int valor){
        Nodo tmp = new Nodo(valor);
        if(this.inicio==null){
            this.inicio = tmp;
            this.nodo = tmp;
        }else{
            this.nodo.nodoSiguiente = tmp;
            this.nodo = tmp;
        }
    }

    public void imprimir(){
        Nodo tmp = this.inicio;
        while(tmp!=null){
            System.out.println(tmp.valor);
            tmp = tmp.nodoSiguiente;
        }
    }

    public int remover(){
        if(this.inicio==null){
            return -1;
        }else{
            int valor = this.inicio.valor;
            this.inicio = this.inicio.nodoSiguiente;
            return valor;
        }
    }

    public boolean estaVacio(){
        return this.inicio == null;
    }

}