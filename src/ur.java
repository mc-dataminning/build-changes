public interface ur {
   ur.b a();

   ur.b a(String var1);

   ur.b a(byte var1);

   ur.b a(short var1);

   ur.b a(int var1);

   ur.b a(long var1);

   ur.b a(float var1);

   ur.b a(double var1);

   ur.b a(byte[] var1);

   ur.b a(int[] var1);

   ur.b a(long[] var1);

   ur.b a(uw<?> var1, int var2);

   ur.a a(uw<?> var1);

   ur.a a(uw<?> var1, String var2);

   ur.a b(uw<?> var1, int var2);

   ur.b b();

   ur.b b(uw<?> var1);

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
