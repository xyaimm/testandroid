package com.github.xyaimm.testandroid.services

import com.github.xyaimm.testandroid.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
