package com.study.relationship.usecase;

import com.study.relationship.controller.data.RelationshipResponse;
import com.study.relationship.gateway.IRelationshipGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class RelationshipUseCase {

    private final IRelationshipGateway gateway;

    public RelationshipResponse findByRelationship(String customerId) {

        gateway.findByCustomerId(customerId);

        return null;
    }
}
