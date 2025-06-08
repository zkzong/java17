package cn.itcast.account.service;

import io.seata.rm.tcc.api.TwoPhaseBusinessAction;

public interface AccountService {
    /**
     * 从用户账户中扣款
     */
    @TwoPhaseBusinessAction(name = "deduct", commitMethod = "confirm", rollbackMethod = "cancel")
    void deduct(String userId, int money);
}