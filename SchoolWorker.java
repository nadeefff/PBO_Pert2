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
public class SchoolWorker {
    private String nama;
    private int umur;
   
    public void melakukanEvaluasi() {
        System.out.println("School Worker melakukan evaluasi");
    }
    public void menilai() {
        System.out.println("School Worker memberikan penilaian");   
    }
    public void sekolah() {
        System.out.println("School Worker bekerja di sekolah");   
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public int getUmur() {
        return umur;
    }
    public void melakukanKonsultasi() {
        System.out.println("Guru memberikan konsultasi prestasi");
    }
    public void memberikanNilai() {
        System.out.println("Guru memberikan nilai tambahan.");
    }
}