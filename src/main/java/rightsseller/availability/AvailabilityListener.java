package rightsseller.availability;

public class AvailabilityListener {

    private ResourceRepository resourceRepository;

    private ResourceFactory resourceFactory;

    private AvailabilityService availabilityService;

    public void handle(BlockRequestedEvent blockRequestedEvent) {
        Resource resource = resourceRepository.load(blockRequestedEvent.getResourceId());

        if (resource == null) {
            resource = resourceFactory.create(blockRequestedEvent.getResourceId());
        }

        availabilityService.block(resource, blockRequestedEvent.getOwnerId(), blockRequestedEvent.getTimeToLive());

    }
}
