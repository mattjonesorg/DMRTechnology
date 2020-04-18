package com.dmrtech.calendarapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class CalendarEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Date eventDate;
    private boolean allDayEvent;
    private String title;
    private String details;

    public CalendarEvent(Date eventDate, boolean allDayEvent, String title, String details) {
        this.eventDate = eventDate;
        this.allDayEvent = allDayEvent;
        this.title = title;
        this.details = details;
    }

    public CalendarEvent() {

    }

    public long getID() {
        return id;
    }
    public void setId(Long id) { this.id = id; }


    public Date getDate() {
        return eventDate;
    }

    public void setDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public boolean isAllDayEvent() {
        return allDayEvent;
    }

    public void setAllDayEvent(boolean allDayEvent) {
        this.allDayEvent = allDayEvent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

}
