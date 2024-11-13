package com.Domain.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptedCustomerEntity extends JpaRepository<Models.SubscriptedCustomer, Long> {
}
