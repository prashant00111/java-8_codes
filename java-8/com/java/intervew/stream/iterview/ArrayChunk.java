package com.java.intervew.stream.iterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayChunk {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int chunkSize = 3;


        List<int[]> chunks = chunkArray(array, chunkSize);

        for (int[] chunk : chunks) {
            System.out.println(Arrays.toString(chunk));
        }
    }

    public static List<int[]> chunkArray(int[] array, int chunkSize) {
        if (chunkSize <= 0) {
            throw new IllegalArgumentException("Chunk size should be greater than 0");
        }

        int length = array.length;
        int numOfChunks = (int) Math.ceil((double) length / chunkSize);

        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < numOfChunks; i++) {
            int start = i * chunkSize;
            int end = Math.min((i + 1) * chunkSize, length);
            int[] chunk = Arrays.copyOfRange(array, start, end);
            result.add(chunk);
        }

        return result;
    }
}
