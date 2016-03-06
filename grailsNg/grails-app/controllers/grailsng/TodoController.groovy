package grailsng

import grails.rest.RestfulController

class TodoController extends RestfulController {

    static responseFormats = ['json']

    TodoController() {
        super(Todo)
    }

    def pending() {
        respond Todo.findAllByCompleted(false), view: 'index'
    }
}
