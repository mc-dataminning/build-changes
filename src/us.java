public interface us {
   us.b a();

   us.b a(String var1);

   us.b a(byte var1);

   us.b a(short var1);

   us.b a(int var1);

   us.b a(long var1);

   us.b a(float var1);

   us.b a(double var1);

   us.b a(byte[] var1);

   us.b a(int[] var1);

   us.b a(long[] var1);

   us.b a(ux<?> var1, int var2);

   us.a a(ux<?> var1);

   us.a a(ux<?> var1, String var2);

   us.a b(ux<?> var1, int var2);

   us.b b();

   us.b b(ux<?> var1);

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
