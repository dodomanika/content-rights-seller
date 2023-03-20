package rightsseller.availability;

public interface ResourceRepository {
    //TODO: repo impl
    Resource load(AggregateId resourceId);

    void save(Resource resource);
}
