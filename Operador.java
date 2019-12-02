/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wallisons
 */
public class Operador {
    
         static boolean isOperator(char x) 
    { 
  
        switch (x) { 
        case '+': 
        case '-': 
        case '/': 
        case '*': 
            return true; 
        } 
        return false; 
    } 
    
}
    
