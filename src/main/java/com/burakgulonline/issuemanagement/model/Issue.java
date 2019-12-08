package com.burakgulonline.issuemanagement.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "issue")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Issue extends BaseEntity {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(name = "description", length = 400)
    private String description;

    @Column(name = "details", length = 4000)
    private String details;

    @Column(name = "date")
    private Date date;
    @Column(name = "issue_status")
    @Enumerated(EnumType.STRING)
    private IssueStatus issueStatus; //Bir issue'nun durumunu takip edeceğiz. Enumaration ile bazı enumlar tanımladık.

    @JoinColumn(name = "assignee_user_id") //Column'un karşılığı da join column
    @ManyToOne(optional = true,fetch = FetchType.LAZY) //Birçok issue bir user'a bağlanabilir. Optional ise issue yaratılırken assignee vermesen de olur.
    //fetch ise select yapıldığında userdaki ilişkili kayıt da gelsin mi bunu belirtir. burada lazy getter kullanarak demek yani lazım olursa getirilir. eager ise her halükarda.
    private User assignee;

    @JoinColumn(name = "project_id")
    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    private Project project;


}
