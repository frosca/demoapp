/*
 * Classname : com.example.demoapp.repository.CustomerRepository
 *
 * Created on: 12 Feb 2021
 *
 * Copyright (c) 2000-2021 Global Payments, Ltd.
 * Global Payments, The Observatory, 7-11 Sir John Rogerson's Quay, Dublin 2, Ireland
 *
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * Global Payments, Ltd. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Global Payments.
 *
 */
package com.example.demoapp.repository;

import com.example.demoapp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
