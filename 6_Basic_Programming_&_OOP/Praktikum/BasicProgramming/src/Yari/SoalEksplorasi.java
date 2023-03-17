package Yari;

public class SoalEksplorasi {
    private static String encrypt(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : chars) {
            if (Character.isLetter(c)) {
                int asciiValue = (int) c + 10;
                char shiftedChar = (char) asciiValue;
                if (!Character.isLetter(shiftedChar)) {
                    shiftedChar = (char) (asciiValue - 26);
                }
                sb.append(shiftedChar);
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(encrypt("SEPULSA OKE"));
        System.out.println(encrypt("ALTERRA ACADEMY"));
        System.out.println(encrypt("INDONESIA"));
        System.out.println(encrypt("GOLANG"));
        System.out.println(encrypt("PROGRAMMER"));
    }
}
