package com.study.relationship.gateway.db.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DetailEntity {

    private String product;

    private LocalDateTime updatedAt;

}
