package com.a101.carum.domain.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
@Getter
//@Table(uniqueConstraints = {@UniqueConstraint(name = "main_room_constraint", columnNames = {"room_id", "user_id"})})
public class UserDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGINT(20) UNSIGNED")
    private Long id;

    @Column(name = "money")
    private Long money = 0L;

    @OneToOne(targetEntity = User.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    //private Room mainRoom;
}
