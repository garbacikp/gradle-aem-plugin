package com.cognifide.gradle.aem.deploy

import com.cognifide.gradle.aem.AemException

class DeployException : AemException {

    constructor(message: String, cause: Throwable) : super(message, cause)

    constructor(message: String) : super(message)

}
