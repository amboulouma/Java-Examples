public class Person {
    
    //Attributes of the Class

    private int id = 0;
    private int age = 0;
    private String name = "";
    private String code = "";


    //Constructors

    //Default Constructor
    public Person () {
        System.out.println("Calling the Default Constructor");
        this.id = generateId();
        this.age = 0;
        this.name = "";
        this.code = "";
    }

    //Constructor with parameters 
    public Person (String name, int age, String code) {
        System.out.println("Calling the Constructor with parameters ");
        this.id = generateId();
        this.name = name;
        this.age = age;
        this.code = code;
    }

    //Getters and Setters

    //Getters

    //Id Getter
    public int getId () {
        System.out.println("Calling the Id Getter for the person : " + this.id);
        return this.id;
    }

    //Age Getter
    public int getAge () {
        System.out.println("Calling the Age Getter for the person : " + this.id);
        return this.age;
    }

    //Name Getter
    public String getName () {
        System.out.println("Calling the Name Getter for the person : " + this.id);
        return this.name;
    }

    //Code Getter
    public String getCode () {
        System.out.println("Calling the Code Getter for the person : " + this.id);
        return this.code;
    }

    //Setters
    
    //Id Setter
    public void setId (int id) {
        System.out.println("Calling the Id Setter for the person : " + this.id);
        System.out.println("Setting \'" + id + "\' in place of \'" + this.id + "\'");
        this.id = id;
    }

    //Age Setter
    public void setAge (int age) {
        System.out.println("Calling the Age Setter for the person : " + this.id);
        System.out.println("Setting \'" + age + "\' in place of \'" + this.age + "\'");
        this.age = age;
    }
    
    //Name Setter
    public void setName (String name) {
        System.out.println("Calling the Name Setter for the person : " + this.id);
        System.out.println("Setting \'" + name + "\' in place of \'" + this.name + "\'");
        this.name = name;
    }
    
    //Code Setter
    public void setCode (String code) {
        System.out.println("Calling the Code Setter for the person : " + this.id);
        System.out.println("Setting \'" + code + "\' in place of \'" + this.code + "\'");
        this.code = code;
    }

    //Methods

    //Generate Id
    static int identifier = 1;
    public static int generateId() {
        System.out.println("Generate Id : " + identifier);
        return identifier++;
    }

    //Introduce Method
    public void introduce() {
        System.out.println("Calling the Introduce Method for the person : " + this.id);
        System.out.println("Hello, I am " + this.name + " and I am really happy to meet you !");
    }

    //Ask Method
    public void ask() {
        System.out.println("Calling the Ask Method for the person : " + this.id);
        System.out.println("Is it possible to do that when we are " + this.age + " ?");
    }
    
    //ToString Method
    public String toString() {
        System.out.println("Calling the ToString Method for the person : " + this.id);
        return this.id + " : This is " + this.name + ", he has " + this.age + " years old, and his code is : " + this.code;
    }

}

