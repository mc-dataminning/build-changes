public interface va {
   va.b a();

   va.b a(String var1);

   va.b a(byte var1);

   va.b a(short var1);

   va.b a(int var1);

   va.b a(long var1);

   va.b a(float var1);

   va.b a(double var1);

   va.b a(byte[] var1);

   va.b a(int[] var1);

   va.b a(long[] var1);

   va.b a(vf<?> var1, int var2);

   va.a a(vf<?> var1);

   va.a a(vf<?> var1, String var2);

   va.a b(vf<?> var1, int var2);

   va.b b();

   va.b b(vf<?> var1);

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
