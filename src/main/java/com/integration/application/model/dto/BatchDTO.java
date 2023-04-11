package com.integration.application.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BatchDTO {
    private String batchid;
    private String batchTypeId;
    private String batchTypeDescription;
    private int batchCount;
    private LocalDate batchExpirationDate;
}