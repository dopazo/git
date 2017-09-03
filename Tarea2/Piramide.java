public class Piramide{

    int Altura(int num)
        {
        for(int i=0; i<num; i++)
            {
            for(int j=0; j<num-i-1; j++) {
                System.out.print(" ");
                }
            for(int j=0; j<i+1; j++) {
                System.out.print("#");
                }
            System.out.println();
            }
        return 0;
        }
}
