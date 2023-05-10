public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoLançamento = 1989;
        meuFilme.duracaoMin = 180;

        System.out.println(meuFilme.nome);

    }
}