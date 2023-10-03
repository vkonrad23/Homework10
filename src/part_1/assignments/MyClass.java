package part_1.assignments;

public class MyClass {
    public int value;

    public MyClass(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        // Create an object of the MyClass class
        MyClass obj1 = new MyClass(10);

        // Assign references to the object to variables obj2 and obj3
        MyClass obj2 = obj1;
        MyClass obj3 = obj1;

        // Change the object's property through obj2
        obj2.value = 20;

        // Display the values of the properties through all three variables
        System.out.println("Value of obj1.value: " + obj1.value);
        System.out.println("Value of obj2.value: " + obj2.value);
        System.out.println("Value of obj3.value: " + obj3.value);
    }
}
