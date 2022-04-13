package javaNIO.buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//Buffers are defined inside java.nio package.
// It defines the core functionality which is common to all buffers: limit, capacity and current position.
//
//Java NIO buffers are used for interacting with NIO channels.
// It is the block of memory into which we can write data, which we can later be read again.
// The memory block is wrapped with a NIO buffer object, which provides easier methods to work with the memory block.
public class Index {
    public static void main(String[] args) {
        Path file = null;
        BufferedReader bufferedReader = null;
        try {
            file = Paths.get("D:\\Project\\Practise\\src\\javaNIO\\testout.txt");
            InputStream inputStream = Files.newInputStream(file);
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            System.out.println("Reading the Line of testout.txt file: "+ bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
