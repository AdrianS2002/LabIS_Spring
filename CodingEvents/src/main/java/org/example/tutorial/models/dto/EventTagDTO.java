package org.example.tutorial.models.dto;

import jakarta.validation.constraints.NotNull;
import org.example.tutorial.models.Event;
import org.example.tutorial.models.EventDetails;
import org.example.tutorial.models.Tag;

//dto=data transfer object
public class EventTagDTO {
    @NotNull
    private Event event;
    @NotNull
    private Tag tag;

    public EventTagDTO() {
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}
