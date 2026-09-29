package hw_first_five;

public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public  Person(){
    }

    public String move(){
        return (fullName + " "+"is moving" );
    }
    public String talk(){
        return (fullName + " "+"is talking" );
    }


}
