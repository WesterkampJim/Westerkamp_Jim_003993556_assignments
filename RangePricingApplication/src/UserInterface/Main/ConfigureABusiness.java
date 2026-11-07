/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Main;

import MarketingManagement.MarketingPersonDirectory;
import MarketingManagement.MarketingPersonProfile;
import TheBusiness.Business.Business;
import TheBusiness.CustomerManagement.CustomerDirectory;
import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.OrderManagement.MasterOrderList;
import TheBusiness.OrderManagement.Order;
import TheBusiness.OrderManagement.OrderItem;
import TheBusiness.Personnel.Person;
import TheBusiness.Personnel.PersonDirectory;
import TheBusiness.ProductManagement.Product;
import TheBusiness.ProductManagement.ProductCatalog;
import TheBusiness.SalesManagement.SalesPersonDirectory;
import TheBusiness.SalesManagement.SalesPersonProfile;
import TheBusiness.Supplier.Supplier;
import TheBusiness.Supplier.SupplierDirectory;
import TheBusiness.UserAccountManagement.UserAccount;
import TheBusiness.UserAccountManagement.UserAccountDirectory;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author kal bugrara
 */
class ConfigureABusiness {

    static Business initialize() {
        Business business = new Business("Xerox");
        SupplierDirectory supplierdirectory = business.getSupplierDirectory();

        Supplier supplier1 = supplierdirectory.newSupplier("Lenovo");
        ProductCatalog productcatalog = supplier1.getProductCatalog();
        Product products1p1 = productcatalog.newProduct("Scanner 3  1", 2000, 16500, 10000);
        Product products1p2 = productcatalog.newProduct("Scanner 4", 10000, 25000, 16500);
        Product products1p3 = productcatalog.newProduct("Printer 2", 22000, 40000, 36500);
        Product products1p4 = productcatalog.newProduct("Photocopier 2 ", 30000, 70000, 50000);
        Product products1p5 = productcatalog.newProduct("Scanner  5", 19000, 36500, 25000);
        Product products1p6 = productcatalog.newProduct("Scanner 6", 90000, 125000, 105000);
        Product products1p7 = productcatalog.newProduct("Printer 3", 22000, 60000, 36500);
        Product products1p8 = productcatalog.newProduct("Photocopier 3", 30000, 70000, 50000);

        //       SupplierDirectory suplierdirectory = business.getSupplierDirectory();
        Supplier supplier2 = supplierdirectory.newSupplier("Epson");
        productcatalog = supplier2.getProductCatalog();
        Product products2p1 = productcatalog.newProduct("Scanner 13  1", 12000, 26000, 18500);
        Product products2p2 = productcatalog.newProduct("Scanner 14", 90000, 165000, 125000);
        Product products2p3 = productcatalog.newProduct("Color Printer 112", 422000, 540000, 495000);
        Product products2p4 = productcatalog.newProduct("Photocopier 922 ", 430000, 890000, 550000);
        Product products2p5 = productcatalog.newProduct("Low toner Scanner  102", 195000, 500100, 365102);
        Product products2p6 = productcatalog.newProduct("Speedy color Scanner 611", 900000, 125000, 1650000);
        Product products2p7 = productcatalog.newProduct("Premier Printer 300", 322000, 470000, 736500);
        Product products2p8 = productcatalog.newProduct("Color Photocopier 500", 350000, 580000, 780000);

        
        
// Create Persons
        PersonDirectory persondirectory = business.getPersonDirectory();
// person representing sales organization        
        Person xeroxsalesperson001 = persondirectory.newPerson("Xerox sales");
        Person xeroxmarketingperson001 = persondirectory.newPerson("Xerox marketing");
        Person xeroxadminperson001 = persondirectory.newPerson("Xerox admin");


// Create person objects to represent customer organizations. 
        Person person005 = persondirectory.newPerson("Dell");
        Person person006 = persondirectory.newPerson("Microsoft");
        Person person007 = persondirectory.newPerson("Google");
        Person person008 = persondirectory.newPerson("JP Morgan");
        Person person009 = persondirectory.newPerson("State street"); //we use this as customer

// Create Customers
        CustomerDirectory customedirectory = business.getCustomerDirectory();
        CustomerProfile customerprofile1 = customedirectory.newCustomerProfile(person005);
        CustomerProfile customerprofile2 = customedirectory.newCustomerProfile(person006);
        CustomerProfile customerprofile3 = customedirectory.newCustomerProfile(person007);
        CustomerProfile customerprofile4 = customedirectory.newCustomerProfile(person008);
        CustomerProfile customerprofile5 = customedirectory.newCustomerProfile(person009);
        
      
        
        
// Create Sales people
        SalesPersonDirectory salespersondirectory = business.getSalesPersonDirectory();
        SalesPersonProfile salespersonprofile = salespersondirectory.newSalesPersonProfile(xeroxsalesperson001);

// Create Marketing people
        MarketingPersonDirectory marketingpersondirectory = business.getMarketingPersonDirectory();
        MarketingPersonProfile marketingpersonprofile0 = marketingpersondirectory.newMarketingPersonProfile(xeroxmarketingperson001);

// Create Admins to manage the business
 //       EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
 //       EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(xeroxadminperson001);

// Create User accounts that link to specific profiles
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        UserAccount ua1 = uadirectory.newUserAccount(salespersonprofile, "Sales", "XXXX"); /// order products for one of the customers and performed by a sales person
        UserAccount ua2 = uadirectory.newUserAccount(marketingpersonprofile0, "Marketing", "XXXX"); /// order products for one of the customers and performed by a sales person
 //       UserAccount ua3 = uadirectory.newUserAccount(employeeprofile0, "Admin", "XXXX"); /// order products for one of the customers and performed by a sales person

// Process Orders on behalf of sales person and customer
        MasterOrderList masterorderlist = business.getMasterOrderList();
        Order order1 = masterorderlist.newOrder(customerprofile4, salespersonprofile);
        OrderItem oi1 = order1.newOrderItem(products1p1, 18000, 1);
        OrderItem oi2 = order1.newOrderItem(products1p2, 19500, 4);
        OrderItem oi3 = order1.newOrderItem(products1p3, 36500, 10);
        OrderItem oi4 = order1.newOrderItem(products2p4, 50000, 1);
        OrderItem oi5 = order1.newOrderItem(products1p5, 25000, 3);
        OrderItem oi6 = order1.newOrderItem(products1p6, 105000, 2);
        OrderItem oi7 = order1.newOrderItem(products2p7, 36500, 3);
        OrderItem oi8 = order1.newOrderItem(products1p8, 50000, 2);

        Order order12 = masterorderlist.newOrder(customerprofile2, salespersonprofile);
        OrderItem oi12 = order12.newOrderItem(products1p2, 9500, 4);
        OrderItem oi13 = order12.newOrderItem(products1p3, 29500, 10);
        OrderItem oi14 = order12.newOrderItem(products2p4, 30000, 1);
        OrderItem oi15 = order12.newOrderItem(products1p5, 2000, 3);
        OrderItem oi16 = order12.newOrderItem(products1p6, 95000, 2);
        OrderItem oi17 = order12.newOrderItem(products1p7, 26500, 3);
        OrderItem oi18 = order12.newOrderItem(products1p8, 40000, 2);
        
        generateSuppliers(business);
        generateCustomers(business);
        return business;

    }
    
    
    public static void generateSuppliers(Business business){
        //some names in a two lists
        String[] randomnames1= {"Big","Up","Tech","Special","Tiger","Bear","Chicago","Wendell","Caleb","Williams","Awe","Scrunk","Gernoble","Brandbury"};
        String[] randomnames2={"Yellow","Time","Analytics","Engineering","Inc","Up","Bordoo","Red","Orange","Sonoma","Clarico","Express"};
        
        //random product names
        String[] randomwords1 = {"mislead","wind","install","worry","easy","awful","technology","suitcase","order","suburb","shatter","brake","due","identity","panic","viable","bind","mix","current","excavate","series","revise","proud","trunk","shortage"};
        String[] randomwords2 = {"laptop","tablet","smartphone","headphones","earbuds","charger","cable","mouse","keyboard","monitor","webcam","microphone","speaker","router","modem","hard drive","SSD","RAM","GPU","processor","power bank","smartwatch"};    
        
//init random
        Random random = new Random();
        
        //combine lists randomly to generate names. add a number at the end to make sure they are unique.
        ArrayList<String> suppliernames = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            String name = randomnames1[random.nextInt(randomnames1.length)] + " " + randomnames2[random.nextInt(randomnames2.length)] + String.valueOf(i) ;
            suppliernames.add(name);
        }

        String productname="";
        String s ="";
        for (int i = 0; i < 31; i++ ){
            s = suppliernames.get(i);
            Supplier supplier = business.getSupplierDirectory().newSupplier(s);
            ProductCatalog pc = supplier.getProductCatalog();
            for (int j = 0 ; j < 51; j++){
                productname = randomwords1[random.nextInt(randomwords1.length)] + " " + randomwords2[random.nextInt(randomwords2.length)] + String.valueOf(j);
                Product p = pc.newProduct(productname, random.nextInt(500,15000), random.nextInt(500,15000), random.nextInt(500,15000));            
            }
        }
    }
    
        public static void generateCustomers(Business business){
        //some names in a two lists
        String[] randomnames1= {"Bill","Mike","Tim","Sara","Tiger","Bob","Cheryl","Wendell","Caleb","Williams","Brad","Murph","Marco","Jon"};
        String[] randomnames2={"Cruise","Black","Johsnon","Smith","Durgle","Up","Payton","Red","Orange","Sonoma","Clarico","Gerry"};
        
        //random product names
        String[] randomwords1 = {"mislead","wind","install","worry","easy","awful","technology","suitcase","order","suburb","shatter","brake","due","identity","panic","viable","bind","mix","current","excavate","series","revise","proud","trunk","shortage"};
        String[] randomwords2 = {"laptop","tablet","smartphone","headphones","earbuds","charger","cable","mouse","keyboard","monitor","webcam","microphone","speaker","router","modem","hard drive","SSD","RAM","GPU","processor","power bank","smartwatch"};    
        
        PersonDirectory persondirectory = business.getPersonDirectory();
        CustomerDirectory customedirectory = business.getCustomerDirectory();
        MasterOrderList masterorderlist = business.getMasterOrderList();
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        SalesPersonDirectory salespersondirectory = business.getSalesPersonDirectory();
        SupplierDirectory supplierdirectory = business.getSupplierDirectory();

        //init random
        Random random = new Random();
        Person p;
        CustomerProfile c;
        SalesPersonProfile rsalesperson;
        Supplier rsupplier;
        Product rproduct;
        int rprice;
        int rquarter;
        
        //combine lists randomly to generate names. add a number at the end to make sure they are unique.
        for (int i = 0; i < 301; i++) {
            String name = randomnames1[random.nextInt(randomnames1.length)] + " " + randomnames2[random.nextInt(randomnames2.length)] + String.valueOf(i) ;
            p = persondirectory.newPerson(name);
            c = customedirectory.newCustomerProfile(p);                    
            //pick random salespersonprofile
            System.out.println(salespersondirectory.getSalespersonlist());
            rsalesperson = salespersondirectory.getSalespersonlist().get(random.nextInt(salespersondirectory.getSalespersonlist().size()));
            //pick random supplier
            rsupplier = supplierdirectory.getSuplierList().get(random.nextInt(supplierdirectory.getSuplierList().size()));
            //pick random product
            rproduct = rsupplier.getProductCatalog().getProductList().get(random.nextInt(rsupplier.getProductCatalog().getProductList().size()));
            //pick a random price
            rprice = random.nextInt(100,50000);
            //pick a random quarter
            rquarter = random.nextInt(1,5);
            
            //put all those randoms together!
            Order o = masterorderlist.newOrder(c, rsalesperson);
            OrderItem oi1 = o.newOrderItem(rproduct, rprice, rquarter);
        }


    }

}