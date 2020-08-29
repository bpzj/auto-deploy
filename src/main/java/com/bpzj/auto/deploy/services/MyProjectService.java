package com.bpzj.auto.deploy.services;

import com.intellij.openapi.project.Project;
import com.bpzj.auto.deploy.MyBundle;
import org.jetbrains.annotations.NotNull;


public class MyProjectService {
    public MyProjectService(@NotNull Project project) {
        System.out.println(MyBundle.message("projectService", project.getName()));
    }
}
