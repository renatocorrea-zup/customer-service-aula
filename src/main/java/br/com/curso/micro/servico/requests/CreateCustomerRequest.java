package br.com.curso.micro.servico.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateCustomerRequest {
    @JsonProperty(value = "cpf")
    private Long cpf;

    @JsonProperty(value = "nome")
    private String name;

    @JsonProperty(value = "idade")
    private Integer age;
}
