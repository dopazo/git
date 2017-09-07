public class Bloque {
    protected Character ladrillo= '#';//por defecto es ladrillo

    public Bloque(){
        this.ladrillo = ladrillo; //si no tiene parametro, se mantiene
    }
    public Bloque(Character blanco){
        this.ladrillo= blanco;
    }

    public void imprime(){
        System.out.print(""+ladrillo);
    }
}
