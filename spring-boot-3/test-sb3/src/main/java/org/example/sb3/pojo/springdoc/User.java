package org.example.sb3.pojo.springdoc;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "用户")
public class User implements Serializable {

    @Schema(name = "用户姓名", description = "用户姓名", required = true)
    private String userName;

    @Schema(name = "密码", description = "密码")
    private String passWord;

    @Schema(name = "电子邮箱", description = "电子邮箱")
    private String email;

    @Schema(name = "身份证", description = "身份证")
    private String idCard;

    @Schema(name = "", description = "手机号")
    private String phone;

}
