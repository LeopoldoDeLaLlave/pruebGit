/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagit;

/**
 *
 * @author Javier
 */
public class PruebaGit {

    /**
     * @param args the command line arguments
     * 
     */
    
    //Quita los espacios de un String
    private String quita(String str){
        String noEspacios = "";
        for (int i = 0; i < str.length(); i++) {//guardamos str sin espacios
            if (str.charAt(i) != ' ') {
                noEspacios += str.charAt(i);
            }
        }
        
        return noEspacios;
    }
    
    
    public static void main(String[] args) {
        
        //https://github.com/LeopoldoDeLaLlave/pruebGit.git
        //he añadido un métodeo que quita espacios
        
        
    }
    
}
