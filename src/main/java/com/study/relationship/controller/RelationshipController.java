package com.study.relationship.controller;

import com.study.relationship.controller.data.RelationshipResponse;
import com.study.relationship.usecase.RelationshipUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/v1/relationship", produces = MediaType.APPLICATION_JSON_VALUE)
public class RelationshipController {

    private final RelationshipUseCase useCase;

    @GetMapping("/customerId/{customerId}")
    public ResponseEntity<RelationshipResponse> findByCustomerId(@PathVariable String customerId){
        return ResponseEntity.ok(useCase.findByRelationship(customerId));
    }
}
