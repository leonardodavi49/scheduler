package com.integration.application.utils;

import com.integration.application.model.dto.BatchDTO;
import com.integration.application.model.BatchEntity;

public class BatchesMapper {
    public BatchDTO toDto(BatchEntity batch) {
        BatchDTO batchDTO = new BatchDTO();
        batchDTO.setBatchid(batch.getBatchid());
        batchDTO.setBatchTypeId(batch.getBatchTypeId());
        batchDTO.setBatchTypeDescription(batch.getBatchTypeDescription());
        batchDTO.setBatchExpirationDate(batch.getExpirationDate());
        batchDTO.setBatchCount(batch.getBatchCount());
        return batchDTO;
    }

    public BatchEntity toEntity(BatchDTO batchDTO) {
        BatchEntity batchEntity = new BatchEntity();
        batchEntity.setBatchid(batchDTO.getBatchid());
        batchEntity.setBatchTypeDescription(batchDTO.getBatchTypeDescription());
        batchEntity.setBatchTypeId(batchDTO.getBatchTypeId());
        batchEntity.setExpirationDate(batchDTO.getBatchExpirationDate());
        batchEntity.setBatchCount(batchDTO.getBatchCount());
        return batchEntity;
    }
}
