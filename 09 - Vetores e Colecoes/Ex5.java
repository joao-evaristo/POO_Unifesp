/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author joaoe
 */
public class Ex5 {
    public static void main(String[] args) {
        char[][] pic = new char[6][6];
        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 6; j++) {
                if ( i == j || i == 0 || i == 5 )
                    pic[i][j] = '*';
                else
                    pic[i][j] = '.';
                }
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++)
                    System.out.println(pic[i][j]);
                    System.out.println();
                }   
    }
}

/*Saída:

*
*
*
*
*
*

.
*
.
.
.
.

.
.
*
.
.
.

.
.
.
*
.
.

.
.
.
.
*
.

*
*
*
*
*
*

*/

