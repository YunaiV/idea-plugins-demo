package com.github.yunaiv.ideapluginsdemo.services

import com.intellij.openapi.project.Project
import com.github.yunaiv.ideapluginsdemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
