public class Piso {
    protected int h;
    protected int pintados;

    public Piso(int h, int pintados){
        this.h = h;
        this.pintados = pintados;
    }
    public void imprime(){
        for (int i=0;i<h-pintados;i++){ //espacios en blanco
            Bloque b= new Bloque(' ');
            b.imprime();
        }
        for(int i=0;i<pintados;i++){ //ladrillos
            Bloque b= new Bloque();
            b.imprime();
        }
    }
}
