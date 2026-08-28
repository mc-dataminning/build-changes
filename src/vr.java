public interface vr {
   vr.b a();

   vr.b a(String var1);

   vr.b a(byte var1);

   vr.b a(short var1);

   vr.b a(int var1);

   vr.b a(long var1);

   vr.b a(float var1);

   vr.b a(double var1);

   vr.b a(byte[] var1);

   vr.b a(int[] var1);

   vr.b a(long[] var1);

   vr.b a(vw<?> var1, int var2);

   vr.a a(vw<?> var1);

   vr.a a(vw<?> var1, String var2);

   vr.a b(vw<?> var1, int var2);

   vr.b b();

   vr.b b(vw<?> var1);

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
