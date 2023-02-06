public class Person {
    String FullName;
    String Age;

    Person(String a, String FN) {
        FullName = FN;
        Age = a;

    }
    Person(){

    }

    void talk(String FullName) {
        System.out.println("Этого человека зовут" + FullName);
    }

    void move(String Age) {
        System.out.println( "Этому человеку" + Age + " лет");
    }
}