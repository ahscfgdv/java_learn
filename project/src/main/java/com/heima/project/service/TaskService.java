package com.heima.project.service;

import com.heima.project.pojo.Constants;
import com.heima.project.pojo.Content;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

@Service
@Slf4j
public class TaskService {

    @Resource
    private RedisTemplate redisTemplate;

    @PostConstruct
    public void init() {
        log.info("启动");

        System.out.println();
        new Thread(() -> {
            AtomicInteger atomicInteger = new AtomicInteger();
            while (true) {
                if (atomicInteger.get() == 100) {
                    break;
                }
                String key = Constants.ROOM_KEY + 100;
                Random random = new Random();
                for (int i = 0; i < 5; i++) {
                    Content content = new Content();
                    content.setId(1L);

                    log.info("asd={}", content);
                }
//                log.info("asd={}", content);
            }
        }, "init_live_data").start();
    }

}
