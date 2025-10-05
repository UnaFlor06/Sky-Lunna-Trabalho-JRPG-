import java.util.Scanner;
public class MainMenu {
    public static void main (String[] args){
        Scanner entry = new Scanner(System.in);
        int option = 0;
        Player player = null;
        while (option != 4) {
            System.out.println("====== Sky Lunna ====="); //Menu principal de switch case
            System.out.println("1-) Iniciar"); //Não sei programar
            System.out.println("2-) História"); //Então
            System.out.println("3-) Configurações"); // O menu vai ser switch case 
            System.out.println("4-) Voltar para área de trabalho"); //Fazer o que, né?

            option = entry.nextInt();
            entry.nextLine();

            switch (option) {
                case 1:
                     player = PlayerCreator.makePlayer();
                     player.heroStatus();
                    break;

                case 2:
                    Enredo.placeStory();
                    break;

                case 3:
                    System.out.println("Opções ainda estão por vir :)...");
                    break;

                case 4:
                    SillyExit exit = new SillyExit();
                    exit.Silly();
                    break;

                default:
                    System.out.println("Por favor escolha uma opção válida...");


            }
        }
        entry.close();
    }
}