public class App {
    public static void main(String[] args) {
        PessoaFisica j = new PessoaFisica("Davi", "Arrais", "000.000.032-22");
        System.out.println(j.toString());
        PessoaJuridica p = new PessoaJuridica("daniel", "643346364634", "Mundo das utilidades");
        System.out.println(p.toString());
    }
}
