package br.newtonpaiva.dominio;

import java.util.Objects;

public class Conta {

    private Integer numero;
    private Double saldo;

    public Conta() {
        this( null);
    }

    public Conta(Integer numero) {
        this(numero, 0.0);
    }

    public Conta(Integer numero, Double saldo) {

    }

    public Double sacar(Double valor) {
        if(valor == null || valor <= 0 )
            throw new IllegalAccessException("Valor menor");

        saldo += valor;
        return saldo;
    }

    public Double depositar(Double valor) {
        return 0.0;
    }

    public Integer getNumero () {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return Objects.equals(numero, conta.numero);
    }
//
    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}


}
