package com.study.relationship.controller.data;

import lombok.Data;

import java.util.List;

@Data
public class RelationshipResponse {

    private String customerId;

    private List<DetailResponse> details;
}
