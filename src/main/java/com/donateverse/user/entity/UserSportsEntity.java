package com.donateverse.user.entity;

import com.donateverse.user.entity.enums.SportingLevel;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author flaoliveira
 * @version : $<br/>
 * : $
 * @since 20/10/2019 22:47
 */
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users_sports")
public class UserSportsEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @Id
    @ManyToOne
    @JoinColumn(name = "sport_id")
    private SportEntity sport;

    @NotNull
    @Enumerated(EnumType.STRING)
    private SportingLevel level;

    @NotNull
    private Integer months;

}
