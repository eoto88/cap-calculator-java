package com.capcalculator.model;

import java.util.Date;
import org.json.JSONObject;

public class Project {
    private String title;
    private String client;
    private Date deadline;
    private Piece[] pieces;
    private float cncPrice;
    private float sandingPrice;
    private float paintPrice;

    public Project(String title, String client, Date deadline, Piece[] pieces, float cncPrice, float sandingPrice, float paintPrice) {
        this.title = title;
        this.client = client;
        this.deadline = deadline;
        this.pieces = pieces;
        this.cncPrice = cncPrice;
        this.sandingPrice = sandingPrice;
        this.paintPrice = paintPrice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Piece[] getPieces() {
        return pieces;
    }

    public void setPieces(Piece[] pieces) {
        this.pieces = pieces;
    }

    public float getCncPrice() {
        return cncPrice;
    }

    public void setCncPrice(float cncPrice) {
        this.cncPrice = cncPrice;
    }

    public float getSandingPrice() {
        return sandingPrice;
    }

    public void setSandingPrice(float sandingPrice) {
        this.sandingPrice = sandingPrice;
    }

    public float getPaintPrice() {
        return paintPrice;
    }

    public void setPaintPrice(float paintPrice) {
        this.paintPrice = paintPrice;
    }

    public JSONObject toJSON() {
        JSONObject jo = new JSONObject();
        jo.put("title", getTitle());
        jo.put("clientName", getClient());
        jo.put("endDate", getDeadline().toString());

        return jo;
    }
}
