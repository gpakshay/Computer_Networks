public class CRC16CCITT{
public static void main(String[] args){
int crc = OxFFFF;
int polynomial = Ox 1021; 
byte[] testBytes = "123456789".getBytes("ASCII");
byte[] bytes = args[0].getBytes();
for (byte b : bytes) 
{
for (int i = 0; i < 8; i++) 
{
boolean bit = ((b >>(7-i) & 1) ==1);
boolean cl5 = ((crc >> 15 & 1) == 1);
crc <<= l;
if (c15^bit) crc^= polynomial;
}
}
crc &= 0xffff;
StdOut.println("CRC16-CCITT = " +Integer.toHexString(crc));
}
}
