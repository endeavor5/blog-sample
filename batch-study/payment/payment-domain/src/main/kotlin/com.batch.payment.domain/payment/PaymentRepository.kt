package com.batch.payment.domain.payment

import org.springframework.data.jpa.repository.JpaRepository

interface PaymentRepository : JpaRepository<Payment, Long>{
    fun findByOrderId(orderId: Long): List<Payment>
}