package com.dmrtech.calendarapp.repository;

import com.dmrtech.calendarapp.model.CalendarEvent;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;

/*
Configure the rest repository to include the IDs of the calendar events.
 */
@Component
public class RestRepositoryConfigurator implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(CalendarEvent.class);
    }
}