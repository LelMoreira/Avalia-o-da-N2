public class PrincipalUni {
    public static void main(String[] args) {
        PESSOA einstein = new PESSOA("Albert Einstein", 14, 3, 1879);
        PESSOA newton = new PESSOA("Isaac Newton", 4, 1, 1643);

        Universidade princeton = new Universidade("Princeton");
        Universidade cambridge = new Universidade("Cambridge");

        System.out.println(einstein.getNome() + " lecionou na " + princeton.getNome());
        System.out.println(newton.getNome() + " foi professor na " + cambridge.getNome());
    }
}