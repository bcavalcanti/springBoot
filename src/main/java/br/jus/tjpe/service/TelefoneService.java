package br.jus.tjpe.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.jus.tjpe.dao.entity.Telefone;
import br.jus.tjpe.dao.repositorio.TelefoneRepo;



@Service
public class TelefoneService {

    private final TelefoneRepo telefoneRepo;

    public TelefoneService(final TelefoneRepo telefoneRepo) {
        this.telefoneRepo = telefoneRepo ;
    }

    @Transactional(readOnly = true)
    public Optional<Telefone> getTelefone(final Long id) {
        return this.telefoneRepo.findById(id);
    }
}
