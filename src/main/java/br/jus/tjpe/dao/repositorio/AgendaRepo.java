package br.jus.tjpe.dao.repositorio;

import br.jus.tjpe.dao.entity.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaRepo extends JpaRepository<Agenda, Long> {

}