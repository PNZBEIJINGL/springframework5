package com.spring5.taskexcutor.announce;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {

    // @Async 注解表名该方法是一个异步方法，这里的方法自动被注入使用ThreadPoolTaskExecutor

    //如果注解在类级别，表示该类的所有方法都是异步方法


    @Async
    public void executeAsynTask(Integer interger) {
        try {
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+" 执行异步任务 ： " + interger);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Async
    public void executeAsynTaskPlus(Integer integer) {
        System.out.println(Thread.currentThread().getName()+" 执行异步任务 + 1 ：" + (integer + 1));
    }
}
