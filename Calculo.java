
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wallisons
 */
public class Calculo {
    
    
      static int evaluatePostfix(String exp) 
    { 
        //criar uma pilha
        Stack<Integer> stack=new Stack<>(); 
          
        // digitaliza todos os caracteres um por um
        // digitaliza tudo
        for(int i=0;i<exp.length();i++) 
        { 
            char c=exp.charAt(i); 
              
            // se o caracter digitalizado for um numero passe aqui  
            // empurre-o para a pilha 
            if(Character.isDigit(c)) 
            stack.push(c - '0'); 
              
            //  se o caracter for um operador , pop nos dois
            // elementos da pilha aplicam um operador
            else
            { 
                int val1 = stack.pop(); 
                int val2 = stack.pop(); 
                  
                switch(c) 
                { 
                    case '+': 
                    stack.push(val2+val1); 
                    break; 
                      
                    case '-': 
                    stack.push(val2- val1); 
                    break; 
                      
                    case '/': 
                    stack.push(val2/val1); 
                    break; 
                      
                    case '*': 
                    stack.push(val2*val1); 
                    break; 
              } 
            } 
        } 
        return stack.pop();     
    } 

    
}
