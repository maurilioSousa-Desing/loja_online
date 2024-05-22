package br.com.api.backend.modelo;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;




@Data
@Entity
@Table(name = "estado")

public class Estado {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String sigla;

    @Temporal(TemporalType.TIMESTAMP)
    private Date   dataCriacao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date   dataAtualizacao;

    


}
