import java.time.LocalDate;

public class PRINCIPAL {
    public static void main(String[] args) {
        PESSOA einstein = new PESSOA("Albert Einstein", 14, 3, 1879);
        PESSOA newton = new PESSOA("Isaac Newton", 4, 1, 1643);

        LocalDate dataAtual = LocalDate.now();

        einstein.calculaIdade(dataAtual);
        newton.calculaIdade(dataAtual);

        System.out.println(einstein.getNome() + " teria " + einstein.getIdade() + " anos hoje.");
        System.out.println(newton.getNome() + " teria " + newton.getIdade() + " anos hoje.");
    }
}
