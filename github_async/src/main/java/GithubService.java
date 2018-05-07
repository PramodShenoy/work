package github_async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.scheduling.annotation.Async;
import org.apache.catalina.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CompletableFuture;

@org.springframework.stereotype.Service
public class GithubService {

    private static final Logger logger = LoggerFactory.getLogger(GithubService.class);

    private final RestTemplate restTemplate;

    public GithubService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Async
    public CompletableFuture<github_async.User> findUser(String user) throws InterruptedException {
        logger.info("Looking up " + user);
        String url = String.format("https://api.github.com/users/%s", user);
        github_async.User results = restTemplate.getForObject(url, github_async.User.class);
        System.out.println(results);
        // Artificial delay of 1s for demonstration purposes
        Thread.sleep(1000L);
        return CompletableFuture.completedFuture(results);
    }

}