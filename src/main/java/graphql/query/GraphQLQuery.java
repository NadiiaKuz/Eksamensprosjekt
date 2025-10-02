package graphql.query;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.time.OffsetDateTime;

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
                  ) {
                    tripPatterns {
                      expectedStartTime
                      expectedEndTime
                      duration
                      legs {
                        mode
                        distance
                        line {
                          publicCode
                          transportMode
                          operator {
                            id
                          }
                        }
                      }
                    }
                  }
                }
                """, fromStop, toStop);
        return returnJsonQuery(graphQLQuery);
    }

    public String getQuery(int fromStop, int toStop, OffsetDateTime dateTime) {
        String graphQLQuery = String.format("""
                  {
                  trip(
                    from: {place:"NSR:StopPlace:%d"}
                    to: {place:"NSR:StopPlace:%d"}
                    dateTime: "%s"
                  ) {
                     tripPatterns {
                       expectedStartTime
                       expectedEndTime
                       duration
                       legs {
                         mode
                         distance
                         line {
                           publicCode
                           transportMode
                           operator {
                             id
                           }
                         }
                       }
                     }
                   }
                 }
                """, fromStop, toStop, dateTime);
        return returnJsonQuery(graphQLQuery);
    }

    public String getQuery(int fromStop, int toStop, String transportMode) {
        String graphQLQuery = String.format("""
                {
                  trip(
                    from: {place: "NSR:StopPlace:%d"}
                    to: {place: "NSR:StopPlace:%d"}
                    modes: {transportModes: {%s}}
                  ) {
                    tripPatterns {
                      expectedStartTime
                      expectedEndTime
                      duration
                      legs {
                        mode
                        distance
                        line {
                          publicCode
                          transportMode
                          operator {
                            id
                          }
                        }
                      }
                    }
                  }
                }
                """, fromStop, toStop, transportMode);

        return returnJsonQuery(graphQLQuery);
    }

    public String getQuery(int fromStop, int toStop, OffsetDateTime dateTime, String transportMode) {
        String timeString = dateTime.toString();

        String graphQLQuery = String.format("""
                {
                  trip(
                    from: {place: "NSR:StopPlace:%d"}
                    to: {place: "NSR:StopPlace:%d"}
                    dateTime: "%s"
                    arriveBy: false
                    modes: {transportModes: {transportMode: %s}}
                  ) {
                    tripPatterns {
                      expectedStartTime
                      expectedEndTime
                      duration
                      legs {
                        mode
                        distance
                        line {
                          publicCode
                          transportMode
                          operator {
                            id
                          }
                        }
                      }
                    }
                  }
                }
                """, fromStop, toStop, timeString, transportMode);

        return returnJsonQuery(graphQLQuery);
    }

    public String getQuery(int fromStop, int toStop, ArrayList<String> transportModes) {
        String tModes = String.join("}, {transportMode: ", transportModes);

        String graphQLQuery = String.format("""
                {
                  trip(
                    from: {place: "NSR:StopPlace:%s"}
                    to: {place: "NSR:StopPlace:%s"}
                    arriveBy: false
                    modes: {transportModes: [{transportMode: %s}]}
                  ) {
                    tripPatterns {
                      expectedStartTime
                      expectedEndTime
                      duration
                      legs {
                        mode
                        distance
                        line {
                          publicCode
                          transportMode
                          operator {
                            id
                          }
                        }
                      }
                    }
                  }
                }
                """, fromStop, toStop, tModes);

        return returnJsonQuery(graphQLQuery);
    }

    public String getQuery(int fromStop, int toStop, OffsetDateTime dateTime, ArrayList<String> transportModes) {
        String tModes = String.join("}, {transportMode: ", transportModes);

        String graphQLQuery = String.format("""
                {
                  trip(
                    from: {place: "NSR:StopPlace:%s"}
                    to: {place: "NSR:StopPlace:%s"}
                    dateTime: "%s"
                    arriveBy: false
                    modes: {transportModes: [{transportMode: %s}]}
                  ) {
                    tripPatterns {
                      expectedStartTime
                      expectedEndTime
                      duration
                      legs {
                        mode
                        distance
                        line {
                          publicCode
                          transportMode
                          operator {
                            id
                          }
                        }
                      }
                    }
                  }
                }
                """, fromStop, toStop, dateTime, tModes);

        return returnJsonQuery(graphQLQuery);
    }
}
