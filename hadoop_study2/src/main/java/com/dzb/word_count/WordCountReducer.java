package com.dzb.word_count;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class WordCountReducer extends Reducer<Text,IntWritable,Text,IntWritable>{

	/*
	 * Text---String ---单词----map的输出key类型,reduce的出入key类型
	 * IntWritable---单词个数map的输出value,reduce的输入value
	 * 
	 * Text---String ---单词----reduce的输出key类型
	 * IntWritable---单词个数---reduce的输出value
	 * 
	 * 
	 * */
	@Override
	protected void reduce(Text word, Iterable<IntWritable> arg1,
			Reducer<Text, IntWritable, Text, IntWritable>.Context context) throws IOException, InterruptedException {
		//word  Text类型 ---单词
				//arg1  集合---单词个数的集合
				//context---上下文
			
				int sum=0;
				for(IntWritable intWritable:arg1){
					int i=intWritable.get();
					sum+=i;
				}
		
				context.write(word, new IntWritable(sum));
	}
}
