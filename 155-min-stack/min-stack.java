import java.util.Stack;
import java.lang.Math;

class MinStack {

    int data;
    MinStack next;
    MinStack top;
    int min;

    public MinStack() {
        
    }
    
    public void push(int value) {

        MinStack newNode = new MinStack();
        newNode.data = value;

        if(top==null) newNode.min = value;
        else newNode.min = Math.min(value, top.min); 

        newNode.next = top;
        top = newNode;
        
        
    }
    
    public void pop() {
        
        if(top!=null) {
            top = top.next;
        }
    }
    
    public int top() {
        
        if(top!=null) return top.data;

        return -1;
    }
    
    public int getMin() {
        return top.min;        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */