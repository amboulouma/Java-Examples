package examples;

/**
 * <b>Class Person to instanciate person objects</b>
 * 
 * <p>
 * This is a sample Person <b>class</b> with its :
 * <ul>
 *      <b>Attributes</b> <br>
 *      <b>Constructors</b> <br>
 *      <b>Accessors</b> <br>
 *      <b>Methods</b> <br>
 * </ul>
 * </p>
 * 
 * @author Amine M. Boulouma
 * @version 1.0
 */

public class Person {
     
    //Attributes of the Class

    /**
     * The person's ID
     * 
     * @see id
     */
    private int id = 0;

    /**
     * The person's age
     * 
     * @see age
     */
    private int age = 0;

    /**
     * The person's name
     * 
     * @see name
     */
    private String name = "";

    /**
     * The person's code
     * 
     * @see code
     */
    private String code = "";

    /**
     * The default Constructor 
     */

    //Constructors

    //Default Constructor
    public Person () {
        System.out.println("Calling the Default Constructor");
        this.id = generateId();
        this.age = 0;
        this.name = "";
        this.code = "";
    }

    /**
     * The Constructor with parameters
     * 
     * @param name 
     * 
     * The name of the person
     * 
     * @param age
     * 
     * The age of the person
     * 
     * @param code
     * 
     * The code of the person
     */

    //Constructor with parameters 
    public Person (String name, int age, String code) {
        System.out.println("Calling the Constructor with parameters ");
        this.id = generateId();
        this.name = name;
        this.age = age;
        this.code = code;
    }

    //Getters and Setters (Accessors) 

    //Getters

    /**
     * Return the person's ID
     * 
     * @return the person's ID 
     * 
     */

    //Id Getter
    public int getId () {
        System.out.println("Calling the Id Getter for the person : " + this.id);
        return this.id;
    }

    /**
     * Return the person's age
     * 
     * @return the person's age 
     * 
     */

    //Age Getter
    public int getAge () {
        System.out.println("Calling the Age Getter for the person : " + this.id);
        return this.age;
    }

    /**
     * Return the person's name
     * 
     * @return the person's name 
     * 
     */

    //Name Getter
    public String getName () {
        System.out.println("Calling the Name Getter for the person : " + this.id);
        return this.name;
    }

    /**
     * Return the person's code
     * 
     * @return the person's code 
     * 
     */

    //Code Getter
    public String getCode () {
        System.out.println("Calling the Code Getter for the person : " + this.id);
        return this.code;
    }

    //Setters
    
    /**
     * Set the person's ID
     * 
     * @param id
     * The ID of the person
     */

    //Id Setter
    public void setId (int id) {
        System.out.println("Calling the Id Setter for the person : " + this.id);
        System.out.println("Setting \'" + id + "\' in place of \'" + this.id + "\'");
        this.id = id;
    }

    /**
     * Set the person's age
     * 
     * @param age
     * The age of the person
     */

    //Age Setter
    public void setAge (int age) {
        System.out.println("Calling the Age Setter for the person : " + this.id);
        System.out.println("Setting \'" + age + "\' in place of \'" + this.age + "\'");
        this.age = age;
    }
    
    /**
     * Set the person's name
     * 
     * @param name
     * The name of the person
     */

    //Name Setter
    public void setName (String name) {
        System.out.println("Calling the Name Setter for the person : " + this.id);
        System.out.println("Setting \'" + name + "\' in place of \'" + this.name + "\'");
        this.name = name;
    }
    
    /**
     * Set the person's code
     * 
     * @param code
     * The code of the person
     */

    //Code Setter
    public void setCode (String code) {
        System.out.println("Calling the Code Setter for the person : " + this.id);
        System.out.println("Setting \'" + code + "\' in place of \'" + this.code + "\'");
        this.code = code;
    }

    //Methods

    /**
     * Generating the ID
     * 
     * @return identifier
     */

    //Generate Id
    private static int identifier = 1;
    private static int generateId() {
        System.out.println("Generate Id : " + identifier);
        return identifier++;
    }

    /**
     * Introduce a person
     */

    //Introduce Method
    public void introduce() {
        System.out.println("Calling the Introduce Method for the person : " + this.id);
        System.out.println("Hello, I am " + this.name + " and I am really happy to meet you !");
    }

    /**
     * Ask a question
     */

    //Ask Method
    public void ask() {
        System.out.println("Calling the Ask Method for the person : " + this.id);
        System.out.println("Is it possible to do that when we are " + this.age + " ?");
    }
    
    /**
     * Describe the person
     * 
     * @return the description of the object
     */
    //ToString Method
    public String toString() {
        System.out.println("Calling the ToString Method for the person : " + this.id);
        return this.id + " : " + this.name + ", " + this.age + " years old, code : " + this.code;
    }

}

