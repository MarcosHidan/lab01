package br.newtonpaiva.dominio;

import java.util.Objects;

public class PessoaJuridica extends Pessoa{
    private String cpnj;

    public String getCpnj() {
        return cpnj;
    }

    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaJuridica that = (PessoaJuridica) o;
        return Objects.equals(cpnj, that.cpnj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpnj);
    }

    @Override
    public void validarDocumento() {
        System.out.println("Validando CNPJ");
    }
}