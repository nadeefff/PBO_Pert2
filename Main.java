package pbo_3;

/**
 *
 * @author LENOVO
 */
abstract class Hewan {
    public abstract void CaraBergerak();
    public abstract void Makan();

    // Overloaded method
    public void Makan(String food) {
        System.out.println("Hewan ini makan: " + food);
    }
}

class Ular extends Hewan {
    @Override
    public void CaraBergerak() {
        System.out.println("Ular: Melata");
    }

    @Override
    public void Makan() {
        System.out.println("Ular: Makan daging");
    }

    // Overloaded method
    public void Makan(int jumlah) {
        System.out.println("Ular makan sebanyak: " + jumlah + " kali sehari.");
    }
}

class Sapi extends Hewan {
    @Override
    public void CaraBergerak() {
        System.out.println("Sapi: Berjalan");
    }

    @Override
    public void Makan() {
        System.out.println("Sapi: Makan rumput");
    }

    // Overloaded method
    public void Makan(int jumlah, String waktu) {
        System.out.println("Sapi makan sebanyak: " + jumlah + " kali di " + waktu);
    }
}

public class Main {
    public static void main(String[] args) {
        Ular reptil = new Ular();
        Sapi mamalia = new Sapi();

        // Menampilkan cara bergerak dan makan dari objek hewan
        reptil.CaraBergerak();
        reptil.Makan();
        reptil.Makan(3); // Menggunakan metode overload dengan jumlah makan

        mamalia.CaraBergerak();
        mamalia.Makan();
        mamalia.Makan(2, "siang hari"); // Menggunakan metode overload dengan jumlah makan dan waktu
    }
}
