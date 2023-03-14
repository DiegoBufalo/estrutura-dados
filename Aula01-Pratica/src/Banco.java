import java.util.List;
import java.util.Optional;

public class Banco {
    private List<Conta> contas;

    public Banco(List<Conta> contas) {
        this.contas = contas;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public Optional<Conta> getConta(String conta) {
        return contas.stream().filter(x -> x.getConta().equals(conta)).findFirst();
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }
}