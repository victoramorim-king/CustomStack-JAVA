import java.util.Stack;

public class CustomStack {
    private final Stack<Integer> mainStack;
    private final Stack<Integer> minStack;

    public CustomStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        mainStack.push(x);

        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (mainStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        int popped = mainStack.pop();

        if (popped == minStack.peek()) {
            minStack.pop();
        }

    }

    public int getMin() {
        if (minStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return minStack.peek();
    }
}
