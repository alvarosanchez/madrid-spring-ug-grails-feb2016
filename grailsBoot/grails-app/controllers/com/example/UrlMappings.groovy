package com.example

class UrlMappings {

    static mappings = {

        "/todos"(resources:"todo")

        "/pendingTodos"(controller: 'todo', action: 'pending')

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
