package com.bpzj.auto.deploy.services;

import com.bpzj.auto.deploy.MyBundle;

public class MyApplicationService {
    public MyApplicationService() {
        String var1 = MyBundle.message("applicationService", new Object[0]);
        System.out.println(var1);
    }
}
