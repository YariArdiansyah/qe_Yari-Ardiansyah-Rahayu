package Yari_OOP;

public class calculator {

    // metod penjumlahan
    public Integer add(Integer x, Integer y) {
        Integer hasil = x + y;
        return hasil;
    }

    // metod pengurangan
    public Integer substarct(Integer x, Integer y) {
        Integer hasil = x - y;
        return hasil;
    }

    // metod perkalian
    public Integer multiply(Integer x, Integer y) {
        Integer hasil = x * y;
        return hasil;
    }

    // metod pembagian
    public Integer divided(Integer x, Integer y) {
        Integer hasil = x / y;
        return hasil;
    }

    public static void main(String[] args) {
    calculator calc = new calculator();
        System.out.println("Penjumlahan : "+calc.add(3,4));
        System.out.println("Pengurangan : "+calc.substarct(15,4));
        System.out.println("Perkalian : "+calc.multiply(10,10));
        System.out.println("Penjumlahan : "+calc.divided(12,3));
    }
}
