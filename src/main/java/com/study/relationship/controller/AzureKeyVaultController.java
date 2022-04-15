package com.study.relationship.controller;

import com.study.relationship.controller.data.RelationshipResponse;
import com.study.relationship.usecase.RelationshipUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@Log
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/v1/relationship", produces = MediaType.APPLICATION_JSON_VALUE)
public class AzureKeyVaultController {

    @Value("${AZ-COSMOS-URI--ms-relationship}")
    private String cosmosUri;

    @Value("${AZ-COSMOS-KEY--ms-relationship}")
    private String cosmosKey;

    @Value("${AZ-COSMOS-DB-NAME--ms-relationship}")
    private String cosmosDB;

    @GetMapping("/kv")
    public ResponseEntity<String> getKV(){
        StringBuilder builder = new StringBuilder();
        builder.append("AZ-COSMOS-URI--ms-relationship: " + cosmosUri + System.lineSeparator())
                .append("AZ-COSMOS-KEY--ms-relationship: " + cosmosKey + System.lineSeparator())
                .append("AZ-COSMOS-DB-NAME--ms-relationship: " +cosmosDB + System.lineSeparator());
        log.info(builder.toString());
        return ResponseEntity.ok(builder.toString());
    }
}

