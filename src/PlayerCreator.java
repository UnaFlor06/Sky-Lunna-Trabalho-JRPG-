import java.util.Scanner;

public class PlayerCreator {
    public static Player makePlayer() {
        Scanner sc = new Scanner(System.in);

        int totalDist;
        int maxAtributo = 10;
        String name;
        int str, cnst, agil, dext;

        do {
            totalDist = 10;
            str = cnst = agil = dext = 0;

            System.out.println("===== Crie seu personagem =====");
            System.out.print("Qual é seu nome? ");
            name = sc.nextLine();

            // Força
            do {
                System.out.println("Pontos restantes: " + totalDist);
                System.out.print("Força (STR, máximo 10): ");
                str = sc.nextInt();
            } while (str < 0 || str > maxAtributo || str > totalDist);
            totalDist -= str;

            // Constituição
            do {
                System.out.println("Pontos restantes: " + totalDist);
                System.out.print("Constituição (CNST, máximo 10): ");
                cnst = sc.nextInt();
            } while (cnst < 0 || cnst > maxAtributo || cnst > totalDist);
            totalDist -= cnst;

            // Agilidade
            do {
                System.out.println("Pontos restantes: " + totalDist);
                System.out.print("Agilidade (AGIL, máximo 10): ");
                agil = sc.nextInt();
            } while (agil < 0 || agil > maxAtributo || agil > totalDist);
            totalDist -= agil;

            // Destreza
            do {
                System.out.println("Pontos restantes: " + totalDist);
                System.out.print("Destreza (DEX, máximo 10): ");
                dext = sc.nextInt();
            } while (dext < 0 || dext > maxAtributo || dext > totalDist);
            totalDist -= dext;

            // Verifica se ainda sobraram pontos
            if (totalDist > 0) {
                System.out.println("\nVocê ainda tem " + totalDist + " pontos restantes!");
                System.out.println("Por favor redistribua seus pontos.\n");
                sc.nextLine(); // limpa o buffer antes de repetir o loop
            }

        } while (totalDist > 0); // repete se o jogador não gastar todos os pontos

        int strWpn = 0;
        int dextWpn = 0;
        int arm = 0;

        Player p1 = new Player(name, str, cnst, agil, dext, strWpn, dextWpn, arm);
        System.out.println("\nPersonagem criado com sucesso!\n");
        
        return p1;
    }
}

//Código corrigido com muito carinho no chat GPT, eu não  tenho paciência pra fazer debug de algo que nem eu sei onde dá erro