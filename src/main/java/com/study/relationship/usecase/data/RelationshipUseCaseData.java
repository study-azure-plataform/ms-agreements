package com.study.relationship.usecase.data;

import lombok.Data;

import java.util.List;

@Data
public class RelationshipUseCaseData {

    private String customerId;

    private List<DetailUseCaseData> details;
}
