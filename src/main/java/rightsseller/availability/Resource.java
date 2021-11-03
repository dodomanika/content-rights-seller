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
        //TODO: implement
        return false;
    }

    public void block(AggregateId ownerId, Duration timeToLive) {
        //TODO: implement
    }

    public void unblock(AggregateId ownerId, Duration timeToLive) {
        //TODO: implement

    }

    public void blockPermanently(AggregateId ownerId, Duration timeToLive) {
        //TODO: implement

    }
}
