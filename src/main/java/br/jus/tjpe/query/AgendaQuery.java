package br.jus.tjpe.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.jus.tjpe.dao.entity.Agenda;
import br.jus.tjpe.service.AgendaService;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;


@Component
public class AgendaQuery implements GraphQLQueryResolver {

    @Autowired
    private AgendaService agendaService;

    @Transactional
    public Optional<Agenda> getAgenda(final Long id) {
        return this.agendaService.getAgenda(id);
    }
}
