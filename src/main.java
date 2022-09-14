import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {

        int[] i1 = {1,2,3};
        float[] r = {1.57f,7.654f,9.986f};
        int[] m = new int[4];


        System.out.println("задание 2");
        for (int i = 0; i < i1.length; i++) {
            System.out.print(i1[i] + ", ");
        }
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i] + ", ");
        }
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + ", ");
        }


        System.out.println("задание 3");
        for (int i = i1.length - 1; i >= 0; i--) {
            System.out.println(i1[i] + ", ");
        }
        for (int i = r.length-1; i >= 0; i--) {
            System.out.println(r[i] + ", ");
        }
        for (int i = m.length-1; i >= 0; i--) {
            System.out.println(m[i] + ", ");
        }

        System.out.println("4 задание");
        for (int i = 0; i < i1.length; i++) {
            if (i1[i] % 2 != 0) {
                i1[i] += 1;
            }
            System.out.println(i1[i]);

        }

    }

}







