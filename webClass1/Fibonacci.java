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
public class Fibonacci {
    public static int of(int n){
        if(n == 1)  return 1;
        else if(n == 2) return 1;
        else if(n >= 3){
            int pre = 1, cur = 1;
            for(int i = 3; i <= n; i++){
                int tmp = cur;
                cur += pre;
                pre = tmp;
            }
            return cur;
        }
        return -1;
    }
}
