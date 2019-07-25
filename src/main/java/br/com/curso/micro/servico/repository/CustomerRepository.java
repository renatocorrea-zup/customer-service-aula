package br.com.curso.micro.servico.repository;

import br.com.curso.micro.servico.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public interface CustomerRepository extends JpaRepository<CustomerModel, Long> {
}
