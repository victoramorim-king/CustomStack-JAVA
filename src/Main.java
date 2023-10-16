public class Main {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack();

        stack.push(3);
        stack.push(5);
        System.out.println("Minimum element: " + stack.getMin()); // Output: 3

        stack.push(2);
        System.out.println("Minimum element: " + stack.getMin()); // Output: 2

        stack.pop();
        System.out.println("Minimum element: " + stack.getMin()); // Output: 3
    }
}