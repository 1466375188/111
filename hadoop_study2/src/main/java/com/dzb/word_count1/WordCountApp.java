package com.dzb.word_count1;



import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

public class WordCountApp {

	public static void main(String[] args) throws Exception {
		Job job=Job.getInstance();
		
		job.setJobName("word_count");
		job.setJarByClass(WordCountApp.class);
		
		
		TextInputFormat.setInputPaths(job, new Path("D:\\in"));
		job.setInputFormatClass(TextInputFormat.class);
		
		job.setMapperClass(WordCountMapper.class);
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(IntWritable.class);
		
		job.setReducerClass(WordCountReducer.class);
		job.setOutputKeyClass(Text.class);
		job.setMapOutputValueClass(IntWritable.class);
		
		TextOutputFormat.setOutputPath(job,new Path("D:\\out\\"+System.currentTimeMillis()));
		job.setOutputFormatClass(TextOutputFormat.class);
		
		job.submit();
		
	}

}
