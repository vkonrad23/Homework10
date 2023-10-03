package part_1.arguments;

public class MyClass {
    public int value;

    public MyClass(int value) {
        this.value = value;
    }

    // A method that takes an object of MyClass as an argument and changes its property
    public static void changeValue(MyClass obj, int newValue) {
        obj.value = newValue;
    }

    public static void main(String[] args) {
        // Create an object of the MyClass class
        MyClass obj = new MyClass(10);

        // Display the initial value of the property
        System.out.println("Initial value of obj.value: " + obj.value);

        // Call the changeValue method to modify the property
        changeValue(obj, 30);

        // Check how the change affected the property outside the method
        System.out.println("Modified value of obj.value: " + obj.value);
    }
}
