package graphql.model;

import org.springframework.data.annotation.Id;

public record Place(
        @Id
        String place
) {
}
