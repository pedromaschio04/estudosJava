package estudos.arrayCaracteristics;

import java.util.Arrays;

public class ArrayCaracteristics {
    public static void main(String[] args){
        int[] numbersA = new int[] {1,2,3};
        int[] numbersB = new int[] {1,2,3};

        //conversao para string
        System.out.println(Arrays.toString(numbersA));

        //comparacao entre arrays
        System.out.println(Arrays.equals(numbersA,numbersB));

        //Preenchimento total do array sem o uso de loops
        Arrays.fill(numbersB,1);
        System.out.println(Arrays.toString(numbersB));

    }
}
