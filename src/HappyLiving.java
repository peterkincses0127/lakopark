import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class HappyLiving {
    public ArrayList<Lakopark> getLakoparkok() {
        return lakoparkok;
    }

    public ArrayList<Lakopark> lakoparkok;
    public HappyLiving(String filenev) throws IOException {

            Scanner sc = new Scanner(new File(filenev));
            while(sc.hasNext()){
                String nev = sc.nextLine();
                String [] meret = sc.nextLine().split(";");
                int utcakSzama = Integer.parseInt(meret[0]);
                int maxHazakSzam = Integer.parseInt(meret[1]);
                int [][] hazak = new int[utcakSzama][maxHazakSzam];
                for (int i = 0; i < utcakSzama; i++) {
                    String[] sor = sc.nextLine().split(";");
                    for (int j = 0; j < maxHazakSzam; j++) {
                        hazak[i][j] = Integer.parseInt(sor[j]);
                    }
                }
                lakoparkok.add(new Lakopark(hazak,maxHazakSzam,nev,utcakSzama));
                sc.nextLine();
            }




    }
}
