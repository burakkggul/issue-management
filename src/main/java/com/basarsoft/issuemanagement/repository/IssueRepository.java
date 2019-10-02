package com.basarsoft.issuemanagement.repository;

import com.basarsoft.issuemanagement.model.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue, Long> {
}
