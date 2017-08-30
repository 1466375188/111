package com.dzb.word_count;

import java.io.IOException;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

public class WordCountApp {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		//构造job对象
		Job job = Job.getInstance();
			//设置任务名,任务类
		job.setJobName("word_count");
		job.setJarByClass(WordCountApp.class);
		
		
		//设置输入
		TextInputFormat.setInputPaths(job,new Path("D:\\in"));//设置输入路径
		job.setInputFormatClass(TextInputFormat.class);//设置读取格式
		
		
		//设置map
		job.setMapperClass(WordCountMapper.class);//设置map类
		job.setMapOutputKeyClass(Text.class);//设置map输出key
		job.setMapOutputValueClass(IntWritable.class);//设置map输出value
		
		
		
		//设置reduce
		job.setReducerClass(WordCountReducer.class);;//设置reduce类
		job.setOutputKeyClass(Text.class);//设置reduce输出key
		job.setOutputValueClass(IntWritable.class);//设置reduce输出value
		
		
		//设置输出
		TextOutputFormat.setOutputPath(job,new Path("D:\\out\\"+System.currentTimeMillis()));
		job.setOutputFormatClass(TextOutputFormat.class);
		
		//提交任务
//		job.submit();
		
		job.waitForCompletion(true);
	
	}

}
