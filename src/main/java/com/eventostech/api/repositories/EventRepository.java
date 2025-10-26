package com.eventostech.api.repositories;

import com.eventostech.api.domain.events.Events;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Events, UUID> {



}
