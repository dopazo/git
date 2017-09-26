package ElemTriangulos;

public class Piso {
    protected int alto;
    protected int pintados;

    public Piso(int alto, int pintados){
        this.alto = alto;
        this.pintados = pintados;
    }
    public void imprime(){
        for (int i=0;i<alto-pintados;i++){ //espacios en blanco
            Bloque b= new Bloque(' ');
            b.imprime();
        }
        for(int i=0;i<pintados;i++){ //ladrillos
            Bloque b= new Bloque();
            b.imprime();
        }
    }
}
