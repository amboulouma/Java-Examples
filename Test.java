public class Test {

    public static void main(String[] args) {
        
        //Instanciating objects 
        System.out.println("Instanciating objects");
        Person person1 = new Person();
        Person person2 = new Person("Rachid", 18, "CD3EDs");

        //Displaying the initial attributes
        System.out.println("Displaying the initial attributes");
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getCode());

        System.out.println(person2.getName());
        System.out.println(person2.getAge());
        System.out.println(person2.getCode());

        //Changing the attributes
        System.out.println("Changing the attributes");
        person1.setAge(18);
        person1.setName("Ghali");
        person1.setCode("DR4YEx");

        person2.setAge(21);
        person2.setName("Amine");
        person2.setCode("CGDsEr");

        //Displaying the modified attributes
        System.out.println("Displaying the modified attributes");
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getCode());

        System.out.println(person2.getName());
        System.out.println(person2.getAge());
        System.out.println(person2.getCode());
        
        //Calling objects and using toString() Methode
        System.out.println("Calling objects and using toString() Methode");
        System.out.println(person1);
        System.out.println(person2);
    }

}