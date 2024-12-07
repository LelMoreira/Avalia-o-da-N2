import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PESSOA {
    private String nome;
    private int idade;
    private LocalDate dataNascimento;

    public PESSOA(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        this.dataNascimento = LocalDate.of(ano, mes, dia);
    }

    public void calculaIdade(LocalDate dataAtual) {
        this.idade = (int) ChronoUnit.YEARS.between(dataNascimento, dataAtual);
    }

    public int getIdade() { // Alterado para 'getIdade'
        return idade;
    }

    public String getNome() { // Alterado para 'getNome'
        return nome;
    }
}