package casestudy.cargo;

import annotation.*;
import casestudy.shared.LocationShared;
import casestudy.location.LocationService;

import java.util.Date;
/**
 * @author liwenjun
 * @ClassName DeliverySpecification
 * @Date 2019-12-11 13:59
 */
@Specification
public class DeliverySpecification {
    public  Date arrivalTime;
    LocationShared locationShared;
    LocationService locationService;
    public  boolean verify(LocationShared  locationShared){

        if ("dd"=="dd"){

            System.out.printf("s");
        }

        return false;
    }

}
