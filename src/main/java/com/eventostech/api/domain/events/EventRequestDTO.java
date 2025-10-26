package com.eventostech.api.domain.events;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public record EventRequestDTO(String title, String description, Long date, String city, String state, Boolean remote, String eventUrl, MultipartFile image) {
}
