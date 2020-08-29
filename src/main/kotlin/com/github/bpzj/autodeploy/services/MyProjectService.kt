package com.github.bpzj.autodeploy.services

import com.intellij.openapi.project.Project
import com.github.bpzj.autodeploy.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
