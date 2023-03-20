package rightsseller.availability;

import java.util.HashMap;
import java.util.Map;

public class InMemoryResourceRepository implements ResourceRepository {

    private final Map<AggregateId, Resource> resources = new HashMap<>();

    @Override
    public Resource load(AggregateId resourceId) {
        return resources.get(resourceId);
    }

    @Override
    public void save(Resource resource) {
        resources.put(resource.getId(), resource);
    }
}
