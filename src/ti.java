public interface ti {
   ti.b a();

   ti.b a(String var1);

   ti.b a(byte var1);

   ti.b a(short var1);

   ti.b a(int var1);

   ti.b a(long var1);

   ti.b a(float var1);

   ti.b a(double var1);

   ti.b a(byte[] var1);

   ti.b a(int[] var1);

   ti.b a(long[] var1);

   ti.b a(tn<?> var1, int var2);

   ti.a a(tn<?> var1);

   ti.a a(tn<?> var1, String var2);

   ti.a b(tn<?> var1, int var2);

   ti.b b();

   ti.b b(tn<?> var1);

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
