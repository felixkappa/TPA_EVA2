/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MIS_LIBRERIAS;

/**
 *
 * @author invitado
 */
public class MIS_LIBRERIAS {
    
    public static int calcularFacto(int valor){
    int facto = 1;
    for (int i = 1; i <= valor; i++){
    facto*=i;
    }
    return facto;
    }
    
}
