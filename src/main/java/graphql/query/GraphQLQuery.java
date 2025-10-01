package graphql.query;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphQLQuery {

    private String returnJsonQuery(String query) {
        // Create a map to hold the query
        Map<String, String> queryMap = new HashMap<>();
        queryMap.put("query", query);

        // Use Gson to convert the map to JSON
        Gson gson = new Gson();

        // Print the JSON output
        return gson.toJson(queryMap);
    }

    public String getQuery(int fromStop, int toStop) {
        //Define the GraphQL query
        String graphQLQuery = String.format("""
                  {
                  trip(
                    from: {place:"NSR:StopPlace:%d"}
                    to: {place:"NSR:StopPlace:%d"}
                    arriveBy: false
                  ) {
                    tripPatterns {
                      expectedStartTime
                      expectedEndTime
                      duration
                      legs {
                        mode
                        distance
                        line {
                          id
                          publicCode
                        }
                      }
                    }
                  }
                }""", fromStop, toStop);
        return returnJsonQuery(graphQLQuery);
    }

    public String getQuery(int fromStop, int toStop, String dateTime) {
        String graphQLQuery = String.format("""
                  {
                  trip(
                    from: {place:"NSR:StopPlace:%d"}
                    to: {place:"NSR:StopPlace:%d"}
                    dateTime: "%s"
                    arriveBy: false
                  ) {
                    tripPatterns {
                      expectedStartTime
                      expectedEndTime
                      duration
                      legs {
                        mode
                        distance
                        line {
                          id
                          publicCode
                        }
                      }
                    }
                  }
                }""", fromStop, toStop, dateTime);
        return returnJsonQuery(graphQLQuery);
    }
}
