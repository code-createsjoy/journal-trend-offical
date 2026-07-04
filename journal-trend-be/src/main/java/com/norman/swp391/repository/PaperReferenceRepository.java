package com.norman.swp391.repository;

import com.norman.swp391.entity.PaperReference;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

/**
 * Repository cho PaperReference — quan hệ paper → referenced works.
 */
public interface PaperReferenceRepository extends JpaRepository<PaperReference, Long> {

    List<PaperReference> findByPaperId(Long paperId);

    boolean existsByPaperId(Long paperId);

    @Modifying
    @Transactional
    void deleteByPaperId(Long paperId);
}
