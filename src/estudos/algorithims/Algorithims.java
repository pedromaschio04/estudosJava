package estudos.algorithims;

public class Algorithims {
    public static void main(String[] args) {
        Fibonacci ex1 = new Fibonacci(1,2);
        ex1.setResult();
        for(int i =0;i<ex1.getResultLength();i++){
            System.out.print(ex1.getResult(i)+" ");
        }
    }
}
