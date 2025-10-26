package com.eventostech.api.service;

import com.eventostech.api.domain.events.EventRequestDTO;
import com.eventostech.api.domain.events.Events;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Service
public class EventService {
    public Events createEvent(EventRequestDTO data){
        String imgUrl = null;

        if(data.image() != null){
            imgUrl = this.uploadImg(data.image());
        }

        Events newEvents = new Events();
        newEvents.setTitle(data.title());
        newEvents.setDescription(data.description());
        newEvents.setEventUrl(data.eventUrl());
        newEvents.setDate(new Date(data.date()));
        newEvents.setImgUrl(imgUrl);

        return newEvents;
    }

    private String uploadImg(MultipartFile multipartFile){
        return "";
    }
}
