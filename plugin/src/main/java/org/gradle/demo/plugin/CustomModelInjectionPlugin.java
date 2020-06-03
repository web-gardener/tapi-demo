/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.gradle.demo.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.tooling.provider.model.ToolingModelBuilderRegistry;

import javax.inject.Inject;

public class CustomModelInjectionPlugin implements Plugin<Project> {
    private final ToolingModelBuilderRegistry registry;

    @Inject
    public CustomModelInjectionPlugin(ToolingModelBuilderRegistry registry) {
        this.registry = registry;
    }


    public void apply(Project project) {
        if (project == project.getRootProject()) {
            registry.register(new OutgoingArtifactsModelBuilder());
        }
    }
}
