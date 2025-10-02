package graphql;

import graphql.client.GraphQLClient;
import graphql.query.GraphQLQuery;

import java.time.OffsetDateTime;

public class GraphQLRequestApplication {
    public static void main(String[] args) throws Exception {
        GraphQLClient client = new GraphQLClient();
        GraphQLQuery query = new GraphQLQuery();

        // Testing responses

        //String response = client.sendGraphQLRequest(query.getQuery(2306, 2534));

        //String response = client.sendGraphQLRequest(query.getQuery(2306,2534, "2025-10-02T13:22:56.428+02:00", "bus"));

        OffsetDateTime currentTime = OffsetDateTime.now();
        String response = client.sendGraphQLRequest(query.getQuery(2306, 2534, currentTime,"bus"));

        System.out.println(response);
    }
}
