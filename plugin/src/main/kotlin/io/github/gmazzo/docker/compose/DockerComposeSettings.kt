package io.github.gmazzo.docker.compose

import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.Property

@JvmDefaultWithoutCompatibility
interface DockerComposeSettings : DockerComposeCreateSettings {

    /**
     * Optional options to append to the `docker compose up` command.
     *
     * For consistency, [optionsCreate] will be propagated to [optionsUp]
     */
    val optionsUp: ListProperty<String>

    /**
     * Optional options to append to the `docker compose down` command
     */
    val optionsDown: ListProperty<String>

    /**
     * If containers should not be automatically shutdown after the build is finished or not
     */
    val keepContainersRunning: Property<Boolean>

    /**
     * If ports mapping table should be printed to the Gradle standard output when containers are started or not
     */
    val printPortMappings: Property<Boolean>

    /**
     * If logs from the running containers should be printed to the Gradle standard output or not
     */
    val printLogs: Property<Boolean>

}
