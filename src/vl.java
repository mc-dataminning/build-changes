public interface vl {
   vl.b a();

   vl.b a(String var1);

   vl.b a(byte var1);

   vl.b a(short var1);

   vl.b a(int var1);

   vl.b a(long var1);

   vl.b a(float var1);

   vl.b a(double var1);

   vl.b a(byte[] var1);

   vl.b a(int[] var1);

   vl.b a(long[] var1);

   vl.b a(vq<?> var1, int var2);

   vl.a a(vq<?> var1);

   vl.a a(vq<?> var1, String var2);

   vl.a b(vq<?> var1, int var2);

   vl.b b();

   vl.b b(vq<?> var1);

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
