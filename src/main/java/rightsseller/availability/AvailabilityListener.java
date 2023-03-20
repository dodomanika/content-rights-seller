package rightsseller.availability;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AvailabilityListener {

    private final ResourceRepository resourceRepository;

    private final ResourceFactory resourceFactory;

    private final AvailabilityService availabilityService;

    public void handle(BlockRequestedEvent blockRequestedEvent) {
        Resource resource = resourceRepository.load(blockRequestedEvent.getResourceId());


        if (resource == null) {
            resource = resourceFactory.create(blockRequestedEvent.getResourceId());
        }

        availabilityService.block(resource, blockRequestedEvent.getOwnerId(), blockRequestedEvent.getTimeToLive());

    }
}
