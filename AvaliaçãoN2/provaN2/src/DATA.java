import java.time.LocalDate;

public class DATA {
    private int dia;
    private int mes;
    private int ano;

    public DATA(int dia, int mes, int ano) {
        if (!isDataValida(dia, mes, ano)) {
            throw new IllegalArgumentException("Data inválida!");
        }
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public DATA() {
        LocalDate dataAtual = LocalDate.now();
        this.dia = dataAtual.getDayOfMonth();
        this.mes = dataAtual.getMonthValue();
        this.ano = dataAtual.getYear();
    }

    private boolean isDataValida(int dia, int mes, int ano) {
        return LocalDate.of(ano, mes, dia) != null;
    }

    public int getDia() { return dia; }
    public void setDia(int dia) { this.dia = dia; }

    public int getMes() { return mes; }
    public void setMes(int mes) { this.mes = mes; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    public void avancarDias(int quantidade) {
        atualizarData(LocalDate.of(ano, mes, dia).plusDays(quantidade));
    }

    public void retrocederDias(int quantidade) {
        atualizarData(LocalDate.of(ano, mes, dia).minusDays(quantidade));
    }

    private void atualizarData(LocalDate data) {
        this.dia = data.getDayOfMonth();
        this.mes = data.getMonthValue();
        this.ano = data.getYear();
    }
}