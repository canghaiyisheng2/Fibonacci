/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webClass1;

/**
 *
 * @author lenovo
 */
public class main {
    
    public static void main(String[] arg){
      for(int i = 0;i < 200; i++){
          if(Fibonacci.of(i + 1) > 200)    break;
          System.out.printf("Fibonacci(%d) = %d\n", i + 1, Fibonacci.of(i + 1));
      }  
    }
}
