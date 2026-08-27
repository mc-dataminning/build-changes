public interface rn {
   rn.b a();

   rn.b a(String var1);

   rn.b a(byte var1);

   rn.b a(short var1);

   rn.b a(int var1);

   rn.b a(long var1);

   rn.b a(float var1);

   rn.b a(double var1);

   rn.b a(byte[] var1);

   rn.b a(int[] var1);

   rn.b a(long[] var1);

   rn.b a(rs<?> var1, int var2);

   rn.a a(rs<?> var1);

   rn.a a(rs<?> var1, String var2);

   rn.a b(rs<?> var1, int var2);

   rn.b b();

   rn.b b(rs<?> var1);

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
