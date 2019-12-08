package com.burakgulonline.issuemanagement.repository;

import com.burakgulonline.issuemanagement.model.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue, Long> {
}
