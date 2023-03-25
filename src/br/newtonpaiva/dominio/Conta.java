package br.newtonpaiva.dominio;

import java.util.Objects;

public class Conta {

    private Integer numero;
    private Double saldo;

    private Pessoa pessoa;

    public Conta() {
        this(null);
    }

    public Conta(Integer numero) {
        this(numero, 0.0);
    }

    public Conta(Integer numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Double sacar(Double valor) {
        return 0.0;
    }

    public Double depositar(Double valor) {
        if(valor == null || valor <= 0 )
            throw new IllegalArgumentException("Valor menor ou");

        saldo += valor;
        return saldo;
    }

    public void transferir(Conta destino, Double valor) {
        if(this.getSaldo() < valor)
            throw new IllegalArgumentException("");

        if(this.equals(destino))
            throw new IllegalArgumentException("");


        this.sacar(valor);
        destino.depositar(valor);
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return Objects.equals(numero, conta.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}