package graphql.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public record TripResponse(
        @Id
        List<TripPattern> tripPatterns
) {
}
