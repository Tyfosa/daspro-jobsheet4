import java.util.Scanner;

public class siakad23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiUTS, nilaiUAS, nilaiAkhir;
        
        System.out.println("Masukkan nama\t\t: ");
        nama = sc.nextLine();
        System.out.println("Masukkan NIM\t\t: ");
        nim = sc.nextLine();
        System.out.println("Masukkan kelas\t\t: ");
        kelas = sc.nextLine().charAt(0);
        System.out.println("Masukkan nomor absen\t: ");
        absen = sc.nextByte();
        System.out.println("Masukkan nilai kuis\t: ");
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukkan nilai tugas\t: ");
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan nilai ujian\t: ");
        nilaiUjian = sc.nextDouble();
        System.out.println("Masukkan nilai UTS\t: ");
        nilaiUTS = sc.nextDouble();
        System.out.println("Masukkan nilai UAS\t: ");
        nilaiUAS = sc.nextDouble();
        System.out.println("Masukkan nilai akhir\t: ");
        nilaiAkhir = sc.nextDouble();
       
        nilaiAkhir = (nilaiKuis / 100 * 20) + (nilaiTugas / 100 * 15) + (nilaiUTS / 100 * 30) + (nilaiUAS / 100 * 35);
        String nilaiAkhirHuruf;
        String nilaiAkhirKualifikasi;

        if(nilaiAkhir <= 39) {
            nilaiAkhirHuruf = "E";
            nilaiAkhirKualifikasi = "Gagal";
        } else if (nilaiAkhir <= 50) {
            nilaiAkhirHuruf = "D";
            nilaiAkhirKualifikasi = "Kurang";
        } else if (nilaiAkhir <= 60) {
            nilaiAkhirHuruf = "C";
            nilaiAkhirKualifikasi = "Cukup";
        } else if (nilaiAkhir <= 65) {
            nilaiAkhirHuruf = "C+";
            nilaiAkhirKualifikasi = "Lebih Dari Cukup";
        } else if (nilaiAkhir <= 73) {
            nilaiAkhirHuruf = "B";
            nilaiAkhirKualifikasi = "Baik";
        } else if (nilaiAkhir <= 80) {
            nilaiAkhirHuruf = "B+";
            nilaiAkhirKualifikasi = "Lebih Dari Baik";
        } else {
            nilaiAkhirHuruf = "A";
            nilaiAkhirKualifikasi = "Sangat Baik";
        }
       
        System.out.printf("\nOutput:\n\nNama\t\t\t: %s\nNIM\t\t\t: %s\nKelas\t\t\t: %s\nAbsen\t\t\t: %s\nNilai Kuis\t\t: %s\nNilai Tugas\t\t: %s\nNilai UTS\t\t: %s\nNiali UAS\t\t: %s\n\nMahasiswa dengan nama %s (NIM %s) kelas %s nomor absen %s\nNilai Akhir\t\t: %s\nNilai Akhir Huruf\t: %s\nNilai Akhir Kualifikasi\t: %s", nama, nim, kelas, absen, nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nama, nim, kelas, absen, nilaiAkhir, nilaiAkhirHuruf, nilaiAkhirKualifikasi);
    

    }
}