import ElemTriangulos.Piso;

public class Triangulo extends PropFigs implements Dibuja{
    public Triangulo(int alto){
        this.ancho = alto;
        this.alto = alto;
    }

    public void dibuja(){
        System.out.println("imprimiendo triangulo de altura" + alto);
        for(int i=0;i<alto;i++){
            Piso p = new Piso(alto,i+1);
            p.imprime();
            System.out.println();
        }

    }

}
