package rightsseller.availability;

import java.time.Duration;

public class AvailabilityService {
    public void block(Resource resource, AggregateId ownerId, Duration timeToLive) {
        resource.block(ownerId, timeToLive);
    }
}
