package casestudy.customer;

import annotation.DefinesIdentity;
import annotation.Entity;
import casestudy.location.Location;

/**
 * @author liwenjun
 * @ClassName Customer
 * @Date 2019-12-11 14:24
 */
@Entity
public class Customer {
    public String name;
    public String customerID;
    public void getName(Location location){
        System.out.printf(location.toString());
    }
}
