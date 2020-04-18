package com.dmrtech.calendarapp.repository;


import com.dmrtech.calendarapp.model.CalendarEvent;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CalendarEventRepository extends PagingAndSortingRepository<CalendarEvent, Long> {

}