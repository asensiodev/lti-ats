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
import java.time.LocalDateTime

@Entity
@Table(name = "interviews")
class Interview(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(name = "application_id", nullable = false)
    var applicationId: Long = 0L,

    var interviewDate: LocalDateTime? = null,

    var interviewType: String? = null,
    var location: String? = null,
    var interviewer: String? = null,

    @Column(columnDefinition = "text")
    var notes: String? = null,

    var score: Int? = null,

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    var createdAt: Instant? = null,

    @UpdateTimestamp
    @Column(nullable = false)
    var updatedAt: Instant? = null,
)
