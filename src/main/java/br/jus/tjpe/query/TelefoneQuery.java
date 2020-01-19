package br.jus.tjpe.query;

import java.util.Optional;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.jus.tjpe.dao.entity.Telefone;
import br.jus.tjpe.service.TelefoneService;

@Component
public class TelefoneQuery implements GraphQLQueryResolver {

    @Autowired
    private TelefoneService telefoneService;

    public Optional<Telefone> getTelefone(final Long id) {
        return this.telefoneService.getTelefone(id);
    }
}
