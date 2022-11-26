/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hewan;

/**
 *
 * @author HP
 */
public class MainHewan {

    public static void main(String[] args) {
        Harimau harimau = new Harimau();
        Sapi sapi = new Sapi();
        Musang musang = new Musang();
        
        harimau.MemakanDaging();
        harimau.Taring();
        
        sapi.MemakanTumbuhan();
        sapi.Graham();
        
        musang.MemakanDaging();
        System.out.println("Musang juga ");
        musang.MemakanTumbuhan();
        musang.Taring();
        System.out.println("Musang juga ");
        musang.Graham();
    }
    
}
