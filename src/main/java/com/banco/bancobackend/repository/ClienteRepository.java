package com.banco.bancobackend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banco.bancobackend.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	public Optional<Cliente> findFirstByCorreo(String correo);

	public Optional<Cliente> findFirstByCorreoAndPassword(String correo, String password);

}
