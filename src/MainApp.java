/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author PC
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a = 5;
        int b = 10;
        int hasil = tambah(a, b);
        System.out.println("Hasil tambah a dan b adalah " + hasil);
    }

    public static int tambah(int x, int y) {
        return x + y;
    }
}