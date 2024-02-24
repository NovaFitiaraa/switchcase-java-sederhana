/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.usk_novafitiara;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Usk_novafitiara {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nilai,nama,kelas;
        
        System.out.println("======================");
        System.out.println(" SISTEM PENDIDIKAN ARA");
        System.out.println("======================");
        System.out.print("Nama Siswa       : ");
        nama = input.nextLine();
        System.out.print("Kelas Siswa      : ");
        kelas = input.nextLine();
        System.out.print("Nilai Siswa (A-E): ");
        nilai = input.nextLine();
        
        switch(nilai){
            case "A":
                System.out.println("Pertahankan");
                break;
            case "B":
                System.out.println("Harus lebih baik lagi !");
                break;
            case "C":
                System.out.println("Perbanyak belajar");
            break;
            case "D":
                System.out.println("Jangan keseringan main");
            break;
            case "E":
                System.out.println("Kebanyakan bolos");
            break;
            default:
                System.out.println("Maaf,format nilai tidak sesuai");
        }
    }
}
