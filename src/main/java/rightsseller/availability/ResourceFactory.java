package rightsseller.availability;

public class ResourceFactory {
    public Resource create(AggregateId resourceId) {
        return new Resource(resourceId);
    }
}
