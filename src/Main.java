
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String r;
        do {
            Scanner sc = new Scanner(System.in);

            Professor p = new Professor();
            Professor p = new Professor("Maria");
            Aluno c = new Aluno();
            Aluno a1 = new Aluno ("Davi");
            Aluno a2 = new Aluno ("Davi", 123);


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

            System.out.println("Digite 1 para Aluno ou digite 2 para Professor");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Opção selecionado");

                    System.out.println("Digite sua matricula");
                    c.setMatricula(sc.nextInt());
                    System.out.println("Digite sua NOTA1");
                    c.setNota1(sc.nextDouble());
                    System.out.println("Digite sua NOTA2");
                    c.setNota2(sc.nextDouble());
                    System.out.println("Digite sua NOTA3");
                    c.setNota3(sc.nextDouble());

                    c.calcularMedia();
                    System.out.println("Sua média é " + c.getMedia());


                    break;

                case 2:
                    System.out.println("Opção 2 selecionada");

                    break;
                default:
                    System.out.println("Opção invalida");
            }

            System.out.println("Quer se cadastrar novamente? Digite S");
            r = sc.next();
        }while (r.equalsIgnoreCase("S"));

    }
}
