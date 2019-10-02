package com.basarsoft.issuemanagement.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass //Bu bu class'ın tüm tablolarda ortak olmasını sağlıyor.
public abstract class BaseEntity implements Serializable { //Metod gövdesi bulundurmak isteyebiliriz override etmek isteyebiliriz o yüzden abstract bir klas olarak tanımlıyoruz.

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt; //Ne zaman oluşturuldu.
    @Column(name = "created_by", length = 100)
    private String createdBy; //Kim tarafından oluşturuldu.
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt; //Ne zaman güncellendi.
    @Column(name = "updated_by", length = 100)
    private String updateBy; //Kim tarafından güncellendi.
    @Column(name = "status")
    private Boolean status; //Kaydın aktiflik durumu.

}
