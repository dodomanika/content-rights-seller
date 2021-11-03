package rightsseller.availability;

public class BaseAggregateRoot {
    private AggregateId id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseAggregateRoot that = (BaseAggregateRoot) o;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
