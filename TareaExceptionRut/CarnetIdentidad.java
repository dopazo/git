public class CarnetIdentidad {

    protected Integer rut;
    protected Integer dv;

    public CarnetIdentidad(Integer rut, Integer dv)throws DigitoVerificadorException {
        //llamar a verifica
        verifica(rut, dv);
        this.rut = rut;
        this.dv = dv;
    }

    //codigo verifica rut
    private static void verifica(Integer rut, Integer dv) throws DigitoVerificadorException{

        int RutSinDv=(rut/10);//rut sin verificador

        int multiplicador=2;
        int contarDigitos=0;
        int suma = 0;

        while(rut>0)//revisa cuantos numeros tiene el rut
        {
            contarDigitos++;
            rut=rut/10;
        }
        for(int i=0;i<(contarDigitos-1);i++)//separa digitos y calcula
        {

            suma=suma+((RutSinDv%10)*multiplicador);
            RutSinDv=RutSinDv/10;
            multiplicador=multiplicador+1;
            if (multiplicador==8)
            {
                multiplicador=2;
            }
        }


        int resto=(suma%11);
        int supuestoDV=(11-resto);

        if ((supuestoDV==10) || (supuestoDV==11))
        {
            if (dv==0)
            {
                System.out.println("El RUT ingresado es valido\n");
            }
            else
            {
                throw new DigitoVerificadorException();
            }

        }
        else
        {
            if (supuestoDV==dv)
            {
                System.out.println("El RUT ingresado es valido\n");
            }
            else
            {
                throw new DigitoVerificadorException();
            }
        }
    }

   // public Integer retornaRut(){return rut;}
    // public Integer retornaDv(){return dv;}
}
