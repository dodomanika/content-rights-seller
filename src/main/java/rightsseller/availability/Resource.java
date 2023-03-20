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
        //TODO: improve impl
        return isActive() && blocks.isEmpty();
    }

    public void block(AggregateId ownerId, Duration timeToLive) {
        //TODO: improve impl
        if (!isActive()) {
            return;
        }
        if (!blocks.isEmpty()) {
            return;
        }

        blocks.add(new Block());
    }

    public void unblock(AggregateId ownerId, Duration timeToLive) {
        //TODO: implement

    }

    public void blockPermanently(AggregateId ownerId, Duration timeToLive) {
        //TODO: implement

    }
}
