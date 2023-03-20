package rightsseller.availability;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class BaseAggregateRoot {
    protected AggregateId id;

    public AggregateId getId() {
        return id;
    }
}
