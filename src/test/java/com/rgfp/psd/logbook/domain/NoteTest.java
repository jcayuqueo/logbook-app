package com.rgfp.psd.logbook.domain;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Date;

import static org.junit.Assert.assertEquals;

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

//    @Test
//    public void pruebaClonarLinea(){
//        Note myNote = new Note();
//
//        myNote.setId(8);
//        myNote.setTimestamp("2018-06-26");
//        myNote.setContent("Prueba Jose");
//        myNote.setTitle("Prueba");
//
//        assertEquals(, myNote );
//
//    }

}