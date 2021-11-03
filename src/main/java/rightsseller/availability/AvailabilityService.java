package rightsseller.availability;

import java.time.Duration;

public class AvailabilityService {
    //TODO: method should return sth?
    public void block(Resource resource, AggregateId ownerId, Duration timeToLive) {
        resource.block(ownerId, timeToLive);
    }
}
