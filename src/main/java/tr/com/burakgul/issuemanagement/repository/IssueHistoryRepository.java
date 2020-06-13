package tr.com.burakgul.issuemanagement.repository;

import tr.com.burakgul.issuemanagement.model.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IssueHistoryRepository extends JpaRepository<IssueHistory, Long> {
    IssueHistory getByDate (IssueHistory issueHistory);
}
