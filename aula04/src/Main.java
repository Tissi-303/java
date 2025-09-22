import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String r;
        do {
            Scanner sc = new Scanner(System.in);
            Cliente c = new Cliente();

            System.out.print("Digite o nome do cliente: ");
            c.setNome(sc.next());

            System.out.print("Digite o RG do cliente: ");
            c.setRg(sc.next());

            System.out.print("Digite o número do cliente: ");
            c.setNum(sc.next());

            System.out.print("Digite o endereço do cliente: ");
            c.setEnd(sc.next());

            System.out.print("Digite o peso do cliente: ");
            c.setPeso(sc.nextDouble());

            System.out.print("Digite a altura do cliente: ");
            c.setAlt(sc.nextDouble());;

            System.out.println(c.getNome());
            System.out.println(c.getRg());
            System.out.println(c.getNum());
            System.out.println(c.getEnd());

            c.calc();

            if (c.getIMC() < 10.5) {
                System.out.println("Você está abaixo do peso!");
            } else if (c.getIMC() >= 10.5 && c.getIMC() < 25.0) {
                System.out.println("Você está com o peso normal.");
            } else if (c.getIMC() >= 25.0 && c.getIMC() < 30.0) {
                System.out.println("Você está com sobrepeso.");
            } else {
                System.out.println("Você está obeso.");
            }

            System.out.println("Quer se cadastrar novamente? Digite S");
            r = sc.next();
        }while (r.equalsIgnoreCase("S"));


    }
}