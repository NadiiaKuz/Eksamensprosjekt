package graphql.model;

import org.springframework.data.annotation.Id;
import java.time.OffsetDateTime;

public record TripRequest(
        @Id
        Place from,
        Place to,
        OffsetDateTime dateTime,
        Double walkSpeed,
        Boolean arriveBy
) {
}