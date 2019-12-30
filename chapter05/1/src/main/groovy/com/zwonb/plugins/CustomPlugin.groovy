package com.zwonb.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

class CustomPlugin implements Plugin<Project> {

    @Override
    void apply(Project target) {
        target.task("customTask").doLast {
            println "这是一个通过自定义插件方式创建的任务"
        }
    }
}