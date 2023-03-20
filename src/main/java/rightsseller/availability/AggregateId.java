package rightsseller.availability;

import lombok.EqualsAndHashCode;

import java.util.UUID;

@EqualsAndHashCode
public class AggregateId {
    private final String id;

    private AggregateId(String id) {
        this.id = id;
    }

    public static AggregateId generate() {
        return new AggregateId(UUID.randomUUID().toString());
    }

    @Override
    public String toString() {
        return id;
    }
}
