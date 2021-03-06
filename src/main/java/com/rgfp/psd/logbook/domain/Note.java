package com.rgfp.psd.logbook.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.DateTimeException;
import java.time.LocalDateTime;

@Entity
@Table(name = "notes")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private LocalDateTime timestamp;
    @Column(length=10000)
    private String content;

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSummary() {

      try{
          if (content.length() > 15) {
              return  content.substring(0, 15);
          }else {
              return content;
          }
      }catch(Exception e){
          System.err.println("Error al cortar el texto, "+e.getMessage());
          return "";
      }

    }

    public Note clone() {
        Note nota = new Note();

        nota.setTitle(this.title);
        nota.setContent(this.content);
        nota.setTimestamp(LocalDateTime.now());

        return nota;
    }
}
