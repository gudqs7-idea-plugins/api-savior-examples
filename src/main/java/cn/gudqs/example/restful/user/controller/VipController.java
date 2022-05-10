package cn.gudqs.example.restful.user.controller;

import cn.gudqs.example.base.BaseResponse;
import cn.gudqs.example.restful.user.dto.request.OpenVipRequest;
import cn.gudqs.example.restful.user.dto.request.QueryVipUserRequest;
import cn.gudqs.example.restful.user.dto.request.RenewVipRequest;
import cn.gudqs.example.restful.user.dto.response.VipUserResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户VIP接口
 *
 * @author gudqs7
 * @date 2022/5/7
 */
@RestController
@RequestMapping("/api/v1/vip")
public class VipController {


    /**
     * 查询VIP用户信息列表(分页)
     *
     * @param queryVipUserRequest 查询条件+分页参数
     * @return VIP用户信息分页列表
     */
    @PostMapping("/queryVipUsers")
    public BaseResponse<List<VipUserResponse>> queryVipUsers(QueryVipUserRequest queryVipUserRequest) {
        return BaseResponse.success();
    }

    /**
     * 为用户开通VIP
     *
     * @param openVipRequest 开通VIP相关信息(时长/类型等)
     * @return 操作是否成功
     * #hiddenResponse totalCount
     * #code 10021 用户余额不足
     * #code 10022 VIP类型不存在
     * #code 10023 开通时长不能为负数
     */
    @PostMapping("/openVip")
    public BaseResponse<Boolean> openVip(OpenVipRequest openVipRequest) {
        // code 瞎扯的, 莫较真.
        return BaseResponse.success();
    }

    /**
     * 为用户续费VIP
     *
     * @param renewVipRequest 续费时长等信息
     * @return 操作是否成功
     * #hiddenResponse totalCount
     * #code 10021 用户余额不足
     * #code 10023 开通时长不能为负数
     */
    @PostMapping("/renewVip")
    public BaseResponse<Boolean> renewVip(RenewVipRequest renewVipRequest) {
        // code 瞎扯的, 莫较真.
        return BaseResponse.success();
    }


}
