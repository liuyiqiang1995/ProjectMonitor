package com.taocares.monitor.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @Description: 项目成员
 * @Author: LiuYiQiang
 * @Date: 14:42 2019/7/9
 */
@Data
@NoArgsConstructor
@Table(name = "monitor_jira_member")
public class JiraMember {

    @Id
    @GenericGenerator(name = "id",strategy = "assigned")
    @GeneratedValue(generator = "id")
    @Column(name = "ID", unique = true, nullable = false, precision = 20)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PROJECTID", nullable = false)
    private JiraProject jiraProject;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "is_leader")
    private boolean leader;

}
