/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21task3vladislavgerassimov;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SPTV21TASK3VLADISLAVGERASSIMOV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Имя: ");
        String name = scanner.next();
        System.out.println("Фамилия: ");
        String surname = scanner.next();
        System.out.println("Личный код: ");
        String code = scanner.next();
        System.out.println(code.substring(5,7));
        String date = code.substring(5,7);
        System.out.println(code.substring(1,3));
        String month = code.substring(1,3);
        System.out.println(code.substring(3,5));
        String year = code.substring(3,5);
        System.out.printf(name+" "+surname+" "+"was born on the"+" "+date+" "+month+" "+year);
    }
    
}
