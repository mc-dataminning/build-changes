public interface tu {
   tu.b a();

   tu.b a(String var1);

   tu.b a(byte var1);

   tu.b a(short var1);

   tu.b a(int var1);

   tu.b a(long var1);

   tu.b a(float var1);

   tu.b a(double var1);

   tu.b a(byte[] var1);

   tu.b a(int[] var1);

   tu.b a(long[] var1);

   tu.b a(tz<?> var1, int var2);

   tu.a a(tz<?> var1);

   tu.a a(tz<?> var1, String var2);

   tu.a b(tz<?> var1, int var2);

   tu.b b();

   tu.b b(tz<?> var1);

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
