package org.acme

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class DogWithBaseEntity(
    @Id
    var id: String? = null,
    var name: String? = null,
    ) : BaseEntity() {
}