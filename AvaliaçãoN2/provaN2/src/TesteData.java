public class TesteData {
    public static void main(String[] args) {
        DATA data = new DATA(12, 10, 2023);
        System.out.println("Data inicial: " + data.toString());

        data.avancarDias(10);
        System.out.println("Após avançar 10 dias: " + data.toString());

        data.retrocederDias(20);
        System.out.println("Após retroceder 20 dias: " + data.toString());
    }
}