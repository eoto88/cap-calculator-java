package com.capcalculator.model;

import org.json.JSONObject;

public class Piece {
    private String title;
    private String material;
    private int height;
    private int width;
    private double materialCost;
    private int cutTime;
    private double cutCost;
    private boolean baseSandingCostOnCutTime;
    private double sandingCost;
    private boolean basePaintCostOnMaterialArea;
    private double paintingCost;
    private double adjustment;
    private double cleaningAndMaintenanceCost;
    private double subTotal;
    private double total;

    public Piece(String title, String material, int height, int width, double materialCost, int cutTime, double cutCost, boolean baseSandingCostOnCutTime, double sandingCost, boolean basePaintCostOnMaterialArea, double paintingCost, double adjustment, double cleaningAndMaintenanceCost, double subTotal, double total) {
        this.title = title;
        this.material = material;
        this.height = height;
        this.width = width;
        this.materialCost = materialCost;
        this.cutTime = cutTime;
        this.cutCost = cutCost;
        this.baseSandingCostOnCutTime = baseSandingCostOnCutTime;
        this.sandingCost = sandingCost;
        this.basePaintCostOnMaterialArea = basePaintCostOnMaterialArea;
        this.paintingCost = paintingCost;
        this.adjustment = adjustment;
        this.cleaningAndMaintenanceCost = cleaningAndMaintenanceCost;
        this.subTotal = subTotal;
        this.total = total;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getMaterialCost() {
        return materialCost;
    }

    public void setMaterialCost(double materialCost) {
        this.materialCost = materialCost;
    }

    public int getCutTime() {
        return cutTime;
    }

    public void setCutTime(int cutTime) {
        this.cutTime = cutTime;
    }

    public double getCutCost() {
        return cutCost;
    }

    public void setCutCost(double cutCost) {
        this.cutCost = cutCost;
    }

    public boolean isBaseSandingCostOnCutTime() {
        return baseSandingCostOnCutTime;
    }

    public void setBaseSandingCostOnCutTime(boolean baseSandingCostOnCutTime) {
        this.baseSandingCostOnCutTime = baseSandingCostOnCutTime;
    }

    public double getSandingCost() {
        return sandingCost;
    }

    public void setSandingCost(double sandingCost) {
        this.sandingCost = sandingCost;
    }

    public boolean isBasePaintCostOnMaterialArea() {
        return basePaintCostOnMaterialArea;
    }

    public void setBasePaintCostOnMaterialArea(boolean basePaintCostOnMaterialArea) {
        this.basePaintCostOnMaterialArea = basePaintCostOnMaterialArea;
    }

    public double getPaintingCost() {
        return paintingCost;
    }

    public void setPaintingCost(double paintingCost) {
        this.paintingCost = paintingCost;
    }

    public double getAdjustment() {
        return adjustment;
    }

    public void setAdjustment(double adjustment) {
        this.adjustment = adjustment;
    }

    public double getCleaningAndMaintenanceCost() {
        return cleaningAndMaintenanceCost;
    }

    public void setCleaningAndMaintenanceCost(double cleaningAndMaintenanceCost) {
        this.cleaningAndMaintenanceCost = cleaningAndMaintenanceCost;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public JSONObject toJSON() {
        JSONObject jo = new JSONObject();
        jo.put("title", getTitle());
        jo.put("material", getMaterial());
        jo.put("height", getHeight());
        jo.put("width", getWidth());
        jo.put("materialCost", getMaterialCost());
        jo.put("cutTime", getCutTime());
        jo.put("cutCost", getCutCost());
        jo.put("isBaseSandingCostOnCutTime", isBaseSandingCostOnCutTime());
        jo.put("sandingCost", getSandingCost());
        jo.put("isBasePaintCostOnMaterialArea", isBasePaintCostOnMaterialArea());
        jo.put("paintingCost", getPaintingCost());
        jo.put("adjustment", getAdjustment());
        jo.put("cleaningAndMaintenanceCost", getCleaningAndMaintenanceCost());
        jo.put("subtotal", getSubTotal());
        jo.put("total", getTotal());

        return jo;
    }
}
