package com.alura.apiflix.adapters.dataproviders.entity

import java.net.URL
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "tb_video")
class Video(
    @Id
    @Column
    var id: Int,
    @Column
    var titulo: String,
    @Column
    var descricao: String,
    @Column
    var url: URL
)