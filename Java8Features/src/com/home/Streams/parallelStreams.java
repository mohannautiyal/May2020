package com.home.Streams;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Stream;

public class parallelStreams {

	public static void main(String[] args) {
	//	System.out.println(ForkJoinPool.commonPool().getParallelism());

	Stream stream1=	Stream.of("Manoj","Surbhi","Tanishq","Farhan","Ishwar");
	Stream stream2=	Stream.of("Manoj","Surbhi","Tanishq","Farhan","Ishwar");

    System.out.println("==========Sequential stream =========");
	stream1.forEach(System.out::println);
    System.out.println("==========Parllel stream =========");
    Stream.of("Manoj","Surbhi","Tanishq","Farhan","Ishwar").parallel().forEach(System.out::println);
    System.out.println("==========Parllel stream on Collection =========");

    Arrays.asList("Manoj","Surbhi","Tanishq","Farhan","Ishwar").parallelStream().forEach(System.out::println);
	}

}
