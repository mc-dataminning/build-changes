public interface th {
   th.b a();

   th.b a(String var1);

   th.b a(byte var1);

   th.b a(short var1);

   th.b a(int var1);

   th.b a(long var1);

   th.b a(float var1);

   th.b a(double var1);

   th.b a(byte[] var1);

   th.b a(int[] var1);

   th.b a(long[] var1);

   th.b a(tm<?> var1, int var2);

   th.a a(tm<?> var1);

   th.a a(tm<?> var1, String var2);

   th.a b(tm<?> var1, int var2);

   th.b b();

   th.b b(tm<?> var1);

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
