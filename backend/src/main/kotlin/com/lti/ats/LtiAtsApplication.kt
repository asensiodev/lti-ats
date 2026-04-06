package com.lti.ats

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LtiAtsApplication

fun main(args: Array<String>) {
	runApplication<LtiAtsApplication>(*args)
}
