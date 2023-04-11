package com.integration.application.controller;

import com.integration.application.model.dto.BatchDTO;
import com.integration.application.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class BatchController {

    @Autowired
    BatchService batchService;
    @PostMapping("/batch")
    public ResponseEntity<String> batch(@RequestBody BatchDTO[] batches) {
        return ResponseEntity.ok(batchService.processBatch(batches));
    }

}