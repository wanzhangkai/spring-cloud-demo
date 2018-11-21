package com.pipikai.order.utils;


import com.pipikai.order.vo.ResultVO;

/**
 * Created by wanzhangkai
 * 2018/11/21 17:33
 * Email: zhangkaiwan@qq.com
 */
public class ResultVOUtils {

    public static ResultVO success(Object o) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(o);
        return resultVO;
    }

}
