import java.util.Scanner;

public class CalculoProdutoVetorial {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        final String i = "^i";
        final String j = "^j";
        final String k = "^k";

        double ax;
        double ay;
        double az;

        double bx;
        double by;
        double bz;

        double vetorI;
        double vetorJ;
        double vetorK;

        System.out.println("Entre com o  valor de X para o vetor i ");
        ax = sc.nextDouble();
        System.out.println("Entre com o  valor de Y para o vetor i ");
        ay = sc.nextDouble();
        System.out.println("Entre com o  valor de Z para o vetor i ");
        az = sc.nextDouble();

        System.out.println("Entre com o  valor de X para o vetor j ");
        bx = sc.nextDouble();
        System.out.println("Entre com o  valor de Y para o vetor j ");
        by = sc.nextDouble();
        System.out.println("Entre com o  valor de Z para o vetor j ");
        bz = sc.nextDouble();

        vetorI = (ay*bz - az*by);
        vetorJ = (az*bx - ax*bz);
        vetorK = (ax*by - ay*bx);

        System.out.println("Matriz : ");

        System.out.println("^i |   ^j   |   ^k   |   ^i   |   ^j");
        System.out.println(ax + "|   " +  ay + "   |" + az + "   |" + ax + "   |" + ay);
        System.out.println(bx + "|   " +  by + "   |" + bz + "   |" + bx + "   |" + by);

        System.out.println("\n");

        System.out.println("Operação sendo executada: ");

        System.out.println("Vetor I: ((" + ay + "*" + bz + ") - (" + az + "*" + by + "))^i");
        System.out.println("Vetor J: ((" + az + "*" + bx + ") - (" + ax + "*" + bz + "))^j");
        System.out.println("Vetor K: ((" + ax + "*" + by + ") - (" + ay + "*" + bx + "))^k");

        System.out.println("\n");

        System.out.println("o Resultado final é : " + vetorI + " " +  i + " "
                + vetorJ + " " +  j   + " "
                + vetorK + " " +  k);
    }
}
