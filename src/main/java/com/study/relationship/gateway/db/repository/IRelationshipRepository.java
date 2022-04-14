package com.study.relationship.gateway.db.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.study.relationship.gateway.db.entity.RelationshipEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRelationshipRepository extends CosmosRepository<RelationshipEntity, String> {

    Optional<RelationshipEntity> findByCustomerId(String customerId);
}
