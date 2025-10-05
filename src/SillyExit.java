import java.util.Random;
public class SillyExit {
    public void Silly(){
        Random exitSign = new Random();
        int sign = exitSign.nextInt(11) + 1;

        if(sign == 1){
            System.out.println("Eu nunca joguei um Final Fantasy...");
        }
        else if(sign == 2){
            System.out.println("'J' em 'JRPG' não quer dizer Java");
        }
        else if(sign == 3) {
            System.out.println("O que você vai fazer hoje? Não me diga que você vai programar :)");
        }
        else if(sign == 4){
            System.out.println("O CESUPA arruinou minha vida :(");
        }
        else if(sign == 5){
            System.out.println("Castlevania, Sanfona do Kwait");
        }
        else if(sign == 6){
            System.out.println("Eu particularmente prefiro C");
        }
        else if(sign == 7){
            System.out.println("Nenhuma JVM foi prejudicada no desenvolvimento deste jogo");
        }
        else if(sign == 8){
            System.out.println("Java??? I hardly know her!");
        }
        else if(sign == 9){
            System.out.println("Eu não pude escolher entre cálculo e programação, e acabei me ferrando nas duas...");
        }
        else if(sign == 10){
            System.out.println("Alguém realmente lê essas mensagens?");
        }
    }
}
