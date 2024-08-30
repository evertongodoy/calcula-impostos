package br.senac.sp.impostos.application.usecase.impl;

import br.senac.sp.impostos.application.dto.ImpostosRequest;
import br.senac.sp.impostos.application.usecase.CalcularImpostosUseCase;
import br.senac.sp.impostos.domain.entity.ImpostoEntity;
import org.springframework.stereotype.Service;

@Service
public class CalcularImpostosUseCaseImpl implements CalcularImpostosUseCase {

    @Override
    public Double calcularImpostos(ImpostosRequest request) {
        if (request.getSalarioBruto() > 2112.00 && request.getSalarioBruto() <= 2826.66) {
            return new ImpostoEntity(request.getSalarioBruto(), 7.50)
                    .calcularImpostoDevido();
        } else if (request.getSalarioBruto() > 2826.66  && request.getSalarioBruto() <= 3751.06) {
            return new ImpostoEntity(request.getSalarioBruto(), 75.0)
                    .calcularImpostoDevido();
        } else if (request.getSalarioBruto() > 3751.06 && request.getSalarioBruto() <= 4664.68) {
            return new ImpostoEntity(request.getSalarioBruto(), 90.5)
                    .calcularImpostoDevido();
        } else if (request.getSalarioBruto() > 4664.68) {
            return new ImpostoEntity(request.getSalarioBruto(), 56.5)
                    .calcularImpostoDevido();
        } else if (request.getSalarioBruto() < 0.0) {
            return new ImpostoEntity(request.getSalarioBruto(), 100.0)
                    .calcularImpostoDevido();
        } else {
            return 0.0;
        }
    }

}