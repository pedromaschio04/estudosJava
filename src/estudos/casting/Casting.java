package estudos.casting;

import java.util.Random;

public class Casting {
        public static void main(String[] args) {
            //Para conversão basta passar entre parenteses o que vai ser convertido antes do valor
            Random rd = new Random();
            double result = rd.nextDouble(10);
            System.out.println("Antes da conversao "+result+"\nDepois da conversao "+(int)result);
        }
}
