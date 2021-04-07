public class Lakopark {
    public Lakopark(int[][] hazak, int maxHazSzam, String nev, int utcakSzama) {
        this.hazak = hazak;
        this.maxHazSzam = maxHazSzam;
        this.nev = nev;
        this.utcakSzama = utcakSzama;
    }

    public int[][] getHazak() {
        return hazak;
    }

    public void setHazak(int[][] hazak) {
        this.hazak = hazak;
    }

    public int getMaxHazSzam() {
        return maxHazSzam;
    }

    public void setMaxHazSzam(int maxHazSzam) {
        this.maxHazSzam = maxHazSzam;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getUtcakSzama() {
        return utcakSzama;
    }

    public void setUtcakSzama(int utcakSzama) {
        this.utcakSzama = utcakSzama;
    }

    private int [][]hazak;
    private int maxHazSzam;
    private String nev;
    private int utcakSzama;
}
