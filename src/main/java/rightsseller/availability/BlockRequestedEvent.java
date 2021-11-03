package rightsseller.availability;

import java.time.Duration;

public class BlockRequestedEvent {
    private final AggregateId resourceId;
    private final AggregateId ownerId;
    private final Duration timeToLive;

    public BlockRequestedEvent(AggregateId resourceId, AggregateId ownerId, Duration timeToLive) {
        this.resourceId = resourceId;
        this.ownerId = ownerId;
        this.timeToLive = timeToLive;
    }

    public AggregateId getResourceId() {
        return resourceId;
    }

    public AggregateId getOwnerId() {
        return ownerId;
    }

    public Duration getTimeToLive() {
        return timeToLive;
    }
}
