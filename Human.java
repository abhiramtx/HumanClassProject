public class Human {
    // Data members
    private String name;
    private int age;
    private int height;
    
    // Basic constructor
    public Human(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }
    
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = (age > 0) ? age : 1; // Ensure the age is positive
    }

    public void setHeight(int height) {
        this.height = (height > 0) ? height : 1;
    }
    
    // Custom method
    public void talk(String message) {
        System.out.println(name + " says: " + message);
    }
}
