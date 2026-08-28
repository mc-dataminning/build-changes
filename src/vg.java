public interface vg {
   vg.b a();

   vg.b a(String var1);

   vg.b a(byte var1);

   vg.b a(short var1);

   vg.b a(int var1);

   vg.b a(long var1);

   vg.b a(float var1);

   vg.b a(double var1);

   vg.b a(byte[] var1);

   vg.b a(int[] var1);

   vg.b a(long[] var1);

   vg.b a(vl<?> var1, int var2);

   vg.a a(vl<?> var1);

   vg.a a(vl<?> var1, String var2);

   vg.a b(vl<?> var1, int var2);

   vg.b b();

   vg.b b(vl<?> var1);

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
