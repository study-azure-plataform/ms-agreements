package com.study.relationship.gateway.db.impl;

import com.study.relationship.gateway.IRelationshipGateway;
import com.study.relationship.gateway.db.repository.IRelationshipRepository;
import com.study.relationship.usecase.data.RelationshipUseCaseData;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class RelationshipGatewayImpl implements IRelationshipGateway {

    private final ModelMapper modelMapper;

    private final IRelationshipRepository repository;

    @Override
    public Optional<RelationshipUseCaseData> findByCustomerId(String customerId) {

        return repository.findByCustomerId(customerId)
                .map(s -> modelMapper.map(s, RelationshipUseCaseData.class));

    }
}
