public class Conta {
    private double saldo;
    private String senha;
    private String conta;

    public Conta(double saldo, String senha, String conta) {
        this.saldo = saldo;
        this.senha = senha;
        this.conta = conta;
    }

    public double depositar(double deposito) {
        return saldo += deposito;
    }

    public double sacar(double saque) {
        return saldo -= saque;
    }

    public boolean validarSenha(String senha) {
        return this.senha.equals(senha);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }
}
