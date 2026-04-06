package com.lti.ats.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.math.BigDecimal
import java.time.Instant

@Entity
@Table(name = "job_positions")
class JobPosition(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false)
    var title: String = "",

    @Column(columnDefinition = "text")
    var description: String? = null,

    @Column(nullable = false)
    var status: String = "",

    var department: String? = null,
    var location: String? = null,

    @Column(precision = 12, scale = 2)
    var salaryMin: BigDecimal? = null,

    @Column(precision = 12, scale = 2)
    var salaryMax: BigDecimal? = null,

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    var createdAt: Instant? = null,

    @UpdateTimestamp
    @Column(nullable = false)
    var updatedAt: Instant? = null,
)
