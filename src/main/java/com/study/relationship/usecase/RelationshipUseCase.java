package com.study.relationship.usecase;

import com.study.relationship.controller.data.RelationshipResponse;
import com.study.relationship.gateway.IRelationshipGateway;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
@RequiredArgsConstructor
public class RelationshipUseCase {

    private final IRelationshipGateway gateway;

    private final ModelMapper modelMapper;

    public Optional<RelationshipResponse> findByRelationship(String customerId) {

        return gateway.findByCustomerId(customerId)
                .map(s -> modelMapper.map(s, RelationshipResponse.class));
    }
}
