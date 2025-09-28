package graphql.model;

import org.springframework.data.annotation.Id;

public record Leg(
        @Id
        String mode,
        Double distance,
        Line line
) {
}
