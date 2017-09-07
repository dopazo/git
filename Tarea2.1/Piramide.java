public class Piramide{

    protected int h;
    public Piramide(int h){
        this.h=h;
    }

    public void imprime(){
        System.out.println("imprimiendo piramide de altura" + h);
        for(int i=0;i<h;i++){
            Piso p = new Piso(h,i+1);
            p.imprime();
            System.out.println();
        }
    }
}