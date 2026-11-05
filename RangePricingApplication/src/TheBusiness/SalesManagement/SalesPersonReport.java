/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.SalesManagement;


import TheBusiness.Business.Business;
import TheBusiness.CustomerManagement.CustomerDirectory;
import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.ProductManagement.Product;
import TheBusiness.ProductManagement.ProductCatalog;
import TheBusiness.Supplier.Supplier;
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
   public static SalesPersonReport getProductsPriceReport(Business business){
       
        SalesPersonReport report = new SalesPersonReport();

        report.addHeader("Supplier");
        report.addHeader("Product");
        report.addHeader("Price");
       
       
        //new list to hold all products 
        ArrayList<Product> productlist = new ArrayList<Product>();
        //grab the supplier directory
        SupplierDirectory sd = business.getSupplierDirectory();
        //declare product catalog, supplier name
        ProductCatalog pc;
        String suppliername;
        //loop through suppliers
        for (Supplier s: sd.getSuplierList()){
            //set pc to that suppliers catalog
            suppliername = s.getName();
            pc = s.getProductCatalog();
            //iteratre through all of suppliers products
            for (Product p : pc.getProductList()){
                //add product to the "product list"
                productlist.add(p);
                report.addRow(new Object[]{suppliername, p.getName(), p.getCeilingPrice()});

            }  
        }
  
        return report;
   }
   
   public static SalesPersonReport getCustomersTotalPurchases(Business business){
        SalesPersonReport report = new SalesPersonReport();
        
        report.addHeader("Customer");
        report.addHeader("Total Purchase Value");
        
        ArrayList<CustomerProfile> customerlist = new ArrayList<CustomerProfile>();
        CustomerDirectory cd = business.getCustomerDirectory();
        for (CustomerProfile c : cd.getCustomerlist()){
                report.addRow(new Object[]{c.getPerson().getId(),c.getTotalPricePerformance() });
        }

        return report;

   }
   
    
    
}
