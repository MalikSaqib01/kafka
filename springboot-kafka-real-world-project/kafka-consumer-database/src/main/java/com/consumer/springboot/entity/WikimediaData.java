package com.consumer.springboot.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "wikimedia")
@Getter
@Setter
public class WikimediaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String wikiEventData;

    public void setWikiEventData(String eventMessage) {
        this.wikiEventData = eventMessage;
    }
}
