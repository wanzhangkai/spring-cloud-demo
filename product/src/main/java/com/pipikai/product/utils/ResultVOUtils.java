package com.pipikai.product.utils;

import com.pipikai.product.vo.ResultVO;

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
