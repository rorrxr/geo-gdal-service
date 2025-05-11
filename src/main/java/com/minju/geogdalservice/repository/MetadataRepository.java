package com.minju.geogdalservice.repository;

import com.minju.geogdalservice.entity.Metadata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MetadataRepository extends JpaRepository<Metadata, Long> {
    List<Metadata> findByFileName(String fileName);
    List<Metadata> findByBandCount(int bandCount);

    // MetadataEntity 테이블에서 조건 중 null이 아니고 일치하는 항목만 조회
    @Query("SELECT m FROM Metadata m WHERE " +
            "(:fileName IS NULL OR m.fileName = :fileName) AND " +
            "(:bandCount IS NULL OR m.bandCount = :bandCount) AND " +
            "(:width IS NULL OR m.width = :width)")
    List<Metadata> search(
            @Param("fileName") String fileName,
            @Param("bandCount") Integer bandCount,
            @Param("width") Integer width
    );
}