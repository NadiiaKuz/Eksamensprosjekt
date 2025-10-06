package graphql;

import graphql.client.GraphQLClient;
import graphql.query.GraphQLQuery;

import java.time.OffsetDateTime;
import java.util.ArrayList;

public class GraphQLRequestApplication {
    public static void main(String[] args) throws Exception {
        GraphQLClient client = new GraphQLClient();
        GraphQLQuery query = new GraphQLQuery();

        // Lager automatiserte forespørsler senere når vi får brukerinput fra nettsiden
        // Lager klasse for å oversette navn på busstopper til ID senere

        // Eksempel query

        OffsetDateTime customTime = OffsetDateTime.parse("2025-10-02T16:00:00.218+02:00");
        ArrayList<String> transportModes = new ArrayList<>();
        transportModes.add("bus");
        transportModes.add("rail");     // Stop ID 60053: Halden stasjon, stop ID 58794: Fredrikstad stasjon
        String response = client.sendGraphQLRequest(query.getQuery(60053, 58794, customTime, transportModes));

        System.out.println(response);
    }
}
