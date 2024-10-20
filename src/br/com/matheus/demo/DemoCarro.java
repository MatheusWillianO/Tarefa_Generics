package br.com.matheus.demo;

import br.com.matheus.domain.*;

import java.util.ArrayList;
import java.util.List;

public class DemoCarro {
    public static void main(String[] args) {
        List<Carro> listCarro = new ArrayList<>();
        listCarro.add(new Chevete());
        listCarro.add(new Sonata());
        listCarro.add(new GolBola());
        listCarro.add(new Civic());
        imprime(listCarro);
    }

    private static void imprime(List<? extends Carro> listCarro) {
        for (Carro carro : listCarro) {
            System.out.println(carro);
        }
    }
}
