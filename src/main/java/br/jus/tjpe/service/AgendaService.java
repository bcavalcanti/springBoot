package br.jus.tjpe.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.jus.tjpe.dao.entity.Agenda;
import br.jus.tjpe.dao.repositorio.AgendaRepo;

@Service
public class AgendaService {

    private final AgendaRepo agendaRepo;

    public AgendaService(final AgendaRepo agendaRepo) {
        this.agendaRepo = agendaRepo ;
    }

    @Transactional(readOnly = true)
    public Optional<Agenda> getAgenda(final Long id) {
        return this.agendaRepo.findById(id);
    }
}
