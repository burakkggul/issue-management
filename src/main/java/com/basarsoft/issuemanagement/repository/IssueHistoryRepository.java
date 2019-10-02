package com.basarsoft.issuemanagement.repository;

import com.basarsoft.issuemanagement.model.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IssueHistoryRepository extends JpaRepository<IssueHistory, Long> {
    IssueHistory getByDate (IssueHistory issueHistory);
}
