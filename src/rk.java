public interface rk {
   rk.b a();

   rk.b a(String var1);

   rk.b a(byte var1);

   rk.b a(short var1);

   rk.b a(int var1);

   rk.b a(long var1);

   rk.b a(float var1);

   rk.b a(double var1);

   rk.b a(byte[] var1);

   rk.b a(int[] var1);

   rk.b a(long[] var1);

   rk.b a(rp<?> var1, int var2);

   rk.a a(rp<?> var1);

   rk.a a(rp<?> var1, String var2);

   rk.a b(rp<?> var1, int var2);

   rk.b b();

   rk.b b(rp<?> var1);

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
