public class Sistema {

    // Nota mínima para aprovação
    private static final double NOTA_MINIMA_APROVACAO = 6.0;

    public static void main(String[] args) {
        String nomeAluno = "Carlos";
        double primeiraNota = 8.0;
        double segundaNota = 7.0;

        double media = calcularMedia(primeiraNota, segundaNota);
        String situacao = verificarSituacao(media);

        exibirResultados(nomeAluno, media, situacao);
    }

    // Calcula a média das notas
    public static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2.0;
    }

    // Verifica a situação do aluno (Aprovado ou Reprovado)
    public static String verificarSituacao(double media) {
        return media >= NOTA_MINIMA_APROVACAO ? "Aprovado" : "Reprovado";
    }

    // Apresenta os resultados no console
    public static void exibirResultados(String nomeAluno, double media, String situacao) {
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Media: " + media);
        System.out.println(situacao);
    }
}
