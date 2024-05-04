package estudos.manipulacaoDeStrings;

import java.util.Locale;

public class ManipulacaoDeStrings {
    public static void main(String[] args){
        String exemplo = "Hello Word";

        //Encontrar conjunto de letras especificas
        if(exemplo.contains("ll")){
            System.out.println("Essa fraser contem ll");
        }
        //Percorrer o Array da string
        for(int i =0; i<exemplo.length();i++){
            System.out.println(exemplo.charAt(i));
        }
        //Identificar index do array
        System.out.println(exemplo.indexOf("Word"));

        System.out.println(exemplo.toLowerCase());
        System.out.println(exemplo.toUpperCase());

        //Remover espaços da string
        System.out.println(exemplo.trim());

        //Seleciona somente uma parte da string
        System.out.println(exemplo.substring(6,10));

        //Verifica se string é identica ao parametro
        System.out.println(exemplo.equals("Hello Word"));
    }
}
