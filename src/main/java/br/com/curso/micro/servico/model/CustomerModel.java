package br.com.curso.micro.servico.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerModel {

    @Id
    @Column(name = "cpf")
    private Long cpf;

    @Column(name = "nome")
    private String name;

    @Column(name = "idade")
    private Integer age;
}
