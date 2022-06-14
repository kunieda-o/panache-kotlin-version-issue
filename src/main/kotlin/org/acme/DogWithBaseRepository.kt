package org.acme

import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepositoryBase
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class DogWithBaseRepository : PanacheRepositoryBase<DogWithBaseEntity, String> {
}