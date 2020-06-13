package tr.com.burakgul.issuemanagement.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@ApiModel(value = "User Data Transfer Object")
public class UserDto {
    @ApiModelProperty(value = "ID")
    private Long id;

    @NotEmpty
    @NotNull
    @ApiModelProperty(required = true, value = "Name And Surname")
    private String nameSurname;
}
