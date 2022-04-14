package com.study.relationship.gateway;

import java.util.Optional;

public interface IRelationshipGateway <IN, OUT> {

    Optional<OUT> findByCustomerId(String customerId);

}
