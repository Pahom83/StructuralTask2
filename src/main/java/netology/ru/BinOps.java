package netology.ru;

public class BinOps {
    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        return intToBinString(binInStringToInt(a)+ binInStringToInt(b));
    }

    public String multi(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        return intToBinString(binInStringToInt(a) * binInStringToInt(b));
    }

    private int binInStringToInt(String binStr) {
        return Integer.parseInt(binStr, 2);
    }

    private String intToBinString(int b) {
        return Integer.toBinaryString(b);
    }
}