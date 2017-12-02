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
    public Person (int age, String name, String code) {
        this.age = age;
        this.name = name;
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

}

