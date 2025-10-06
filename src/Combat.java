public class Combat {
    private int calcularDano(int ataque, int defesa) {
        int dano = ataque - defesa;
        return Math.max(1, dano); // Garante que o dano mínimo é 1
    }
}
