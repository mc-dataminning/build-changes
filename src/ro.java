public interface ro {
   ro.b a();

   ro.b a(String var1);

   ro.b a(byte var1);

   ro.b a(short var1);

   ro.b a(int var1);

   ro.b a(long var1);

   ro.b a(float var1);

   ro.b a(double var1);

   ro.b a(byte[] var1);

   ro.b a(int[] var1);

   ro.b a(long[] var1);

   ro.b a(rt<?> var1, int var2);

   ro.a a(rt<?> var1);

   ro.a a(rt<?> var1, String var2);

   ro.a b(rt<?> var1, int var2);

   ro.b b();

   ro.b b(rt<?> var1);

   public static enum a {
      a,
      b,
      c,
      d;
   }

   public static enum b {
      a,
      b,
      c;
   }
}
