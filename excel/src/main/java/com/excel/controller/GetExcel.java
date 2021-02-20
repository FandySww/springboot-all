package com.excel.controller;

import com.excel.utils.ExcelUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;
import java.util.List;

/**
 * @Author fandayong
 * @Date 2021/2/19 8:10 PM
 * @description
 */
@RestController
@RequestMapping(value="/analysis/excel")
public class GetExcel {
    // https://blog.csdn.net/a_helloword/article/details/89296414
    @PostMapping("/upload")
    public String uploadCourseExcel(HttpServletRequest request) {
        MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
        MultipartFile file = multipartHttpServletRequest.getFile("courseFile");
        if(file.isEmpty()) {
            return "redirect:/admin/course/list";
        }
        try {
            InputStream inputStream = file.getInputStream();
            List<List<Object>> list = ExcelUtils.getCourseListByExcel(inputStream,file.getOriginalFilename());
            inputStream.close();
            for (int i = 0; i < list.size(); i++) {
                List<Object> courseList = list.get(i);
            }
        } catch (Exception e) {
            return "redirect:/admin/course/list";
        }
        return "redirect:/admin/course/list";
    }

}
