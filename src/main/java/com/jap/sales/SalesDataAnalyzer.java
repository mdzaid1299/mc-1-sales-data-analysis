package com.jap.sales;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SalesDataAnalyzer {
    public List<SalesRecord> readFile(String fileName) {
        List<SalesRecord> recordList = new ArrayList<>();
        try{
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data = bufferedReader.readLine();
            while((data = bufferedReader.readLine()) != null){
                String[] val = data.split(",");
                String date = val[0];
                int customer_id = Integer.parseInt(val[1]);
                int product_category = Integer.parseInt(val[2]);
                String payment_method = val[3];
                double amount = Double.parseDouble(val[4]);
                double time_on_site = Double.parseDouble(val[5]);
                int clicks_in_site = Integer.parseInt(val[6]);
                recordList.add(new SalesRecord(date,customer_id,product_category,payment_method,amount,time_on_site,clicks_in_site));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return recordList;
    }



    public List<SalesRecord> getAllCustomersSortedByPurchaseAmount(List<SalesRecord> salesData){
        Comparator<SalesRecord> recordComparator = (a1,a2) -> (int) (a2.getAmount() - a1.getAmount());
        Collections.sort(salesData,recordComparator);
        return salesData;
    }
    public SalesRecord getTopCustomerWhoSpentMaxTimeOnSite(List<SalesRecord> salesData){
        Comparator<SalesRecord> recordComparator = (a1,a2) -> (int)(a2.getTime_on_site() - a1.getTime_on_site());
        Collections.sort(salesData,recordComparator);
        return salesData.get(0);
    }




}