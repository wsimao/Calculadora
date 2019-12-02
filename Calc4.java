

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
public class Calc4 {
    
    // Converte posfixo para prefixo
    static String postToPre(String post_exp) 
    { 
        Stack<String> s = new Stack<String>(); 
  
        // length da expressao = comprimento da expressao
        int length = post_exp.length(); 
  
        // lendo da direita para a esquerda
        for (int i = 0; i < length; i++) { 
  
            // verifica o simbolo do operador
            if (Operador.isOperator(post_exp.charAt(i))) { 
  
                // pop em dois operandos da pilha
                String op1 = s.peek(); 
                s.pop(); 
                String op2 = s.peek(); 
                s.pop(); 
  
                // Concatena os operandos e operadores
                String temp = post_exp.charAt(i) + op2 + op1; 
  
                // Empurra a String de volta para a pilha
                s.push(temp); 
            } 
  
            // Se o simbolo é um operador
            else { 
  
                // empurre o operando a pilha
                s.push(post_exp.charAt(i) + ""); 
            } 
        } 
  
        // pilha contem a expressao prefixa
        return s.peek(); 
    }}
