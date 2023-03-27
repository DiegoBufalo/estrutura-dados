public class Personagem {
    // atributos
    private String nome;
    private int idade;
    private String sexo;
    private int life;

    // variáveis

    public int getLife() {
        return this.life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Personagem(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.life = idade < 18 ? 100 : 75;
    }

    public void Andar(int direcao) {
        if (direcao > 0) {
            System.out.println("Andando para Direita ------>");
        } else if (direcao < 0) {
            System.out.println(" <------ Andando para Esquerda");
        } else {
            System.out.println(" ---- Personagem Parado ----");
        }

    }

    public void retirarVida() {
        this.life -= 10;
    }

    public boolean estaVivo() {
        return this.life > 0;
    }

}
