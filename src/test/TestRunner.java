
package test;

import perkuliahan.Penilaian;

public class TestRunner {
    public static void main(String[] args) {
        
        Penilaian penilaian = new Penilaian();

        System.out.println(penilaian.hitungNilaiHuruf(100, 80, 95, 65, 100));
        System.out.println(penilaian.hitungNilaiHuruf(90, 90, 90, 80, 95));
        System.out.println(penilaian.hitungNilaiHuruf(90, 95, 100, 95, 80));
        System.out.println(penilaian.hitungNilaiHuruf(65, 85, 70, 75, 55));
        System.out.println(penilaian.hitungNilaiHuruf(60, 65, 60, 60, 60));
        System.out.println(penilaian.hitungNilaiHuruf(70, 50, 50, 50, 50));

    }
 
}


