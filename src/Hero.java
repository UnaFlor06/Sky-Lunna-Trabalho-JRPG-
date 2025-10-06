public class Hero {
    //Status Básicos
    String name;

    //Atributos
    int str;
    int cnst;
    int agil;
    int dext;

    //Equipamento
    String wpnName;
    String armName;
    int strWpn;
    int dextWpn;
    int arm;
    

    //Status derivados
    int HP;
    int DT;
    int strWpnDam;
    int dextWpnDam;


    //Construtor de personagem
    public Hero(String name, int str, int cnst, int agil, int dext, int strWpn, int dextWpn, int arm ){
        this.name = name;
        this.str = str;
        this.cnst = cnst;
        this.agil = agil;
        this.dext = dext;
        this.strWpn = strWpn;
        this.dextWpn = dextWpn;
        this.arm = arm;
        //Equações
        this.HP = 10 + this.cnst;
        this.DT = this.arm;
        this.strWpnDam = this.str + this.strWpn;
        this.dextWpnDam = this.dext + this.dextWpn;
    }

    public void heroStatus(){
        System.out.println("===== Status do Herói =====");
        System.out.println("Nome: " + this.name);
        System.out.println("Dano de força total: " + this.strWpnDam);
        System.out.println("Dano de destreza total: " + this.dextWpnDam);
        System.out.println("HP: " + this.HP);
        System.out.println("DT: "+ this.DT);
    }
}