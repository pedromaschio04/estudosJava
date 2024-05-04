package estudos.algorithims;

public class Fibonacci {
    private int f1;
    private int f2;
    private int[] result = new int[10];

    public Fibonacci(int f1, int f2){
        this.f1 = f1;
        this.f2 = f2;
    }

    public int getResultLength(){
        return this.result.length;
    }

    public int getResult(int i){
        return result[i];
    }

    public void setResult(){
        result[0] = f1;
        result[1] = f2;
        for(int i=1;i<result.length-1;i++){
            result[i+1] = result[i]+result[i-1];
        }
    }

}
