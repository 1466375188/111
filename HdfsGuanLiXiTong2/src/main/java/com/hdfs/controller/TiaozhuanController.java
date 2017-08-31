package com.hdfs.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class TiaozhuanController {
	
	@RequestMapping("tiaozhuan")
	public String tiaozhuan(){
		return "index";
		
	}

//	@RequestMapping("asda")
//	public String asda(){
//		System.out.println("asdas ");
//		return "index";
//		
//	}
	
//	@RequestMapping("asda")
//    public ModelAndView  handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//
//        MultipartResolver resolver = new CommonsMultipartResolver(request.getSession().getServletContext());
//
//        MultipartHttpServletRequest multipartRequest = resolver.resolveMultipart(request);
//
//         MultipartFile file = multipartRequest.getFile("fileselect[]");
//         System.out.println(file);
//		return null;
//		
//	}
	
//	// 上传
//	@RequestMapping("asda")
//	public String upload(@RequestParam(value = "fileselect") MultipartFile[] fileselect,
//			 HttpServletRequest request)
//			 throws IllegalStateException, IOException {
//			 // 获取文件的名字
//			// String filename = fileselect[].getOriginalFilename();
//			 for(MultipartFile f:fileselect){
//				 String filename=f.getOriginalFilename();
//				 System.out.println(filename);
//			 }
////			// 创建文件的上传路径
////			 String filepath = request.getServletContext().getRealPath("/upload");
////			 // 拼接文件的全路径
////			 File uploadfile = new File(filepath + "/" + filename);
////			 // 上传文件
////			 file.transferTo(uploadfile);
//			 System.out.println("上传完成");
//			 return null;
//			 }
	
//	public String edit(@RequestParam("fileselect[]") CommonsMultipartFile[] pic, HttpServletRequest request) throws Exception {
//        for (int i=0;i<pic.length;i++){
//        	
//            FileItem fi = pic[i].getFileItem();
//                   File fi1=new File(request.getRealPath("/")+"/file/"+pic.length);
//            
//        }
//        System.out.println("file=====================");
//        return "gouwuche/edit";
//    }
		 
	@RequestMapping("asda")
	  public String upload(@RequestParam("fileselect[]") MultipartFile[] fileselect , HttpServletRequest request,HttpServletResponse response) throws Exception {  
		
		System.out.println(fileselect.toString());
		for (int i=0;i<fileselect.length;i++){
			System.out.println("sssssssssssssssssssssssssssss");
            String fi = fileselect[i].getName();
               System.out.println(fi+"ddddddddddddddddd");
        }
		
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println(fileselect.getClass());
	System.out.println();
           
       
         
		return null;
		}}

          
