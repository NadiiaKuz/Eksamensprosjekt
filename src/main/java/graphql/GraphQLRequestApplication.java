package graphql;

import graphql.client.GraphQLClient;
import graphql.query.GraphQLQuery;

public class GraphQLRequestApplication {
    public static void main(String[] args) throws Exception {
        GraphQLClient client = new GraphQLClient();
        GraphQLQuery query = new GraphQLQuery();

        String response = client.sendGraphQLRequest(query.getQuery(2306, 2534));

        System.out.println(response);
    }
}
