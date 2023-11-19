package com.complete.rt.domain.file.repository;

import com.complete.rt.db.file.File;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FileRepository extends JpaRepository<File, Long> {
    Optional<File> findByUid(String uid);
}
