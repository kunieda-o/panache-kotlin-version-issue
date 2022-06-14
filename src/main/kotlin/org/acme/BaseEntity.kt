package org.acme

import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntityBase
import javax.persistence.MappedSuperclass
import javax.persistence.Version

@MappedSuperclass
open class BaseEntity : PanacheEntityBase{
    @Version
    var version: Long = 0
}