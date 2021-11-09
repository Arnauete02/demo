package com.example.demo.domain.model;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "file")
public class File {
    @Id
    public UUID fileid;

    public String contentType;

    @Lob
    @Type(type="org.hibernate.type.BinaryType")
    public byte[] data;
}
