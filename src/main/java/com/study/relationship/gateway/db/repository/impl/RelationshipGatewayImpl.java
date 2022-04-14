package com.study.relationship.gateway.db.repository.impl;

import com.study.relationship.gateway.IRelationshipGateway;
import com.study.relationship.gateway.db.entity.RelationshipEntity;
import com.study.relationship.gateway.db.repository.IRelationshipRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class RelationshipGatewayImpl implements IRelationshipGateway {

    private final IRelationshipRepository repository;

    @Override
    public Optional findByCustomerId(String customerId) {

        RelationshipEntity customer = repository.findByCustomerId(customerId);

        return Optional.empty();
    }
}
