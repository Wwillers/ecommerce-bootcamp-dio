package com.hatanaka.ecommerce.payment.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String code;

    @Column
    private String checkoutCode;

    @CreatedDate
    private LocalDateTime createdAt;

    @CreatedDate
    private LocalDateTime updatedAt;
}
