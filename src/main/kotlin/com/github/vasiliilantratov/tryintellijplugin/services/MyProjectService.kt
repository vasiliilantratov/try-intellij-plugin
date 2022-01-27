package com.github.vasiliilantratov.tryintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.vasiliilantratov.tryintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
