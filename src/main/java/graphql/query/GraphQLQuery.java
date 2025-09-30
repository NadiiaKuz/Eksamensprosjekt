package graphql.query;

import com.google.gson.Gson;

import java.util.HashMap;
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
        String graphQLQuery = String.format("{\n" +
                "  trip(\n" +
                "    from: {place:\"NSR:StopPlace:%d\"}\n" +
                "    to: {place:\"NSR:StopPlace:%d\"}\n" +
                "    dateTime: \"2025-09-29T22:57:52.579+02:00\"\n" +
                "    arriveBy: false\n" +
                "  ) {\n" +
                "    dateTime\n" +
                "  }\n" +
                "}", fromStop, toStop);
        return returnJsonQuery(graphQLQuery);
    }
}
