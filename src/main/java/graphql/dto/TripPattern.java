package graphql.dto;

import java.util.List;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class TripPattern {
        OffsetDateTime expectedRunTime;
        OffsetDateTime expectedEndTime;
        List<Leg> legs;
}