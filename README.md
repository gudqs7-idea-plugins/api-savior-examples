# 插件信息
[release-img]: https://img.shields.io/github/release/gudqs7-idea-plugins/api-savior.svg
[latest-release]: https://github.com/gudqs7-idea-plugins/api-savior/releases/latest
[plugin-img]: https://img.shields.io/badge/plugin-16860-orange.svg
[plugin]: https://plugins.jetbrains.com/plugin/16860
[jet-img]: https://img.shields.io/badge/plugin-Install%20Plugin-4597ff.svg
[jet]: http://localhost:63342/api/installPlugin?action=install&pluginId=gudqs7.github.io.doc-savior

[![GitHub release][release-img]][latest-release] [![Jetbrains Plugins][plugin-img]][plugin]
[![Version](http://phpstorm.espend.de/badge/16860/version)][plugin]  
[![Downloads](http://phpstorm.espend.de/badge/16860/downloads)][plugin]
[![Install Plugins][jet-img]][jet]

# 文档示例

## Restful 文档实例

### HTML 文档

> 相关文件位于 docs 下, 已使用 github pages 部署, 可通过 [文档首页](https://gudqs7-idea-plugins.github.io/api-savior-examples/) 直接访问

### Markdown 文档

- [用户接口.md](https://github.com/gudqs7-idea-plugins/api-savior-examples/blob/master/doc-example/restful/%E7%94%A8%E6%88%B7%E6%A8%A1%E5%9D%97/%E7%94%A8%E6%88%B7%E6%8E%A5%E5%8F%A3.md)
- [用户VIP接口.md](https://github.com/gudqs7-idea-plugins/api-savior-examples/blob/master/doc-example/restful/%E7%94%A8%E6%88%B7%E6%A8%A1%E5%9D%97/%E7%94%A8%E6%88%B7VIP%E6%8E%A5%E5%8F%A3.md)
- [下单接口.md](https://github.com/gudqs7-idea-plugins/api-savior-examples/blob/master/doc-example/restful/%E8%AE%A2%E5%8D%95%E6%A8%A1%E5%9D%97/%E4%B8%8B%E5%8D%95%E6%8E%A5%E5%8F%A3.md)
- [订单接口.md](https://github.com/gudqs7-idea-plugins/api-savior-examples/blob/master/doc-example/restful/%E8%AE%A2%E5%8D%95%E6%A8%A1%E5%9D%97/%E8%AE%A2%E5%8D%95%E6%8E%A5%E5%8F%A3.md)

其中用户接口对应部分Java代码如下  
[View on Github - UserController.java](https://github.com/gudqs7-idea-plugins/api-savior-examples/blob/master/src/main/java/cn/gudqs/example/docer/restful/user/controller/UserController.java)
```java
package cn.gudqs.example.docer.restful.user.controller;

import cn.gudqs.example.docer.base.BaseResponse;
import cn.gudqs.example.docer.restful.user.dto.request.CreateUserRequest;
import cn.gudqs.example.docer.restful.user.dto.request.QueryUserRequest;
import cn.gudqs.example.docer.restful.user.dto.request.UpdateUserRequest;
import cn.gudqs.example.docer.restful.user.dto.response.UserResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户接口
 *
 * @author gudqs7
 * @date 2022/5/7
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {


    /**
     * 查询用户列表(分页)
     *
     * @param queryUserRequest 查询条件+分页
     * @return 用户分页列表
     */
    @PostMapping("/queryUsers")
    public BaseResponse<List<UserResponse>> queryUsers(QueryUserRequest queryUserRequest) {
        /*
        方法名上右键, 生成 cURL, 结果如下:
        curl --location --request POST 'http://172.24.144.1:7086/api/v1/user/queryUsers' --header 'Content-Type: application/x-www-form-urlencoded' --data-urlencode 'pageNumber=1' --data-urlencode 'pageSize=20' --data-urlencode 'searchKeyword=模糊搜索词23' --data-urlencode 'gender=2' --data-urlencode 'ageStart=51' --data-urlencode 'ageEnd=40' --data-urlencode 'registerTimeStart=2022-05-09' --data-urlencode 'registerTimeEnd=2022-05-09'
        方法名上右键, 生成 cURL纯净版(即未标记必填的参数, 不生成), 结果如下:
        curl --location --request POST 'http://172.24.144.1:7086/api/v1/user/queryUsers' --header 'Content-Type: application/x-www-form-urlencoded' --data-urlencode 'pageNumber=1' --data-urlencode 'pageSize=20'

        提一句, cURL 可直接导入到 Postman, 在 Postman 按 Ctrl + o, 选择 Raw Text, 粘贴, 点两次橙色按钮确定即可.
         */
        return BaseResponse.success();
    }


    /**
     * 新增一个用户
     *
     * @param createUserRequest 用户信息
     * @return 操作是否成功
     * #hiddenResponse totalCount
     * #code 10001 用户昵称已存在
     * #code 10002 用户年龄范围无效 用户年龄需在0~200之间的数字
     */
    @PostMapping("/createUser")
    public BaseResponse<Boolean> createUser(CreateUserRequest createUserRequest) {
        return BaseResponse.success();
    }

}
```

### RPC 文档

- [库存接口.md](https://github.com/gudqs7-idea-plugins/api-savior-examples/blob/master/doc-example/rpc/%E5%BA%93%E5%AD%98%E6%A8%A1%E5%9D%97/%E5%BA%93%E5%AD%98%E6%8E%A5%E5%8F%A3.md)
- [物流查询接口.md](https://github.com/gudqs7-idea-plugins/api-savior-examples/blob/master/doc-example/rpc/%E7%89%A9%E6%B5%81%E6%A8%A1%E5%9D%97/%E7%89%A9%E6%B5%81%E6%9F%A5%E8%AF%A2%E6%8E%A5%E5%8F%A3.md)

其中库存接口对应Java代码如下  
[View on Github - StockService.java](https://github.com/gudqs7-idea-plugins/api-savior-examples/blob/master/src/main/java/cn/gudqs/example/docer/rpc/stock/service/StockService.java)
```java
package cn.gudqs.example.docer.rpc.stock.service;

import cn.gudqs.example.docer.base.BaseResponse;
import cn.gudqs.example.docer.rpc.stock.dto.request.DecrementStockRequest;
import cn.gudqs.example.docer.rpc.stock.dto.request.QueryStockRequest;
import cn.gudqs.example.docer.rpc.stock.dto.response.StockResponse;

/**
 * 库存接口
 *
 * @author wenquan
 * @date 2022/5/10
 * #module 库存模块
 */
public interface StockService {

    /**
     * 查询商品库存情况
     *
     * @param queryStockRequest 商品等信息
     * @return 库存情况
     * #hiddenResponse totalCount
     */
    BaseResponse<StockResponse> queryStock(QueryStockRequest queryStockRequest);

    /**
     * 扣减库存
     *
     * @param decrementStockRequest 商品等信息
     * @return 是否操作成功
     * #hiddenResponse totalCount
     */
    BaseResponse<Boolean> decrementStock(DecrementStockRequest decrementStockRequest);

}
```

### Postman 文档

> Postman文件位于 doc-example/postman 下, 可通过 Postman 主菜单 File -> Import -> File -> Upload Files 导入
> 也可以通过配置文件 `docer-config.properties` 添加配置 `postman.enable=true` 和 `postman.key=xxxxx` 来使其直接推送到你的 Workspace 下 

- [example.postman_collection.json](https://github.com/gudqs7-idea-plugins/api-savior-examples/blob/master/doc-example/postman/example.postman_collection.json)

