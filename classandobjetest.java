
class student{
    String name;
    int age;

    void display(){
        System.out.println("Name:- " + name);
        System.out.println("Age:- " + age);
    }
}

public class classandobjetest {
    public static void main(String[] args) {

        student s1 = new student();
        s1.name = "Rehan Khan";
        s1.age = 23;
        s1.display();

    }
}
