public interface uk {
   uk.b a();

   uk.b a(String var1);

   uk.b a(byte var1);

   uk.b a(short var1);

   uk.b a(int var1);

   uk.b a(long var1);

   uk.b a(float var1);

   uk.b a(double var1);

   uk.b a(byte[] var1);

   uk.b a(int[] var1);

   uk.b a(long[] var1);

   uk.b a(up<?> var1, int var2);

   uk.a a(up<?> var1);

   uk.a a(up<?> var1, String var2);

   uk.a b(up<?> var1, int var2);

   uk.b b();

   uk.b b(up<?> var1);

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
