import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class Client {
    static String DATA = "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +

            "";

    static String DATA1 = "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包" +
            "超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包超长数据包";

    public static void main(String[] args) throws IOException, InterruptedException {

        DatagramSocket datagramSocket = new DatagramSocket();
        KCP kcp = new KCP(1000) {
        kcp.NoDelay(1, 10, 2, 1);

            @Override
            protected void output(byte[] bytes, int size) {
                try {
//                    //发送头
//                    byte[] headBytes = BytesUtils.intToBytes(size);
//                    DatagramPacket packetHead = new DatagramPacket(headBytes, headBytes.length, InetAddress.getLocalHost() , 9090);
//                    datagramSocket.send(packetHead);
                    //发送数据体
                    //byte[] body = new byte[size];
                    //System.arraycopy(bytes,0,body,0,size);
                    DatagramPacket packetBody = new DatagramPacket(bytes, size, InetAddress.getLocalHost(), 9090);
                    datagramSocket.send(packetBody);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        };
        kcp.Update(System.currentTimeMillis());
        new Thread(() ->{
            try {
                while (true) {
                    kcp.Update(System.currentTimeMillis());
                    //头
//            byte[] buf = new byte[4];
//            DatagramPacket datagramPacketHead = new DatagramPacket(buf, buf.length);
//            socket.receive(datagramPacketHead);
//            int len = BytesUtils.bytesToInt(buf);

                    byte[] bufBody = new byte[1400]; //最大
                    DatagramPacket datagramPacket = new DatagramPacket(bufBody, bufBody.length);
                    datagramSocket.receive(datagramPacket);
                    kcp.Input(bufBody);
                    kcp.flush();
                    kcp.clientip = datagramSocket.getRemoteSocketAddress();

                    int offset = 0;
                    long conv_ = KCP.ikcp_decode32u(bufBody, offset);
                    offset += 4;

                    int cmd = KCP.ikcp_decode8u(bufBody, offset);
                    offset += 1;
                    //frg = ikcp_decode8u(data, offset);
                    offset += 1;
                    //wnd = ikcp_decode16u(data, offset);
                    offset += 2;
                    //ts = ikcp_decode32u(data, offset);
                    offset += 4;
                    long sn = KCP.ikcp_decode32u(bufBody, offset);
                    offset += 4;
                    //una = ikcp_decode32u(data, offset);
                    offset += 4;
                    long length = KCP.ikcp_decode32u(bufBody, offset);
                    offset += 4;

                    int s = kcp.PeekSize();
                    if(s > 0) {
                        byte[] bufBody1 = new byte[s];


                        int size = kcp.Recv(bufBody1);
                        System.out.println("接收端接收到的数据size：" + size);
                        System.out.println("接收端接收到的数据：" + new String(bufBody1));
                        System.out.println("receive阻塞了我，哈哈");
                    }
                }
            }catch (Exception e){

            }

        }).start();
        while(true) {
        kcp.Send(DATA1.getBytes(StandardCharsets.UTF_8));
        kcp.flush();
        Thread.sleep(10);
        }
    }
}
