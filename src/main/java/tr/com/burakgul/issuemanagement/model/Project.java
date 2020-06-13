package tr.com.burakgul.issuemanagement.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "project")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Project extends BaseEntity {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(name = "project_name" , length = 100)
    private String projectName;


    @Column(name = "project_code", unique = true)
    private String projectCode;


    @JoinColumn(name = "manager_user_id")
    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    private User manager;


}
