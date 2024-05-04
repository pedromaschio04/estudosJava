package estudos.staticExamples;

public class StaticExamples {
    public static void main(String[] args){
        Button start = new Button("Green","START");
        Button select = new Button ("Blue","SELECT");

        //o atributo count da classe Button é do tipo static,
        //desse forma ela é compartilhada por todos os objetos
        //intanciados a partir da classe button
        //a propriedade static faz com que o atributo pentença a classe e não aos objetos

        start.setCount(1);
        select.setCount(1);

        System.out.println(start.getText()+" "+start.getColor()+" "+start.getCount());
        System.out.println(select.getText()+" "+select.getColor()+" "+select.getCount());
    }
}
