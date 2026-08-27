public interface ri {
   ri.b a();

   ri.b a(String var1);

   ri.b a(byte var1);

   ri.b a(short var1);

   ri.b a(int var1);

   ri.b a(long var1);

   ri.b a(float var1);

   ri.b a(double var1);

   ri.b a(byte[] var1);

   ri.b a(int[] var1);

   ri.b a(long[] var1);

   ri.b a(rn<?> var1, int var2);

   ri.a a(rn<?> var1);

   ri.a a(rn<?> var1, String var2);

   ri.a b(rn<?> var1, int var2);

   ri.b b();

   ri.b b(rn<?> var1);

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
