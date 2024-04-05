package br.com.fiap.jpa.entity;

import jakarta.persistence.*;

@Entity
@Table(name="TDS_TB_INVESTIMENTO")
@SequenceGenerator(name="invs", sequenceName = "SQ_TDS_TB_INVESTIMENTO", allocationSize = 50)
public class Investimento {
    @Id
    @Column()
    private Integer codigo;

    private String
}
