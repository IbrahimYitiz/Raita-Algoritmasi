import java.util.Arrays;

public class RaitaAlgoritmasi {
    public static int[] raita(int[] dizi) {
        int n = dizi.length;
        int[] cikti = new int[n];
        int[] sayac = new int[256];

        // Girdi dizisindeki her elemanın frekansını hesapla ve bir sayac dizisine kaydet.
        for (int i = 0; i < n; i++) {
            sayac[dizi[i]]++;
        }

        // Sayac dizisindeki elemanların örnek toplamını hesapla.
        for (int i = 1; i < 256; i++) {
            sayac[i] += sayac[i - 1];
        }

        // Girdi dizisindeki elemanları sayac dizisini kullanarak yeniden düzenle.
        for (int i = n - 1; i >= 0; i--) {
            cikti[sayac[dizi[i]] - 1] = dizi[i];
            sayac[dizi[i]]--;
        }

        return cikti;
    }

    public static void main(String[] args) {
        int[] girdi = {4, 2, 8, 3, 1, 6, 7, 5};
        int[] cikti = raita(girdi);
        System.out.println("Sıralanmış dizi: " + Arrays.toString(cikti));
    }
}
