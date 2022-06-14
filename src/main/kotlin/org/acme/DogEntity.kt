package org.acme

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Version

@Entity
class DogEntity(
    @Id
    var id: String? = null,
    var name: String? = null,
    @Version
    var version: Long = 0
    )  {
}