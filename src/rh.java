public interface rh {
   rh.b a();

   rh.b a(String var1);

   rh.b a(byte var1);

   rh.b a(short var1);

   rh.b a(int var1);

   rh.b a(long var1);

   rh.b a(float var1);

   rh.b a(double var1);

   rh.b a(byte[] var1);

   rh.b a(int[] var1);

   rh.b a(long[] var1);

   rh.b a(rm<?> var1, int var2);

   rh.a a(rm<?> var1);

   rh.a a(rm<?> var1, String var2);

   rh.a b(rm<?> var1, int var2);

   rh.b b();

   rh.b b(rm<?> var1);

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
