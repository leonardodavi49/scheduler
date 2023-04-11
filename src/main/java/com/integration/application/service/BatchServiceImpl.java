package com.integration.application.service;

import com.integration.application.mailer.EmailService;
import com.integration.application.model.dto.BatchDTO;
import com.integration.application.repository.BatchRepository;
import com.integration.application.utils.BatchesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BatchServiceImpl implements BatchService {

    @Autowired
    public BatchRepository batchRepository;

    @Autowired
    private EmailService emailService;

    public final BatchesMapper mapper = new BatchesMapper();

    @Override
    public String processBatch(BatchDTO[] batches) {

        BatchProcessor processor = batch -> {
            String response = "";

            if (batch.getBatchid() != null || batch.getBatchTypeId() != null || batch.getBatchTypeDescription() != null
                    || batch.getBatchExpirationDate() != null || batch.getBatchCount() != 0) {
                response = mapper.toDto(batchRepository.save(mapper.toEntity(batch))).getBatchid();
            }
            return response;
        };

        List<String> responses = Arrays.stream(batches)
                .map(processor::process)
                .toList();

        
        
        emailService.sendEmail("contacts@mail.com",
                "New Batches has been created",
                "The batches "+responses.toString()+" has been created.");

        return "Total of " + responses.size() + " been successfully processed.";
    }

    @FunctionalInterface
    interface BatchProcessor {
        String process(BatchDTO batch);
    }
}
