package org.example.tutorial.data;

import org.example.tutorial.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {

    //need a place to put events
    private static final Map<Integer, Event> events = new HashMap<>();

    //get all events
    public static Collection<Event>getAll(){
        return events.values();
    }

    //get a single event. Toate medodele sunt statice pt ca nu vrem instante de un obiect ci o colectie ce poate fi folosita
    public static Event getById(int id){
        return events.get(id);
    }

    //add an event
    public static void add(Event event){
        events.put(event.getId(),event);
    }

    //remove an event

    public static void remove(int id){
        events.remove(id);
    }
}
