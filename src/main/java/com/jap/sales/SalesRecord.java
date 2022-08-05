package com.jap.sales;

public class SalesRecord{

    private String date;
    private int customer_id;
    private int product_category;
    private String payment_method;
    private double amount;
    private double time_on_site;
    private int clicks_in_site;


    public SalesRecord() {
    }

    public SalesRecord(String date, int customer_id, int product_category, String payment_method, double amount, double time_on_site, int clicks_in_site) {
        this.date = date;
        this.customer_id = customer_id;
        this.product_category = product_category;
        this.payment_method = payment_method;
        this.amount = amount;
        this.time_on_site = time_on_site;
        this.clicks_in_site = clicks_in_site;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getProduct_category() {
        return product_category;
    }

    public void setProduct_category(int product_category) {
        this.product_category = product_category;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTime_on_site() {
        return time_on_site;
    }

    public void setTime_on_site(double time_on_site) {
        this.time_on_site = time_on_site;
    }

    public int getClicks_in_site() {
        return clicks_in_site;
    }

    public void setClicks_in_site(int clicks_in_site) {
        this.clicks_in_site = clicks_in_site;
    }

    @Override
    public String toString() {
        return "SalesRecord{" +
                "date=" + date +
                ", customer_id=" + customer_id +
                ", product_category=" + product_category +
                ", payment_method='" + payment_method + '\'' +
                ", amount=" + amount +
                ", time_on_site=" + time_on_site +
                ", clicks_in_site=" + clicks_in_site +
                '}';
    }


}
