package com.journal.common.constant;
/**
 * Desc 常量类
 * Created by GaoJean on 2017/10/26.
 */
public class Constant {


    /** 默认当前页码 **/
    public static final int    PAGE_CURRENT       = 1;
    /** 分页每页显示的记录数 **/
    public static final int    PAGE_SIZE          = 100;

    public static interface ServiceCode {
        //controller返回接口业务状态码
        public static final String CODE_0 = "0";
        public static final String CODE_1 = "1";
        public static final String CODE_2 = "2";
        public static final String CODE_3 = "3";
        public static final String CODE_4 = "4";
        public static final String CODE_5 = "5";
        public static final String CODE_6 = "6";
        public static final String CODE_9 = "9";

    }

    /**
     * session 和 cookie的Key
     */
    public static interface SESSION_AND_COOKIE {
        // 用户对象
        String SESSION_USER                 = "session_user";
        // 用户ID
        String SESSION_USER_ID              = "session_user_id";
        // 用户类型
        String SESSION_ROLE_ID              = "session_role_id";
        // 用户令牌
        String SESSION_TOKEN                = "session_token";
        //用户账号
        String SESSION_USER_ACCOUNT         = "session_user_account";
        //用户年纪
        String SESSION_USER_AGE             = "session_user_age";
        //用户昵称
        String SESSION_USER_NAME            = "session_user_name";
        // 手机号
        String SESSION_TEL                  = "session_tel";
        // 用户头像URL
        String SESSION_USER_PORTRAIT_URL     ="session_user_PortraitUrl";
    }


    public static interface  ROLE{
        //管理员
        public static final String ROLE_ADMIN = "1";
        //普通用户
        public static final String ROLE_USER = "2";
    }

    public static interface  APPROVAL_STATUS{
        //审批中
        public static final  String APPROVAL_PENDING = "1";

        //审批成功
        public static final String APPROVAL_SUCCESS = "2";

        //审批拒绝
        public static final String APPROVAL_REFUSED = "3";
    }
}
