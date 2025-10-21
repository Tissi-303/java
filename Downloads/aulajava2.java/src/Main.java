import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {


        String r;
        do {
            Scanner sc = new Scanner(System.in);
            Aluno c = new Aluno();
            Aluno a1 = new Aluno("Davi");
            Aluno a2 = new Aluno("Ana", 123);
            Professor p = new Professor("Maria");
            Disciplina d = new Disciplina("POO");

            p.setCargo(Cargo.Professor);
            System.out.println(p.getCargo());


            d.associar(p);
            d.mostrarDiciplina();

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

            System.out.println("Digite 1 para Aluno ou digite 2 Professor");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Opção 1 selecionada");

                    System.out.print("Digite sua matricula: ");
                    c.setMatricula(sc.nextInt());
                    System.out.print("Digite sua NOTA1: ");
                    c.setNota1(sc.nextDouble());
                    System.out.print("Digite sua NOTA2: ");
                    c.setNota2(sc.nextDouble());
                    System.out.print("Digite sua NOTA3: ");
                    c.setNota3(sc.nextDouble());

                    c.calcularMedia();
                    System.out.println("Sua media é " + c.getMedia());

                    break;
                case 2:
                    System.out.println("Opção 2 selecionada");


                    break;
                default:
                    System.out.println("Opção invalida.");
            }



            System.out.println("Quer se cadastrar novamente? Digite S");
            r = sc.next();
        }while (r.equalsIgnoreCase("S"));

    }
}