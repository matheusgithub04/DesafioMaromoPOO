package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas = new ArrayList<>();
    Carta c;
    public Baralho(){}
    public void montar(){
        for (int i = 0; i < 4; i++) {
            c = new Carta();
            for (int j = 0; j < 13; j++) {
                if(i == 0){c.setNaipe(Naipe.OURO);}
                if(i == 1){c.setNaipe(Naipe.ESPADAS);}
                if(i == 2){c.setNaipe(Naipe.COPAS);}
                if(i == 3){c.setNaipe(Naipe.PAUS);}
                if(j == 0){c.setValor(Valor.As); cartas.add(c);}
                if(j == 1){c.setValor(Valor.Dois); cartas.add(c);}
                if(j == 2){c.setValor(Valor.Três); cartas.add(c);}
                if(j == 3){c.setValor(Valor.Quatro); cartas.add(c);}
                if(j == 4){c.setValor(Valor.Cinco); cartas.add(c);}
                if(j == 5){c.setValor(Valor.Seis); cartas.add(c);}
                if(j == 6){c.setValor(Valor.Sete); cartas.add(c);}
                if(j == 7){c.setValor(Valor.Oito); cartas.add(c);}
                if(j == 8){c.setValor(Valor.Nove); cartas.add(c);}
                if(j == 9){c.setValor(Valor.Dez); cartas.add(c);}
                if(j == 10){c.setValor(Valor.Dama); cartas.add(c);}
                if(j == 11){c.setValor(Valor.Valete); cartas.add(c);}
                if(j == 12){c.setValor(Valor.Reis); cartas.add(c);}
                c = new Carta();
            }
        }
    }
    public void embaralhar(){
        Collections.shuffle(cartas);
    }
    public void exibir(){
        for (Carta ca: cartas) {
            System.out.println("Carta: " + ca.getNaipe() + ", valor: " + ca.getValor());
        }
        System.out.println("--------------------");
        for (Carta ca: cartas) {
            System.out.println(ca.toString());
        }
    }
}
