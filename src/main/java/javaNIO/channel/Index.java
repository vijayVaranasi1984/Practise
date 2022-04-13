package javaNIO.channel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.WritableByteChannel;

//In Java NIO, the channel is a medium used to transports the data efficiently between the entity and byte buffers.
// It reads the data from an entity and places it inside buffer blocks for consumption.
//
//Channels act as gateway provided by java NIO to access the I/O mechanism.
// Usually channels have one-to-one relationship with operating system file descriptor for providing the platform independence operational feature.
public class Index {
    public static void main(String args[]) throws IOException {
        FileInputStream input = new FileInputStream ("D:\\Project\\Practise\\src\\javaNIO\\testin.txt"); // Path of Input text file
        ReadableByteChannel source = input.getChannel();
        FileOutputStream output = new FileOutputStream ("D:\\Project\\Practise\\src\\javaNIO\\testout.txt"); // Path of Output text file
        WritableByteChannel destination = output.getChannel();
        copyData(source, destination);

        //FileChannel: The file channel is used for reading the data from the files. It's object can be created only by calling the getChannel() method. We cannot create FileChannel object directly.

        //FileInputStream fis = new FileInputStream("D:\\Project\\Practise\\src\\javaNIO\\channel\\testin.txt"); // Path of Input text file
        //ReadableByteChannel rbc = fis.getChannel();


        //DatagramChannel: The datagram channel can read and write the data over the network via UDP (User Datagram Protocol). It uses the factory methods for creating the new object.
         //The syntax used for opening the DatagramChannel:

//        DatagramChannel ch = DatagramChannel.open();
//        The syntax used for closing the DatagramChannel:

//        DatagramChannel ch = DatagramChannel.close();


        //SocketChannel: The datagram channel can read and write the data over the network via TCP (Transmission Control Protocol). It also uses the factory methods for creating the new object.
        // The syntax used for opening the SocketChannel:

//        SocketChannel ch = SocketChannel.open();
//        ch.connect(new InetSocketAddress("somehost", someport));
//        The syntax used for closing the SocketChannel:
//        SocketChannel ch = SocketChannel.close();
//        ch.connect(new InetSocketAddress("somehost", someport));


        //ServerSocketChannel: The ServerSocketChannel allows user to listen the incoming TCP connections, same as a web server. For every incoming connection a SocketChannel is created.
        //The syntax used for opening the ServerSocketChannel:

//        ServerSocketChannel ch = ServerSocketChannel.open();
//        ch.socket().bind (new InetSocketAddress (somelocalport));
        //The syntax used for closing the ServerSocketChannel:

//        ServerSocketChannel ch = ServerSocketChannel.close();
//        ch.socket().bind (new InetSocketAddress (somelocalport));


        source.close();
        destination.close();
    }
    private static void copyData(ReadableByteChannel src, WritableByteChannel dest) throws IOException
    {
        ByteBuffer buffer = ByteBuffer.allocateDirect(20 * 1024);
        while (src.read(buffer) != -1)
        {
            // The buffer is used to drained
            buffer.flip();
            // keep sure that buffer was fully drained
            while (buffer.hasRemaining())
            {
                dest.write(buffer);
            }
            buffer.clear(); // Now the buffer is empty, ready for the filling
        }
    }
}
