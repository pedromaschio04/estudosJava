package estudos.staticExamples;

public class Button {
    private String color;
    private String text;
    private static int count;

    Button(String color, String text){
        this.color = color;
        this.text = text;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setText(String text){
        this.text = text;
    }
    public String getText(){
        return text;
    }
    public int getCount(){
        return count;
    }
    public void setCount(int c){
        count = count + c;
    }

}
