public interface ts {
   ts.b a();

   ts.b a(String var1);

   ts.b a(byte var1);

   ts.b a(short var1);

   ts.b a(int var1);

   ts.b a(long var1);

   ts.b a(float var1);

   ts.b a(double var1);

   ts.b a(byte[] var1);

   ts.b a(int[] var1);

   ts.b a(long[] var1);

   ts.b a(tx<?> var1, int var2);

   ts.a a(tx<?> var1);

   ts.a a(tx<?> var1, String var2);

   ts.a b(tx<?> var1, int var2);

   ts.b b();

   ts.b b(tx<?> var1);

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
