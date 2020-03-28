package casestudy.cargo;

import annotation.Comment;
import annotation.AggregateRoot;
import annotation.Entity;
import casestudy.DefaultRoot;
import casestudy.shared.CustomerShared;
import casestudy.customer.Customer;
@AggregateRoot
public class Cargo {
    private  String trackingID;
    private Customer[] customers;
    public DeliveryHistory deliveryHistory;
    private DeliverySpecification deliverySpecification;
    CustomerShared customerShared;
}
