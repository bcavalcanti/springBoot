package br.jus.tjpe.dao.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.jus.tjpe.dao.entity.Telefone;

@Repository
public interface TelefoneRepo extends JpaRepository<Telefone, Long> {

}