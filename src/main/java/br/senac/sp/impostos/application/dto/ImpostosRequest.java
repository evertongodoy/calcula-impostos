package br.senac.sp.impostos.application.dto;

import java.util.Objects;

public class ImpostosRequest {

    private Double salarioBruto;

    public ImpostosRequest(final Double salarioBruto){
        this.salarioBruto = salarioBruto;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public ImpostosRequest setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImpostosRequest that = (ImpostosRequest) o;
        return Objects.equals(salarioBruto, that.salarioBruto);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(salarioBruto);
    }

}