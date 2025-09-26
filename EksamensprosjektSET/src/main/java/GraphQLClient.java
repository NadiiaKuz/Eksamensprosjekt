import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GraphQLClient {

    private static final String GRAPHQL_SERVER_URL = "https://api.entur.io/journey-planner/v3/graphql";

    public static void main(String[] args) {
        try {
            // TODO:
            // Retrieve user input

            // Build the query based on the current user input

            // Convert the query structure into a JSON string

            // Send request and handle response

        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    /*
    private static Map<String, Object> getUserInput() {
        // work in progress - trying to figure out the best format to save input in
    }
    */
    /*
    private static ?? buildGraphQLQuery(Map<String, Object> userInput) {

        // Dynamically construct your GraphQL query using user input
        // work in progress - working on the most efficient way to programmatically
        // generate queries based on user input and filtering

        ));
    }
    */
    /*
    private static ?? generateGraphQLQuery(?? queryParameters) throws Exception {
        // Convert GraphQL query into a JSON string
    }
    */

    private static void sendGraphQLRequest(String queryJson) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(GRAPHQL_SERVER_URL))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(queryJson))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            System.out.println("Response: " + response.body());
        } else {
            System.err.println("Failed with HTTP error code : " + response.statusCode());
        }
    }
}
