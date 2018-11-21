package com.pipikai.product.controller;

import com.pipikai.product.pojo.ProductCategory;
import com.pipikai.product.pojo.ProductInfo;
import com.pipikai.product.servece.CategoryService;
import com.pipikai.product.servece.ProductService;
import com.pipikai.product.utils.ResultVOUtils;
import com.pipikai.product.vo.ProductInfoVO;
import com.pipikai.product.vo.ProductVO;
import com.pipikai.product.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: wanzhangkai
 * @Email: zhangkaiwan@qq.com
 * @Date: 2018/11/18 15:46
 */
@Slf4j
@RestController
@RequestMapping("/product/")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    /**
     * 商品列表
     * GET /product/list
     * <p>
     * 1.查询所有在架的商品
     * 2.获取类目type列表
     * 3.查询类目
     * 4.构造数据
     */
    @GetMapping("/list")
    public ResultVO<ProductVO> list() {
        //1. 查询所有在架的商品
        List<ProductInfo> productInfoList = productService.findUpAll();

        //2. 获取类目type列表
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(ProductInfo::getCategoryType).collect(Collectors.toList());

        //3. 从数据库查询类目
        List<ProductCategory> categoryList = categoryService.findByCategoryType(categoryTypeList);

        //4. 构造数据
        List<ProductVO> productVoList = new ArrayList<>();
        for (ProductCategory productCategory : categoryList) {
            ProductVO productVo = new ProductVO();
            productVo.setCategoryId(productCategory.getCategoryId());
            productVo.setCategoryName(productCategory.getCategoryName());
            List<ProductInfoVO> productInfoVoList = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {
                if (productCategory.getCategoryType().equals(productInfo.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVoList.add(productInfoVO);
                }
            }
            productVo.setProductInfoList(productInfoVoList);
            productVoList.add(productVo);
        }

        return ResultVOUtils.success(productVoList);
    }


}
