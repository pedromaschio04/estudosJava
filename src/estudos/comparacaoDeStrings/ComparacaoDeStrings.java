package estudos.comparacaoDeStrings;
import java.util.Scanner;

public class ComparacaoDeStrings {
    public static void main(String[] args){
        String password = "UnbreakableStrongPassword";
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua senha: ");
        //usar o equals para comparação, == compara as referencias de memoria e não o conteudo

        if (password.equals(sc.nextLine())){
            System.out.println("Your password is correct!");
        }
        else{
            System.out.println("Your password is incorrect!");
        }



    }
}
