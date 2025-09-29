package graphql.dto;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class TripRequest {
    Place from;
    Place to;
    OffsetDateTime dateTime;
    Double walkSpeed;
    Boolean arriveBy;
}