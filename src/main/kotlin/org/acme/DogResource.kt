package org.acme

import javax.inject.Inject
import javax.transaction.Transactional
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/")
class IssueResource {
    @Inject
    lateinit var dogRepository: DogRepository
    @Inject
    lateinit var dogWithBaseRepository: DogWithBaseRepository

    @Transactional
    @Path("/create-dog")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun createDog() :String {
        dogRepository.persist(DogEntity("dog1", "foo"))
        return "created"
    }

    @Transactional
    @Path("/create-dog-with-base")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun createDogWithBase() :String {
        dogWithBaseRepository.persist(DogWithBaseEntity("dog2", "bar"))
        return "created"
    }

    @Path("/show-dog")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun dog(): List<DogEntity> {
        return dogRepository.listAll()
    }

    @Path("/show-dog-with-base")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun dogWithBase(): List<DogWithBaseEntity> {
        return dogWithBaseRepository.listAll()
    }
}