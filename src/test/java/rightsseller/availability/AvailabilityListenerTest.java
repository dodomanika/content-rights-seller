package rightsseller.availability;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class AvailabilityListenerTest {

    private final ResourceRepository resourceRepository = new InMemoryResourceRepository();
    private final ResourceFactory resourceFactory = new ResourceFactory();
    private final AvailabilityService availabilityService = new AvailabilityService(resourceRepository);

    private final AvailabilityListener availabilityListener = new AvailabilityListener(resourceRepository,
            resourceFactory, availabilityService);

    @Test
    void shouldCreateNewResourceAndBlockIt_whenResourceNotExistsYet() {
        // given
        AggregateId resourceId = AggregateId.generate();
        AggregateId ownerId = AggregateId.generate();
        Duration timeToLive = Duration.ofHours(1L);

        BlockRequestedEvent blockRequestedEvent = new BlockRequestedEvent(resourceId, ownerId, timeToLive);

        // when
        availabilityListener.handle(blockRequestedEvent);

        // then
        Resource resource = resourceRepository.load(resourceId);
        assertNotNull(resource);
        assertFalse(resource.isAvailable());
    }
}