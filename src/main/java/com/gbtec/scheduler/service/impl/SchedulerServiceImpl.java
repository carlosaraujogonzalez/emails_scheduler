package com.gbtec.scheduler.service.impl;

import com.gbtec.scheduler.service.SchedulerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class SchedulerServiceImpl implements SchedulerService {
    @Autowired
    RabbitMQSender rabbitMQSender;
    @Override
    public void markAsSpam() {

        log.info("markAsSpam - Start");

        String emailFrom = "carl@gbtec.es";
        rabbitMQSender.send(emailFrom);
        
        log.info("markAsSpam - End");
    }

}
