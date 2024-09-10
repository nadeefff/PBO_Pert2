/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_2;

/**
 *
 * @author LENOVO
 */
  public class Utama {
    public static void main(String[] args) {
        Student student = new Student(); // Constructor
        System.out.println("Nama siswa: " + student.getNama());
        System.out.println("Umur siswa: " + student.getUmur());
        System.out.println("Mata pelajaran siswa: " + student.getMataPelajaran());
        System.out.println("");
        
        Teacher teacher = new Teacher(); // Constructor
        System.out.println("Nama guru: " + teacher.getNama());
        System.out.println("Umur guru: " + teacher.getUmur());
        System.out.println("Guru mengajar di " + teacher.getSekolah());
        System.out.println("super and this");
        teacher.cek();
        System.out.println("");
       
        SchoolWorker worker = (SchoolWorker) student; // Casting 
        worker.melakukanEvaluasi();
        
        SchoolWorker Worker = new SchoolWorker ();
        Worker.menilai();
        Worker.melakukanEvaluasi();
        System.out.println("");  
    }
}
