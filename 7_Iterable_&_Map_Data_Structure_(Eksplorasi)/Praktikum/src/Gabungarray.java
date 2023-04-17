import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Gabungarray {
    public static void main(String[] args) {
        String[] array1 = {"kazuya", "jin", "lee"};
        String[] array2 = {"kazuya", "feng"};
        String[] hasil1 = gabungArray(array1, array2);
        System.out.println(Arrays.toString(hasil1)); // Output: [kazuya, jin, lee, feng]

        String[] array3 = {"lee", "jin"};
        String[] array4 = {"kazuya", "panda"};
        String[] hasil2 = gabungArray(array3, array4);
        System.out.println(Arrays.toString(hasil2)); // Output: [lee, jin, kazuya, panda]
    }

    public static String[] gabungArray(String[] array1, String[] array2) {
        List<String> listGabungan = new ArrayList<String>(Arrays.asList(array1));
        for (String nama : array2) {
            if (!listGabungan.contains(nama)) {
                listGabungan.add(nama);
            }
        }
        String[] arrayGabungan = listGabungan.toArray(new String[0]);
        return arrayGabungan;
    }
}
