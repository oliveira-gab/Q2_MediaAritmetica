//2. Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
//números 4, 5 e 6. A soma das duas médias. A média das médias.

import java.util.ArrayList;
import java.util.List;
public class Q2_Main {

    public static void main(String[] args) {
        List Val1 = new ArrayList<>();
        Val1.add(8);
        Val1.add(9);
        Val1.add(7);

        List Val2 = new ArrayList<>();
        Val2.add(4);
        Val2.add(5);
        Val2.add(6);

        int firstAv;
        int i;
        int Sum1 = 0;
        for (i = 0; i<Val1.size(); i++) {
            Sum1 = Sum1 + (int) Val1.get(i);
        }
        firstAv = Sum1 / Val1.size();
        System.out.println("A primeira média artimética é: " + firstAv);

        int secondAv;
        int Sum2 = 0;
        for (i = 0; i<Val2.size(); i++) {
            Sum2 = Sum2 + (int) Val2.get(i);
        }
        secondAv = Sum2 / Val2.size();

        System.out.println("A segunda média artimética é: " + secondAv);

        int avSum;
        int avAv;
        avSum = secondAv + firstAv;
        avAv = avSum / 2;
        System.out.println("A soma das duas médias é: " + avSum);
        System.out.println("A A média das médias: " + avAv);
    }
}
