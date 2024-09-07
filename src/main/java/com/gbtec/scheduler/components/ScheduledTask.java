package com.gbtec.scheduler.components;

import com.gbtec.scheduler.service.SchedulerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Slf4j
public class ScheduledTask{
	
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @Autowired
    private SchedulerService schedulerService;

    @Scheduled(cron = "0 10 * * * ?")
    //@Scheduled(fixedRate = 60000)
    public void scheduleSpamUpdate() {

            schedulerService.markAsSpam();
            log.info("Task markAsSpam executed now {}", dateFormat.format(new Date()));
    }

}