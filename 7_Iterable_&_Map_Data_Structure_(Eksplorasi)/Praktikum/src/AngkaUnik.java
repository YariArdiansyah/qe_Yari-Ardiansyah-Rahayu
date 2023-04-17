import java.util.ArrayList;
import java.util.List;

public class AngkaUnik {

    public static void main(String[] args) {
        String input1 = "76523752";
        List<Character> output1 = cariAngkaUnik(input1);
        System.out.println(output1);

        String input2 = "1122";
        List<Character> output2 = cariAngkaUnik(input2);
        System.out.println(output2);
    }

    public static List<Character> cariAngkaUnik(String input) {
        List<Character> angkaUnik = new ArrayList<Character>();
        for (int i = 0; i < input.length(); i++) {
            char angka = input.charAt(i);
            if (input.indexOf(angka) == input.lastIndexOf(angka) && !angkaUnik.contains(angka)) {
                angkaUnik.add(angka);
            }
        }
        return angkaUnik;
    }
}
