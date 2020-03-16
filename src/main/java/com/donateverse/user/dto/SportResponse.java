package com.donateverse.user.dto;

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
public class SportResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String urlIcon;
}
