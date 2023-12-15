package org.example.tutorial.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity  //pentru baza de date

public class Event extends AbstractEntity{
    @ManyToOne
    @NotNull(message = "Category is required")
    private EventCategory eventCategory;
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    @NotBlank(message = "Name is required")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)     //creaza o coloana
    @Valid
    @NotNull(message = "Event details are required")
    private EventDetails eventDetails;

    public Event(String name, EventCategory eventCategory) {
        this.name = name;

        this.eventCategory=eventCategory;


    }

    public EventDetails getEventDetails() {
        return eventDetails;
    }

    public void setEventDetails(EventDetails eventDetails) {
        this.eventDetails = eventDetails;
    }

    public Event(){
    }
    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public EventCategory getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(EventCategory eventCategory) {
        this.eventCategory = eventCategory;
    }

    @Override
    public String toString() {
        return name;
    }


}
