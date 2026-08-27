public interface ug {
   ug.b a();

   ug.b a(String var1);

   ug.b a(byte var1);

   ug.b a(short var1);

   ug.b a(int var1);

   ug.b a(long var1);

   ug.b a(float var1);

   ug.b a(double var1);

   ug.b a(byte[] var1);

   ug.b a(int[] var1);

   ug.b a(long[] var1);

   ug.b a(ul<?> var1, int var2);

   ug.a a(ul<?> var1);

   ug.a a(ul<?> var1, String var2);

   ug.a b(ul<?> var1, int var2);

   ug.b b();

   ug.b b(ul<?> var1);

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
