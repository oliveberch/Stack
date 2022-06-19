import java.util.Stack;
public class InFToPostF{
    //Function to return presedence of operators
    int precedence(char scan){
        switch(scan){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    //Function to return Postfix Expression via taking Infix expression as input
    String InfixToPostfix(String exp){
        String result=new String("");
        Stack <Character> stack=new Stack<>();
        //Iterate over expression
        for(int i=0;i<exp.length();++i){
            char scan=exp.charAt(i);
            //Case 1: If scanned char is operand
            if(Character.isLetterOrDigit(scan)){
                result+=scan;
            }
            //Case 2: If '(' is scanned
            else if(scan=='('){
                stack.push(scan);
            }
            //Case 3: If ')' is scanned
            else if(scan==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    result+=stack.pop();
                    stack.pop();
                }
            }
            //Case 4: If an operator is encountered
            else{
                while(!stack.isEmpty() && precedence(scan)<=precedence(stack.peek())){
                    result+=stack.pop();
                }
                stack.push(scan);
            }
        }
        //Pop all operators from stack
        while(!stack.isEmpty()){
            if(stack.peek()=='('){
                System.out.print("Invalid Expression");
            }
            result+=stack.pop();
        }
        return result;
    }
}