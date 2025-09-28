package graphql.model;

import org.springframework.data.annotation.Id;

import java.util.List;
import java.time.OffsetDateTime;

public record TripPattern(
        @Id
        OffsetDateTime expectedRunTime,
        OffsetDateTime expectedEndTime,
        List<Leg> legs
) {
}
