package com.integration.application.service;

import com.integration.application.model.dto.BatchDTO;

public interface BatchService {
    String processBatch(BatchDTO[] batches);
}
