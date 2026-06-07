package com.algaworks.algadelivery.delivery.tracking.domain.service;

import com.algaworks.algadelivery.delivery.tracking.domain.model.ContactPoint;

public interface DeliveryTImeEstimationService {
    DeliveryEstimate estimate(ContactPoint sender, ContactPoint receiver);
}
