package com.dzb.word_count1;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class WordCountReducer extends Reducer<Text,IntWritable,Text,IntWritable>{
		
	
	@Override
	protected void reduce(Text word, Iterable<IntWritable> arg1,
			Reducer<Text, IntWritable, Text, IntWritable>.Context context) throws IOException, InterruptedException {
		
		int sum=0;
		for(IntWritable intWritable:arg1){
			int i=intWritable.get();
			sum+=i;
		}
		context.write(word,new IntWritable(sum));
	}
}
