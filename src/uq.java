public interface uq {
   uq.b a();

   uq.b a(String var1);

   uq.b a(byte var1);

   uq.b a(short var1);

   uq.b a(int var1);

   uq.b a(long var1);

   uq.b a(float var1);

   uq.b a(double var1);

   uq.b a(byte[] var1);

   uq.b a(int[] var1);

   uq.b a(long[] var1);

   uq.b a(uv<?> var1, int var2);

   uq.a a(uv<?> var1);

   uq.a a(uv<?> var1, String var2);

   uq.a b(uv<?> var1, int var2);

   uq.b b();

   uq.b b(uv<?> var1);

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
