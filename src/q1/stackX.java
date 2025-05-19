package q1;

class StackX {
    private char[] wordStack;
    private int maxSize;
    private int top;

    // Constructor
    public StackX(int size) {
        maxSize = size;
        wordStack = new char[maxSize];
        top = -1;
    }

    public void push(char c) {
        if (!isFull()) {
            wordStack[++top] = c;
        }
    }

    public char pop() {
        if (!isEmpty()) {
            return wordStack[top--];
        }
        return '\0'; // Return null character if empty
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
    
    public String reverseString(String input) {
    	
    	String result = "";
    	top = -1;
    	
    for(int i = 0; i < input.length(); i++) {
    	
    	char c = input.charAt(i);
    	
    	if (c != ' ')  {
    		push(c);
    	}
    	else {
    		while(!isEmpty()) {
    			result = result + pop();
    		} 
    		result += " ";
    	}
    }
    
    while(!isEmpty()) {
    	result += pop();
    }
    return result;
    	
    }

}