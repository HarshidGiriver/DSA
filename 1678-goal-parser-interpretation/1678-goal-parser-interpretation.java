class Solution {
    public String interpret(String command) {
          Stack<Character> stack = new Stack<>();
          String fin="";
          for(char i : command.toCharArray())
          {
            
            if(i==')')
            {
                
                if(stack.peek() == '(')
                {
                    fin+='o';
                }
                else
                {
                    stack.pop();
                    stack.pop();
                    fin+="al";
                }
            }
            else if(i=='G')
            {
                fin+='G';
            }
            else
            {
                stack.push(i);
            }

          }
          return fin;
        
    }
}