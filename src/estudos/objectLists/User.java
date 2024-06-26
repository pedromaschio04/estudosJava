package estudos.objectLists;

import java.util.Objects;

public class User {

    private String name;
    private int age;

    public User(){}

    public User(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String showInfo(){
        return (name +" "+ age);

    }
    public String showInfo(boolean showAge){
        if(showAge){
            return (name +" "+ age);
        }
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    //Método toString está presente em todos os objetos, mas ele permite ser sobreescrito
    public String toString(){
        return ("User{ Name: "+name+", Age: "+age+"}");
    }
}
