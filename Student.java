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
public class Student extends SchoolWorker {
    private String mataPelajaran;
    
    public Student() {
        System.out.println("ini constructor Student");
        super.melakukanEvaluasi();
        super.menilai();
        super.setNama("Budi");
        super.setUmur(18);
        this.setMataPelajaran("Matematika");
    }
    
    public void setMataPelajaran(String mataPelajaran) {
        this.mataPelajaran = mataPelajaran;
    }
    
    public String getMataPelajaran() {
        return mataPelajaran;
    }
}

