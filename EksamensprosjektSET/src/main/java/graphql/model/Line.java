package graphql.model;

import org.springframework.data.annotation.Id;

public record Line(
        @Id
        String publicCode
) {
}
