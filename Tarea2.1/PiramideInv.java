public class PiramideInv{
    protected int h;
    public PiramideInv(int h){
        this.h=h;
    }
    public void imprime() {
        System.out.println("...en proceso de imprimir piramide de altura " + this.h);
        for(int i=h;i>0;i--){
            Piso p = new Piso(h,i);
            p.imprime();
            System.out.println();
        }
    }
}
