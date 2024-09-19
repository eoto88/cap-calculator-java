package com.capcalculator.model;

import java.util.Date;

import org.json.JSONObject;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProjectTests {

    @Test
    public void compare() {
        long millis = 1726617302431L;
        Project project = new Project("Name", "ClientName", new Date(millis), new Piece[]{}, 0.5f,
                0.5f, 0.1f);
        JSONObject json = project.toJSON();
        String jsonString = json.toString();
//        assertEquals(jsonString,
//                "{\"clientName\":\"ClientName\",\"endDate\":\"Tue Sep 17 19:55:02 EDT 2024\",\"name\":\"Name\"}");
    }
}
