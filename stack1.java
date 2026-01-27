import java.util.ArrayList;
public class stack1 {
    static class stack{
        static ArrayList<Integer> list= new ArrayList<>();
    public static boolean isempty(){
        return list.isEmpty();
    }
    public static void push(int data){
        list.add(data);
    }
    public static int pop(){
        if(isempty()){
            return -1;
        }
        int top= list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    
    public static int peek(){
          if(isempty()){
            return -1;
        }
        return list.get(list.size()-1);
    }
    }


    public static void main(String[] args) {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while(!stack.isempty()){
            System.out.println(stack.peek());
            stack.pop();

        }

        
    }
}
