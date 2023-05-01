package top.chengyunlai.controller;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import top.chengyunlai.entity.User;

import javax.print.attribute.standard.MediaSize;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@RestController
@RequestMapping("/user")
@Api(tags = "用户接口")
public class UserController {
    @ApiOperation(value = "查询所有用户",
    notes = "描述：只有管理员才能查询询数据库中所有对应的用户")
    @GetMapping("/all")
    public String getUserAll(){
        return "Success";
    }


    @ApiOperation(value = "根据用户id查询用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "用户id",dataType = "String",defaultValue = "1",paramType = "path")
    })
    @GetMapping("/{id}")
    public String getUserById(@PathVariable String id){
        return "Success";
    }

    @PostMapping("/save")
    @ApiOperation(value = "保存用户信息")
    public String save(@RequestBody User user){
        return "Success";
    }

    @ApiOperation(value = "根据用户id删除用户信息")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "id",value = "用户id",required = true,defaultValue = "1")
    )
    @ApiResponses({
            @ApiResponse(code = 2023,message = "错误咯"),
            @ApiResponse(code = 2024,message = "你错咯")
        })
    @DeleteMapping("{/id}")
    public String deleteById(@PathVariable String id){
        return "Success";
    }
}
