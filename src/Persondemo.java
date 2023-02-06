public class Persondemo {
    public static void main(String[] args) {
        Person person1=new Person();

        person1.FullName="Кирилл Гаврилов";
        person1.Age= "47";

        System.out.println(person1.FullName);
        System.out.println();
        System.out.println(person1.Age);


        person1.talk(" Кирилл");
        person1.move(" 47");
    }
}

