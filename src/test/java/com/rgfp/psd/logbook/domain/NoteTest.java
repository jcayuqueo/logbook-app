package com.rgfp.psd.logbook.domain;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class NoteTest {

    @Test
    public void pruebaMensajeLargoCorrecto(){

        Note myNote = new Note();
        myNote.setContent("Hola Mundo Joseghjkghjhhjg");

        String getSummary = myNote.getSummary();

        assertEquals(15, getSummary.length());
    }

    @Test
    public void pruebaMensajeLargoMenor(){

        Note myNote = new Note();
        myNote.setContent("Hola Mundo");
        String myMensaje = "Hola Mundo";

        String getSummary = myNote.getSummary();

        assertEquals(myMensaje, getSummary);
    }

    @Test
    public void pruebaClonarLineaMetodoDevuelveNull(){
        Note nota = new Note();
        nota.setTitle("Prueba");
        nota.setContent("Segundo texto");
        nota.setTimestamp(LocalDateTime.parse("2018-06-26T00:00"));

        Note notaNueva = nota.clone();

        assertEquals(nota.getTitle(), notaNueva.getTitle() );
        assertEquals(nota.getContent(), notaNueva.getContent() );
        assertNotEquals(nota.getTimestamp(), notaNueva.getTimestamp() );

    }

    @Test
    public void pruebaClonarLinea(){
        Note nota = new Note();

        Note notaNueva = nota.clone();

        assertEquals(nota.getTitle(), notaNueva.getTitle() );
        assertEquals(nota.getContent(), notaNueva.getContent() );
        assertNotEquals(nota.getTimestamp(), notaNueva.getTimestamp() );

    }

}