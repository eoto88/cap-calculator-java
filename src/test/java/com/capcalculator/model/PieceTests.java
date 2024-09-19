package com.capcalculator.model;

import org.json.JSONObject;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PieceTests {
    @Test
    public void compare() {
        Piece piece = new Piece("Title", "Material", 12, 12, 0.5, 30,
                1.2, true, 1.2, true, 1.2,
                -20.0, 10.0, 200.00, 200.0);
        JSONObject json = piece.toJSON();
        String jsonString = json.toString();
        System.out.println(jsonString);
//        assertEquals(jsonString, "{\"clientName\":\"ClientName\",\"endDate\":\"Tue Sep 17 19:55:02 EDT 2024\",\"name\":\"Name\"}");
    }
}
