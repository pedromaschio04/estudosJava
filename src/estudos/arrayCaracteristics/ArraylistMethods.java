package estudos.arrayCaracteristics;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class ArraylistMethods {

    //String [] -> array fixo
    //ArrayList<String> -> array dinamico
    //Para acessar elementos em um array simples é utilizado array[indice]
    //Já no caso de uma Lista utiliza-se listExemplo.get(indice)

    public static void printArray(List<String> names){
        for(int i =0;i<names.size();i++){
            System.out.println(names.get(i));
        }
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        //adicionar elementos aos ArrayLis
        names.add("Pedro");
        names.add("Duda");
        names.add("Duzera");
        printArray(names);

        //Remover elemento
        names.remove(0);

        //Descobrir indice a partir do elemento
        System.out.println("Indice de Duda = "+names.indexOf("Duda"));

        //Verificar se a lista está vazia
        System.out.println("Lista está vazia? "+names.isEmpty());

        //Verifica a exixstência de um elemento
        System.out.println("Existe uma elemento com o valodr de Pedro? "+names.contains("Pedro"));

        //Descobrir quantos elementos tem na lista
        System.out.println("Quantidade de Elementos na lista = "+names.size()+"\n");

        //Remover todos os elementos de uma lista
        names.clear();

        names.add("Pedro");
        names.add("Duda");
        names.add("Duzera");

        //Adicionar elemento com sobrecarga
        names.add(2,"Paulo");

        System.out.println("Elemento com indice 2 = "+names.get(2));

        //Ordenação utilizando collection
        Collections.sort(names);

        //Exemplo de foreach
        for(String name: names){
            System.out.println(name);
        }
    }
}


