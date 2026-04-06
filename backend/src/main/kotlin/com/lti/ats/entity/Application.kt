package com.lti.ats.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.Instant
import java.time.LocalDate

@Entity
@Table(name = "applications")
class Application(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(name = "candidate_id", nullable = false)
    var candidateId: Long = 0L,

    @Column(name = "job_position_id", nullable = false)
    var jobPositionId: Long = 0L,

    @Column(nullable = false)
    var status: String = "",

    var applicationDate: LocalDate? = null,

    @Column(columnDefinition = "text")
    var notes: String? = null,

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    var createdAt: Instant? = null,

    @UpdateTimestamp
    @Column(nullable = false)
    var updatedAt: Instant? = null,
)
