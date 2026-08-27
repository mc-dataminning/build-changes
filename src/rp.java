public interface rp {
   rp.b a();

   rp.b a(String var1);

   rp.b a(byte var1);

   rp.b a(short var1);

   rp.b a(int var1);

   rp.b a(long var1);

   rp.b a(float var1);

   rp.b a(double var1);

   rp.b a(byte[] var1);

   rp.b a(int[] var1);

   rp.b a(long[] var1);

   rp.b a(ru<?> var1, int var2);

   rp.a a(ru<?> var1);

   rp.a a(ru<?> var1, String var2);

   rp.a b(ru<?> var1, int var2);

   rp.b b();

   rp.b b(ru<?> var1);

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
