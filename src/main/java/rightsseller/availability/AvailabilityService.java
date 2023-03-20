package rightsseller.availability;

import lombok.RequiredArgsConstructor;

import java.time.Duration;

@RequiredArgsConstructor
public class AvailabilityService {
    private final ResourceRepository resourceRepository;

    //TODO: method should return sth?
    public void block(Resource resource, AggregateId ownerId, Duration timeToLive) {
        resource.block(ownerId, timeToLive);
        resourceRepository.save(resource);
    }
}
