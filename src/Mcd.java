public class Mcd {

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    int numero1;
    int numero2;

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int calculoDeMaximoComunDivisorSegunEuclides() {
        int numeroDividido = 0;
        int resto = 0;
        if (numero1 >= numero2 && numero1 % numero2 == 0) {
            numeroDividido = numero1 / numero2;


        } else if (numero1 >= numero2 && numero1 % numero2 != 0) {
            while (numero1 % numero2 != 0) {
                resto = numero1 % numero2;
                numero1=numero2;
                numero2=resto;


            }
            numeroDividido=numero2;

        } else if (numero2 >= numero1 && numero1 % numero2 == 0) {
            numeroDividido = numero2 / numero1;


        } else if (numero2 >= numero1 && numero1 % numero2 != 0) {
            while (numero2 % numero1 != 0) {
                resto = numero2 % numero1;
                numero2=numero1;
                numero1=resto;


            }
        numeroDividido=numero1;
        }
        return numeroDividido;
    }
}
