package com.example.demo1.mypro.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class dailyScanner {
    int count = 0 ;
    @Scheduled(cron = "1 9 2 * * ?" )  //每天0:0:1秒的时候执行还原。
    public void dailyScan(){
        StopScanFlag.flag = true;
        StopScanFlag.count = 0 ;
    }
}
