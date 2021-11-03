package rightsseller.availability;

import java.util.UUID;

public class AggregateId {
    private String aggregateId;

    private AggregateId(String aggregateId) {
        this.aggregateId = aggregateId;
    }

    public static AggregateId generate() {
        return new AggregateId(UUID.randomUUID().toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AggregateId that = (AggregateId) o;

        return aggregateId.equals(that.aggregateId);
    }

    @Override
    public int hashCode() {
        return aggregateId.hashCode();
    }

    @Override
    public String toString() {
        return aggregateId;
    }
}
