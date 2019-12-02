
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
public class Calc3 {
    
    // Uma função para retornar a precedencia de um operador
    // Maior valor retornado significa maior precedencia
    
    String exp;
    int resposta;
    
    
    static int Prec(char ch) 
    { 
        switch (ch) 
        { 
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
       
    // Principal metodo para converter o infixo para
    // Expressao posfixa  
    static String infixToPostfix(String exp) 
    { 
        // inicializando variavel de resultado
        String result = new String(""); 
          
        // inicializando stack 
        Stack<Character> stack = new Stack<>(); 
          
        for (int i = 0; i<exp.length(); ++i) 
        { 
            char c = exp.charAt(i); 
              
             // se o caracter é operador, adiciona na saida
            if (Character.isLetterOrDigit(c)) 
                result += c; 
               
            // se o caracter utilizado for ( empurrar para pilha
            else if (c == '(') 
                stack.push(c); 
              
            //  se o caracter for ) dar saida da pilha
            // ate que um seja encontrado
            else if (c == ')') 
            { 
                while (!stack.isEmpty() && stack.peek() != '(') 
                    result += stack.pop(); 
                  
                if (!stack.isEmpty() && stack.peek() != '(') 
                    return "Invalid Expression";                 
                else
                    stack.pop(); 
            } 
            else // um operador é encontrado
            { 
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())){ 
                    if(stack.peek() == '(') 
                        return "Invalid Expression"; 
                    result += stack.pop(); 
             } 
                stack.push(c); 
            } 
       
        } 
       
        // pop em todos os operadores da pilha
        while (!stack.isEmpty()){ 
            if(stack.peek() == '(') 
                return "Invalid Expression"; 
            result += stack.pop(); 
         } 
        return result; 
    } }
