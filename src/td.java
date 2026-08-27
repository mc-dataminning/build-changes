public interface td {
   td.b a();

   td.b a(String var1);

   td.b a(byte var1);

   td.b a(short var1);

   td.b a(int var1);

   td.b a(long var1);

   td.b a(float var1);

   td.b a(double var1);

   td.b a(byte[] var1);

   td.b a(int[] var1);

   td.b a(long[] var1);

   td.b a(ti<?> var1, int var2);

   td.a a(ti<?> var1);

   td.a a(ti<?> var1, String var2);

   td.a b(ti<?> var1, int var2);

   td.b b();

   td.b b(ti<?> var1);

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
