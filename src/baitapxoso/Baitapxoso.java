package baitapxoso;
import java.util.Random;

public class Baitapxoso {

    public static void main(String[] args) {
        Random rand = new Random();
        int xoso = rand.nextInt(100) + 1;
        System.out.println("Ket qua xo so cua ban la: "+ xoso);
    }
    
}
