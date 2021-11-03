package rightsseller.availability;

import java.time.Duration;
import java.util.Set;

public class Resource extends BaseAggregateRoot {
    private boolean isActive;
    private Set<Block> blocks;

    Resource(AggregateId aggregateId) {
        this.id = aggregateId;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean isAvailable() {
        return false;
    }

    public void block(AggregateId ownerId, Duration timeToLive) {
    }

    public void unblock(AggregateId ownerId, Duration timeToLive) {

    }

    public void blockPermanently(AggregateId ownerId, Duration timeToLive) {
    }
}
