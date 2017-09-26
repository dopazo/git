public class Rectangulo extends PropFigs implements Dibuja{
    public Rectangulo(int ancho, int alto){
            this.ancho = ancho;
            this.alto = alto;
    }
    public void dibuja(){
        for(int i=0; i<alto; i++){
            for(int j=0; j<ancho; j++){
                System.out.print("#");
            }
            System.out.println();
        }

    }
}
