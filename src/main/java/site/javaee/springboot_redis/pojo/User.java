package site.javaee.springboot_redis.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Tao
 * @create 2020/4/28 11:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("用户实体类")//swagger-models注释
public class User implements Serializable {
    @ApiModelProperty("ID")
    private Long id;
    @ApiModelProperty("用户名")//swagger-models 字段注释
    private String username;
    @ApiModelProperty("密码")
    private String password;
}
