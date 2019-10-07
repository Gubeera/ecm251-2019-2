import DAO.SingletonCartaDAO;
import model.Carta;
import model.Corno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    private Scanner scan;
    private List<Carta> cartas;
    private List<Corno> cornos;
    public MainApp(){
        scan = new Scanner(System.in);
        cartas = new ArrayList<>();
        cornos = new ArrayList<>();
    }
    private void menu(){
        System.out.println(
                        "1 - Ver" +
                        "\n" +
                        "2 - Criar" +
                        "\n" +
                        "3 - procura por nome" +
                        "\n" +
                        "4 - procura por genero" +
                        "\n" +
                        "5 - atualizar" +
                        "\n" +  "6 - deletar " + "\n" +
                         "7 - colocar cornos" + "\n" +
                         "8 - Logar com corno " + "\n" +
                         "0 - Sair" +
                        "\n" +

                        "\n");
    }
    public void mainLoop(){
        int op;
        while(true){
            menu();
            op = scan.nextInt();
            if(op == 0)
                break;
            else
                avaliarOp(op);
        }
    }
    private void avaliarOp(int op){
        Carta carta = new Carta();
        Corno corno = new Corno();
        switch(op){
            case 1: // Buscar todos
                cartas = SingletonCartaDAO.getInstance().getAllCartas();
                exibirJogos();
                break;
            case 2: // Criar
                System.out.println("Informe dono, nome, tipo, coleção e número: ");
                carta.dono = scan.next();
                carta.nome = scan.next();
                carta.tipo = scan.next();
                carta.colection = scan.next();
                carta.number = scan.nextInt();
                SingletonCartaDAO.getInstance().insertCarta(carta);
                break;
            case 3: // print by name
                System.out.println("Informe um nome: ");
                carta.nome = scan.next();
                cartas = SingletonCartaDAO.getInstance().getAllCartaByName(carta.nome);
                exibirJogos();
                break;
            case 4: // print by genre
                System.out.println("Informe um tipo: ");
                carta.tipo = scan.next();
                cartas = SingletonCartaDAO.getInstance().getAllCartaByType(carta.tipo);
                exibirJogos();
                break;
            case 5: //update
                System.out.println("Informe um ID: ");
                carta.nome = scan.next();
                cartas = SingletonCartaDAO.getInstance().getAllCartaByName(carta.dono);
                if(cartas == null)
                    System.out.println("carta nao cadastrado.");
                else{
                    carta = cartas.get(0);
                    System.out.println("Dono + ["+carta.dono+"]: ");
                    carta.dono = scan.next();
                    System.out.println("Nome + ["+carta.nome+"]: ");
                    carta.nome = scan.next();
                    System.out.println("Tipo + ["+carta.tipo+"]: ");
                    carta.tipo = scan.next();
                    System.out.println("Collection + ["+carta.colection+"]: ");
                    carta.colection = scan.next();
                    System.out.println("Number + ["+carta.number+"]: ");
                    carta.number = scan.nextInt();
                    SingletonCartaDAO.getInstance().updateCarta(carta);
                }
                break;
            case 6:
                System.out.println("Informe o ID:");
                carta.id = scan.nextInt();
                SingletonCartaDAO.getInstance().deleteById(carta.id);
                break;
            case 7:
                System.out.println("Informe o nome e a senha do corno: ");
                corno.nome = scan.next();
                corno.senha = scan.next();
                SingletonCartaDAO.getInstance().insertCorno(corno);
                break;
            case 8:
                System.out.println("digite o nome e a senha para logar");
                corno.nome = scan.next();
                corno.senha = scan.next();
                SingletonCartaDAO.getInstance().loginCorno(corno);
                break;
            case 0: // Sair
        }
    }
    private void exibirJogos(){
        for(Carta carta: cartas){
            System.out.println(carta);
        }
    }
}
