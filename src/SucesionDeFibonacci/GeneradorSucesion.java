/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SucesionDeFibonacci;

/**
 *
 * @author HP
 */
public class GeneradorSucesion {

    public int fibonacciNormal(int posicion){
        posicion = java.lang.Math.abs(posicion);
        if(posicion < 2) 
           return posicion;
        else{
            int respuesta = fibonacciNormal(posicion - 1) + fibonacciNormal(posicion - 2);
            return respuesta;
        }
    }
    
    int diccionarioFibo(int posicion){
        int[] memo = new int[posicion + 1];
        return fibonacciMemoized(posicion, memo);
    }
    
    public int fibonacciMemoized(int posicion, int[] memo){
        if(posicion < 2)
            return posicion;
        else if(memo[posicion] != 0)
            return memo[posicion];
            int respuesta = fibonacciMemoized(posicion - 1,memo) + fibonacciMemoized(posicion - 2,memo);
            return respuesta;
    }
    
    public int fibonacciBottonUpApproach(int posicion){
        if(posicion < 2)
            return posicion;
        int[] bottonUp = new int[posicion + 1];
        bottonUp [0] = 0;
        bottonUp [1] = 1;
        bottonUp [2] = 1;
        for(int i = 3; i <= posicion; i++){
            bottonUp [i] = bottonUp[i - 1] + bottonUp[i - 2];
        }
        return bottonUp[posicion];
    }
}    

    
