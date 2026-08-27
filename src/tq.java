public interface tq {
   tq.b a();

   tq.b a(String var1);

   tq.b a(byte var1);

   tq.b a(short var1);

   tq.b a(int var1);

   tq.b a(long var1);

   tq.b a(float var1);

   tq.b a(double var1);

   tq.b a(byte[] var1);

   tq.b a(int[] var1);

   tq.b a(long[] var1);

   tq.b a(tv<?> var1, int var2);

   tq.a a(tv<?> var1);

   tq.a a(tv<?> var1, String var2);

   tq.a b(tv<?> var1, int var2);

   tq.b b();

   tq.b b(tv<?> var1);

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
