package com.example

import grails.artefact.Controller
import grails.web.Controller as GrailsController

@GrailsController
class HomeController implements Controller {

    def index() {
        render "Hello World"
    }

}
