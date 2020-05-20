package com.jokes.chucknorrisjokes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Scheduling {
    private static final Logger logger = LoggerFactory.getLogger(Scheduling.class);

    private static final SimpleDateFormat date = new SimpleDateFormat();

    @Scheduled(fixedRate = 2000)
    public void scheduledJoke(){
        logger.info("The time is now {}", date.format(new Date()));
        RestTemplate restTemplate = new RestTemplate();
        Joke joke = restTemplate.getForObject("http://api.icndb.com/jokes/random", Joke.class);
        logger.info(joke.toString());
    }

}
