public class Filme {
    String nome;
    int anoLancamento;
    boolean incluidoPlano;
    double somaDasAvaliacoes;
    int totalAvaliacoes;
    int duracaoMinutos;

    void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " +nome);
        System.out.println("Ano de lançamento: " +anoLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double obterMedia(){
        return somaDasAvaliacoes/totalAvaliacoes;
    }
}
