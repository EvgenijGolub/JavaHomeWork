package com.pb.golub.hw9;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileNumbers {
    public static void createNumbersFile(){
        int q = 1;
        int w = 99;
        int[][] A = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                A[i][j] = q + (int) (Math.random() * (w - q) + 1);
            }
        }
        try (Writer writer = new FileWriter("files/numbers.txt")){
            writer.write(A[10][10]);
        } catch (Exception e){
            e.getStackTrace();
        }
    }

    public static void createOddNumbersFile(){
        int[][] A = new int[10][10];
        try (Reader reader = new FileReader("files/numbers.txt")){
            reader.read(A);
        } catch(Exception e){
            e.printStackTrace();
        }
        for (int i = 0; i < A.length; i++){
            if(i%2 == 1){
                A[10][10] = 0;
            }
        }
        try (Writer writer = new FileWriter("files/numbers.txt")){
            writer.write(A[10][10]);
        } catch (Exception e){
            e.getStackTrace();
        }
    }


    public static void main(String[] args){
        createNumbersFile();
        createOddNumbersFile();
    }
}