public class Human {
    // Data members
    private String name;
    private int age;
    private double height;
    private double weight;
    private String dob;
    
    // Basic constructor
    public Human(String name, int age, double height, double weight, String dob) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.dob = dob
    }
    
    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public double getWeight() {
        return weight;
    }

    public double height() {
        return height;
    }

    public String dob() {
        return dob;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = (age > 0) ? age : 1; // Ensure the age is positive
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }

    public void setDOB(String dob) {
        this.dob = dob;
    }

    // Custom method
    public void talk(String message) {
        System.out.println(name + " says: " + message);
    }
}
