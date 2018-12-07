package net.iakovlev.timeshape;

import java.time.ZoneId;
import java.util.Objects;

public final class SameZoneSpan {
    public ZoneId getZoneId() {
        return zoneId;
    }

    public int getEndIndex() {
        return endIndex;
    }

    private final ZoneId zoneId;
    private final int endIndex;

    @Override
    public int hashCode() {
        return Objects.hash(zoneId, endIndex);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof SameZoneSpan))
            return false;
        SameZoneSpan other = (SameZoneSpan) obj;
        return other.zoneId.equals(zoneId) && other.endIndex == endIndex;
    }

    @Override
    public String toString() {
        return String.format("%s: end index %d", zoneId.getId(), endIndex);
    }

    SameZoneSpan(ZoneId zoneId, int endIndex) {
        this.zoneId = zoneId;
        this.endIndex = endIndex;
    }
}
