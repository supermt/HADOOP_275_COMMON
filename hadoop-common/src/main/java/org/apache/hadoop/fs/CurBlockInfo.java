package org.apache.hadoop.fs;

public class CurBlockInfo
{
    public static boolean blockfirstsend = false;
    public static boolean blockfirstreceive = false;
    public static boolean tomodifybytes = false;
    public static boolean tomodifyendoff = false;
    public static boolean tomodifylen = false;
    public static long threadnum = 0;
    public static long curblockincrease = 0;
}