/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.SalesManagement;

import TheBusiness.Business.Business;
import TheBusiness.Supplier.SupplierDirectory;
import java.util.ArrayList;

/**
 *
 * @author jtwes
 */

// creating a report object to more easily control/pass data to my reports table.
public class SalesPersonReport {
    
    //headers of the jtable
    private ArrayList<String> headers;
    //data in jtable
    private ArrayList<Object[]> data;
    Business business;
    
    public SalesPersonReport(){
        headers = new ArrayList<>();
        data = new ArrayList<>();
        
    }
    
    public ArrayList<String> getHeaders(){
      return headers;
    }
    
    public ArrayList<Object[]> getData() {
        return data;
    }

    public void setHeaders(ArrayList<String> headers) {
        this.headers = headers;
    }

    public void setData(ArrayList<Object[]> data) {
        this.data = data;
    }

    public void addHeader(String header) {
        headers.add(header);
    }

    public void addRow(Object[] row) {
        data.add(row);
    }
    
    //
   public static SalesPersonReport getMostExpensiveProductsReport(Business business){
        
        SupplierDirectory sd = business.getSupplierDirectory();

        SalesPersonReport report = new SalesPersonReport();

        report.addHeader("Product ID");
        report.addHeader("Product Name");
        report.addHeader("Price");

        report.addRow(new Object[]{1, "Product A", 500.00});
        report.addRow(new Object[]{2, "Product B", 350.00});
        report.addRow(new Object[]{3, "Product C", 250.00});

        return report;
   }
    
    
}
