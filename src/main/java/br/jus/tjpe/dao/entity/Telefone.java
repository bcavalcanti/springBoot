package br.jus.tjpe.dao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Entity
@Table(name = "telefone")
public class Telefone implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(generator = "gen_telefone", strategy=GenerationType.SEQUENCE) 
    @SequenceGenerator(name = "gen_telefone", sequenceName ="seq_telefone",  allocationSize = 1) 
    private Long id;

    @ManyToOne 
    @JoinColumn(name = "id_agenda") 
    private Agenda agenda;

    @Column(name = "telefone")
    private String telefone;
    
    @Column(name = "tags")
    private String tags;
    
}