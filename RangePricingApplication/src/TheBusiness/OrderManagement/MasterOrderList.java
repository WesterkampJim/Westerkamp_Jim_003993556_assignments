/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.OrderManagement;

import TheBusiness.Business.Business;
import java.util.ArrayList;
import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.Personnel.CustomerAccount;
import TheBusiness.ProductManagement.ProductCatalog;
import TheBusiness.SalesManagement.SalesPersonProfile;
import TheBusiness.Supplier.Supplier;
import TheBusiness.Supplier.SupplierDirectory;
import java.util.Collections;

/**
 *
 * @author kal bugrara
 */
public class MasterOrderList {
    ArrayList<Order> orders;
    MasterOrderReport masterorderreport;
    
    public MasterOrderList(){
        orders = new ArrayList();
       
    }
    
    public Order newOrder(CustomerProfile cp){
        Order o= new Order(cp);
        orders.add(o);
        return o;
            
 
    }
    public Order newOrder(CustomerProfile cp, SalesPersonProfile spp){
        Order o= new Order(cp, spp);
        orders.add(o);
        return o;
            
 
    }
    
    public MasterOrderReport generateMasterOrderReport(){
    masterorderreport = new MasterOrderReport();
        
    return masterorderreport;
        
    }

    public int getSalesVolume(){

    int sum = 0;
    for(Order order: orders){
        sum = sum + order.getOrderTotal();
    }
    return sum;
        }

    public int getSalesTotalBySupplier(Business business, Supplier supplier){
    //get sales by supplier. 
        int sum = 0;
        ProductCatalog sc = supplier.getProductCatalog();
        for(Order order: orders){
            ///search through all order, and loop again through each item in each order.
            for (OrderItem oi : order.getOrderitems()){
                if (sc.getProductList().contains(oi.getSelectedProduct())){ //if product is in the supplier product list
                    sum = sum + oi.getOrderItemTotal();     //add to the sum.
                }
            }
        }
        return sum;
    }
    
    public double getLoyaltyScore(Business business, Supplier supplier){
    //get sales by supplier. 
        double score = 0;
        ProductCatalog sc = supplier.getProductCatalog();
        
        ArrayList<CustomerProfile> uniquecustomers = new ArrayList<>();
        double totalCustomers = business.getCustomerDirectory().getCustomerlist().size();
        
        
        for(Order order: orders){
            ///search through all order, and loop again through each item in each order.
            for (OrderItem oi : order.getOrderitems()){
                if (sc.getProductList().contains(oi.getSelectedProduct())){ //if product is in the supplier product list
                    CustomerProfile customer = order.getCustomer();
                    if (!uniquecustomers.contains(customer)){
                        uniquecustomers.add(customer);
                    }  
                }
            }
        }
        
          if (totalCustomers==0 ||  uniquecustomers.size()== 0) {
            return 0.0;
        }
        score = (double) uniquecustomers.size()/totalCustomers;
        return score;
    }
    
    
        public double getAverageSpendPerCustomer(Business business, Supplier supplier){
    //get sales by supplier. 
        double avgspend = 0;
        double totalspend=0;
        ProductCatalog sc = supplier.getProductCatalog();
        
        ArrayList<CustomerProfile> uniquecustomers = new ArrayList<>();
        //grab total customers to find unique customers later
        
        
        for(Order order: orders){
            ///search through all order, and loop again through each item in each order.
            for (OrderItem oi : order.getOrderitems()){
                if (sc.getProductList().contains(oi.getSelectedProduct())){ //if product is in the supplier product list
                    totalspend += oi.getOrderItemTotal();
                    CustomerProfile customer = order.getCustomer();
                    if (!uniquecustomers.contains(customer)){
                        uniquecustomers.add(customer);
                    }  
                }
            }
        }

        if (totalspend == 0.0 ||uniquecustomers.size()==0) {
            return 0.0;
        }
        avgspend = totalspend / (double) uniquecustomers.size();
        return avgspend;
    }
        
        
        public double getTop5SalesScore(Business business, Supplier supplier) {
            

            double[] top5spenders = new double[5];
            double totalspend = 0.0;
            ProductCatalog sc = supplier.getProductCatalog();
            ArrayList<CustomerProfile> uniqueCustomers = new ArrayList<>(); //customers
            ArrayList<Double> customerspends = new ArrayList<>();   // parallel list to keep track of each customer spend
            
            for (Order order : orders) {
                for (OrderItem oi : order.getOrderitems()) {
                    if (sc.getProductList().contains(oi.getSelectedProduct())) {

                        double itemTotal = oi.getOrderItemTotal();
                        totalspend += itemTotal;

                        CustomerProfile customer = order.getCustomer();

                        if ( !uniqueCustomers.contains(customer)) { //no index found for customer.
                            // New customer
                            uniqueCustomers.add(customer);
                            customerspends.add(itemTotal);
                        } else {
                            int index = uniqueCustomers.indexOf(customer);
                            // Existing customer – add their total
                            customerspends.set(index, customerspends.get(index) + itemTotal);
                        }
                    }
                }
            }
            System.out.println(uniqueCustomers);
            System.out.println(customerspends);
            if (totalspend == 0.0 || customerspends.isEmpty()) {
              return 0.0;
           }  

            customerspends.sort(Collections.reverseOrder());

            double top5Total = 0.0;
            int count = Math.min(5, customerspends.size());

            for (int i = 0; i < count; i++) {
                top5Total += customerspends.get(i);
            }

            double averageSpend = top5Total / count;

            return averageSpend;
        
    }

}
