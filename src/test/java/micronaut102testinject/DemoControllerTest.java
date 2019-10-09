package micronaut102testinject;

import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@MicronautTest
public class DemoControllerTest {

    @Inject
    EmbeddedServer embeddedServer;

    @Inject
    @Client("/")
    HttpClient client;

    @Test
    public void testSomething() {
        //client and server are NOT null
        assertNotNull(embeddedServer);
        assertNotNull(client);
    }
}
