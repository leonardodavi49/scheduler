package com.integration.application.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "batch")
@Data
public class BatchEntity {
    @Id
    @Column(name = "batch_id")
    private String batchid;

    @Column(name = "batch_name")
    private String batchTypeDescription;

    @Column(name = "batch_type")
    private String batchTypeId;

    @Column(name = "expiration_date")
    private LocalDate expirationDate;

    @Column(name = "batch_count")
    private int batchCount;
}
