package br.newtonpaiva.dominio;

public class Conta {

    private Integer numero;
    private Double saldo;
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

    public void setNumero(Integer numero) {
        this.numero = numero;

    }


}
