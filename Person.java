public class Person {
    
    //Attributes of the Class

    private int age;
    private String name;
    private String code;

    //Constructors

    //Default Constructor
    public Person () {
        this.age = 0;
        this.name = "";
        this.code = "";
    }

    //Constructor with parameters 
    public Person (String name, int age, String code) {
        this.name = name;
        this.age = age;
        this.code = code;
    }

    //Getters and Setters

    //Getters

    public int getAge () {
        return this.age;
    }

    public String getName () {
        return this.name;
    }

    public String getCode () {
        return this.code;
    }

    //Setters

    public void setAge (int age) {
        this.age = age;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setCode (String code) {
        this.code = code;
    }

    //Methods

    public void introduce() {
        System.out.println("Hello, I am " + this.name + " and I am really happy to meet you !");
    }

    public void ask() {
        System.out.println("Is it possible to do that when we are " + this.age + " ?");
    }
    
    public String toString() {
        return "This is " + this.name + ", he has " + this.age + " years old, and his code is : " + this.code;
    }

}

