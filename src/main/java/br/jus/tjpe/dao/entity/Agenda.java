package br.jus.tjpe.dao.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Entity
@Table(name = "agenda")
public class Agenda implements Serializable {

    private static final long serialVersionUID = 5832982737297532982L;

    
    @Id
    @GeneratedValue(generator = "gen_agenda", strategy=GenerationType.SEQUENCE) 
    @SequenceGenerator(name = "gen_agenda", sequenceName ="seq_agenda",  allocationSize = 1) 
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @OneToMany(mappedBy = "agenda", cascade = CascadeType.ALL, orphanRemoval = true) 
    private Set<Telefone> telefones;

}
