package br.edu.fatecmm.projetobaralho;

import model.Baralho;

public class GerenciarJogo {
    Baralho baralho = new Baralho();
    public static void main(String[] args) {
        GerenciarJogo gj = new GerenciarJogo();
        gj.baralho.montar();
        gj.baralho.embaralhar();
        gj.baralho.exibir();
    }
}
