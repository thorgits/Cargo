package casestudy.cargo;

import annotation.DefinesIdentity;
import annotation.Entity;
import casestudy.DefaultRoot;
import casestudy.shared.LocationShared;

/**
 * @author liwenjun
 * @ClassName CarrierMovement
 * @Date 2019-12-11 14:10
 */
@Entity(root = DefaultRoot.class)
public class CarrierMovement {
    @DefinesIdentity
    private long scheduleID;
    public LocationShared to;
    public LocationShared from;
}
