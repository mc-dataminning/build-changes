public interface sx {
   sx.b a();

   sx.b a(String var1);

   sx.b a(byte var1);

   sx.b a(short var1);

   sx.b a(int var1);

   sx.b a(long var1);

   sx.b a(float var1);

   sx.b a(double var1);

   sx.b a(byte[] var1);

   sx.b a(int[] var1);

   sx.b a(long[] var1);

   sx.b a(tc<?> var1, int var2);

   sx.a a(tc<?> var1);

   sx.a a(tc<?> var1, String var2);

   sx.a b(tc<?> var1, int var2);

   sx.b b();

   sx.b b(tc<?> var1);

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
