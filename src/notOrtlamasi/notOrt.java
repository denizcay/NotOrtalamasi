package notOrtlamasi;
import java.util.Scanner;
public class notOrt {
    public static void main(String[] args) {
        int mat, turkce, fizik, kimya, tarih, muzik;
        Scanner imput = new Scanner(System.in);
        System.out.print("Matematik notunu giriniz:");
        mat = imput.nextInt();
        System.out.print("Fizik notunu giriniz:");
        fizik = imput.nextInt();
        System.out.print("Kimya notunu giriniz:");
        kimya = imput.nextInt();
        System.out.print("Tarih notunu giriniz:");
        tarih= imput.nextInt();
        System.out.print("Türkçe notunu giriniz:");
        turkce = imput.nextInt();
        System.out.print("Müzik notunu giriniz:");
        muzik = imput.nextInt();

        double ort = (mat+fizik+kimya+turkce+tarih+muzik)/6.0;
        System.out.println("Öğrencinin not ortalaması:" + ort);
        System.out.println(ort>=60 ? "Öğrenci sınıfı geçti." : "Öğrenci sınıfta kaldı.");
    }
}
