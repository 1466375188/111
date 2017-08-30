package com.dzb.word_count;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class WordCountMapper extends Mapper<LongWritable,Text,Text,IntWritable> {
/*
 * LongWritable ------lone 行首字节在文件中的偏移量    输入key
 * Text---------------String 一行文本  输入value
 * 
 * 
 * Text----------------String 单词  输出key
 * IntWritable---------int 单词个数  输出value
 * 
 * */
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		//key---偏移量
		//value --一行文本
		//context----上下文
		String line=value.toString();//把一个text对象转为String
		String[]split=line.split("\\W+");//将一行文本切分为打次数组
		for(String word:split){
			//把每一个单词写出去
			context.write(new Text(word),new IntWritable(1));
			//第一个参数是单词
			//第二个参数是个数
			
		}
		
	}
	
}
