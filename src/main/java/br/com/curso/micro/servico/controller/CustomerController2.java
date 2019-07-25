package br.com.curso.micro.servico.controller;

import br.com.curso.micro.servico.model.CustomerModel;
import br.com.curso.micro.servico.repository.CustomerRepository;
import br.com.curso.micro.servico.requests.CreateCustomerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("customer")
public class CustomerController2 {

    @Autowired
    private CustomerRepository customerRepository;

    // http://localhost:8080/customer/create
    @PostMapping("create")
    @ResponseStatus(HttpStatus.CREATED)
    public String helloWorld(@RequestBody CreateCustomerRequest request){
        System.out.println("Nome: " + request.getName());
        System.out.println("Idade: " + request.getAge());

        CustomerModel customerModel = CustomerModel.builder().cpf(request.getCpf())
                .name(request.getName()).age(request.getAge()).build();

        customerRepository.save(customerModel);
        return "funcionou";
    }
}
