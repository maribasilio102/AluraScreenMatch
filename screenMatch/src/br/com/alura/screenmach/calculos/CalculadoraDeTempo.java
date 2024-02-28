package br.com.alura.screenmach.calculos;

import br.com.alura.screenmach.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração de miutos de " +titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
