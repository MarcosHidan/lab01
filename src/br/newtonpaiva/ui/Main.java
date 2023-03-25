package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.*;

public class Main {
    public static void main(String[] args) {


        Pessoa pessoas[] = new Pessoa[4];
        pessoas[0] = new PessoaFisica();
        pessoas[1] = new PessoaJuridica();
        pessoas[2] = new PessoaJuridica();
        pessoas[3] = new PessoaFisica();


        for(int i = 0; i < pessoas.length; i ++)
            pessoas[i].validarDocumento();

        for(Pessoa p: pessoas)
            p.validarDocumento();



        Conta conta = new ContaPoupanca();
        conta.setNumero(11110009);
        conta.setSaldo(5000.0);

        Pessoa guilherme = new PessoaFisica();
        guilherme.setNome("Guilherme");
        guilherme.getContas().add(conta);


        //guilherme.setConta(conta);

        conta.setPessoa(guilherme);

        for(Conta c : guilherme.getContas())
            c.depositar(100.0);


        conta.getPessoa().getNome();



    }
}