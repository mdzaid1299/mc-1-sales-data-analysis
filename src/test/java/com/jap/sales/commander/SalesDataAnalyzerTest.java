package com.jap.sales.commander;

import com.jap.sales.SalesDataAnalyzer;
import com.jap.sales.SalesRecord;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SalesDataAnalyzerTest {
    SalesDataAnalyzer salesDataAnalyzer = null;
    SalesRecord salesRecord;
    String fileName = "src/main/resources/purchase_details.csv";
    String numberFormatFile = "src/main/resources/number_format_changed.csv";
    @Before
    public void setUp(){
    salesDataAnalyzer = new SalesDataAnalyzer();
        salesRecord = new SalesRecord("20/11/18",
                37077,505,"credit", 49.53,12.0,8);
    }
    @After
    public void tearDown(){
    salesDataAnalyzer = null; salesRecord = null;
    }

    @Test(expected = NumberFormatException.class)
    public void givenWrongDataFormatThrowsNumberFormatException() {
        salesDataAnalyzer.readFile(numberFormatFile);
    }
    @Test
    public void givenSaleDetailsFileReturnTheNUmberOfSalesRecordObjects() throws ParseException {
        //SalesRecord expected = new SalesRecord("20/11/18",37077,505,"credit",49.53,12,8);
        List<SalesRecord> output = salesDataAnalyzer.readFile(fileName);
        assertEquals("Sales record objects not returned correctly",99,output.size());

    }

    @Test
    public void givenSalesDetailsListReturnSortedListBySalesAmount(){
        List<SalesRecord> output = salesDataAnalyzer.readFile(fileName);
        assertEquals(1107.58,salesDataAnalyzer.getAllCustomersSortedByPurchaseAmount(output).get(0).getAmount(),0);
    }
    @Test
    public void givenSalesDetailsGetTopCustomerWhoSpentMaxTimeOnSite(){
        List<SalesRecord> output = salesDataAnalyzer.readFile(fileName);
        SalesRecord salesRecord = salesDataAnalyzer.getTopCustomerWhoSpentMaxTimeOnSite(output);
        assertEquals(169.2,salesRecord.getTime_on_site(),0);
    }
}
