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
public class Teacher extends SchoolWorker implements Consultation, Grading {
    private String sekolah;
    
    public Teacher() {
        System.out.println("ini constructor Teacher");
    }
    
    public void setSekolah(String sekolah) {
        this.sekolah = sekolah;
    }
    
    public String getSekolah() {
        return sekolah;
    }

    @Override
    public void melakukanKonsultasi() {
        System.out.println("Guru memberikan konsultasi akademik kepada siswa.");
    }
    public void memberikanNilai() {
        System.out.println("Guru memberikan nilai kepada siswa.");
    }
    public void cek(){ //super menampilkan yang ada di kelas induk yaitu schoolworeker
        super.melakukanKonsultasi();
        this.melakukanKonsultasi();
        super.memberikanNilai();
        this.memberikanNilai();
    }     
    }    