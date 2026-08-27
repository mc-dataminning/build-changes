public interface ux {
   ux.b a();

   ux.b a(String var1);

   ux.b a(byte var1);

   ux.b a(short var1);

   ux.b a(int var1);

   ux.b a(long var1);

   ux.b a(float var1);

   ux.b a(double var1);

   ux.b a(byte[] var1);

   ux.b a(int[] var1);

   ux.b a(long[] var1);

   ux.b a(vc<?> var1, int var2);

   ux.a a(vc<?> var1);

   ux.a a(vc<?> var1, String var2);

   ux.a b(vc<?> var1, int var2);

   ux.b b();

   ux.b b(vc<?> var1);

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
