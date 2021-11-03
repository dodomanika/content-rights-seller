package rightsseller.availability;

public interface ResourceRepository {
    Resource load(AggregateId resourceId);
}
