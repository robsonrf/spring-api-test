package com.spring.test.wine.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@Table(name = "wine_store")
public class WineStore extends ModelBase {

    // Esse mapeamento pode ser melhorado:
    // Criar outra entidade chamada Wine e colocar o campo code nela
    // Aqui nessa entidade relacionar ambas entidades (wine 1 ... * wine_store)

    @Size(max = 30, message = "The CODIGO_LOJA field can not be greater than 30")
    @NotNull(message = "The CODIGO_LOJA field can not be empty")
    @NotEmpty(message = "The CODIGO_LOJA field can not be empty")
    @Column(name = "tx_code", nullable = false, length = 30)
    private String code;

    @NotNull(message = "The FAIXA_INICIO field can not be empty")
    @Column(name = "nb_start_range", nullable = false)
    private Integer startRange;

    @NotNull(message = "The FAIXA_FIM field can not be empty")
    @Column(name = "nb_end_range", nullable = false)
    private Integer endRange;

}
