package ex1;

public class Dreptunghi {

    private int lungime;
    private int latime;

    public Dreptunghi(int lungime, int latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    public int perimetru() {
        return 2 * (lungime + latime);
    }

    public int arie() {
        return lungime * latime;
    }
}
