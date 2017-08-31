package com.hdfs.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Request;

import org.apache.hadoop.classification.InterfaceAudience.Private;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.hdfs.entity.User;
import com.hdfs.entity.Xianshi;
import com.hdfs.service.UserService;

import net.sf.jsqlparser.statement.create.table.Index;


@Controller
@RequestMapping("/")
public class TiaozhuanController {
	@Autowired
    private UserService uService;	
	@RequestMapping("tiaozhuan")
	public String tiaozhuan(){
		return "index";
		
	}

	@RequestMapping("login")
	public String login(User user,HttpServletRequest request,String name,String pwd) throws IOException, InterruptedException, URISyntaxException{
		System.out.println(name+pwd);
		user.setName(name);
		List list=uService.login(user);
		if (list.size()!=0) {
			User user1=(User)list.get(0);
			if(user1!=null&&user1.getPwd().equals(pwd)){
				request.setAttribute("user1", user1);
				System.out.println("");
				return testls( request);
			}		
		}
								
		return "error";
	}
	//上传
	@RequestMapping("asda")
	@ResponseBody
	public String oneFileUpload(MultipartFile fileList) throws IOException, InterruptedException, URISyntaxException {
		System.out.println(fileList.getOriginalFilename());
		System.out.println(fileList.getInputStream());
		// 获取文件的名字
		String filename = fileList.getOriginalFilename();
		// 创建文件的上传路径
		// 拼接文件的全路径
		File uploadfile = new File("D:\\out\\" + filename);
		// 上传文件
		fileList.transferTo(uploadfile);
		System.out.println("上传完成");
		FileSystem fileSystem = FileSystem.get(new URI("hdfs://centos201:9000"), new Configuration(), "centos");
		// 创建一个记录，然后打开输出流，往数据输出流中写入数据
		FSDataOutputStream fsDataOutputStream = fileSystem
				.create(new Path("hdfs://centos201:9000/xiangmu/" + filename));
		FileInputStream fileInputStream = new FileInputStream("D:\\out\\" + filename);
		// 流式传输的标准代码
		int len = 0;
		byte[] bytes = new byte[4 * 1024];// 4KB
		while ((len = fileInputStream.read(bytes)) >= 0) {
			fsDataOutputStream.write(bytes, 0, len);
		}
		fileInputStream.close();
		fsDataOutputStream.close();
		return "D:\\out\\" + filename;
	}
	//查看
	@RequestMapping("chakan")
	public String testls(HttpServletRequest request) throws IOException, InterruptedException, URISyntaxException {
		FileSystem fileSystem=FileSystem.get(new URI("hdfs://centos201:9000"),new Configuration(),"centos");
		List list=printLs(fileSystem,"/xiangmu/");
		request.setAttribute("list",list);
		return "chakan";
		
		
	}
	public List printLs(FileSystem fileSystem,String path) throws FileNotFoundException, IllegalArgumentException, IOException{
		List<Xianshi> list=new ArrayList();
		
		FileStatus[] liStatus=fileSystem.listStatus(new Path(path));
		for(FileStatus fileStatus:liStatus){
			Xianshi xianshi=new Xianshi();
			String a=fileStatus.getPath().toString();
			String str=a.split("/")[4];
			xianshi.setName(str);
			xianshi.setYonghu(fileStatus.getOwner());
			xianshi.setDaxiao(fileStatus.getLen());
			SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd");
			Date date=new Date(fileStatus.getModificationTime());
			xianshi.setShijian(dateFormater.format(date));
			xianshi.setLujing(fileStatus.getPath().toString());
//			String aaa="文件名"+str+"用户"+fileStatus.getOwner()+"文件大小"+fileStatus.getLen()+"修改时间"+new Date(fileStatus.getModificationTime());
			list.add(xianshi);
			//System.out.println("副本数"+fileStatus.getReplication());
			//System.out.println("权限"+fileStatus.getPermission());
			///System.out.println("用户"+fileStatus.getOwner());
			//System.out.println("路径"+fileStatus.getPath());
			//System.out.println("用户组"+fileStatus.getGroup());
			//System.out.println("块大小"+fileStatus.getBlockSize());
			//System.out.println("文件大小"+fileStatus.getLen());
			//System.out.println("访问时间"+new Date(fileStatus.getAccessTime()));
			//System.out.println("修改时间"+new Date(fileStatus.getModificationTime()));
		}
		return list;
	}
	
	
	
	
	
	
	
		//下载
	@RequestMapping("xiazai")
	public String test007(HttpServletRequest request,String name) throws Exception {
		//String name=(String) request.getAttribute("name");
		System.out.println(name);
		FileSystem fileSystem=FileSystem.get(new URI("hdfs://centos201:9000"),new Configuration(),"centos");
		FSDataInputStream inputStream = fileSystem.open(new Path("hdfs://centos201:9000/xiangmu/"+name));

		FileOutputStream fileOutputStream = new FileOutputStream("D:\\out1\\"+name);

		// 流式传输的标准代码
		int len = 0;
		byte[] bytes = new byte[4 * 1024];// 4KB
		while ((len = inputStream.read(bytes)) >= 0) {
			fileOutputStream.write(bytes, 0, len);
		}

		fileOutputStream.close();
		inputStream.close();
		return "chenggong";
	}
	
}
