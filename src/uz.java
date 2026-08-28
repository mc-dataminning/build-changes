public interface uz {
   uz.b a();

   uz.b a(String var1);

   uz.b a(byte var1);

   uz.b a(short var1);

   uz.b a(int var1);

   uz.b a(long var1);

   uz.b a(float var1);

   uz.b a(double var1);

   uz.b a(byte[] var1);

   uz.b a(int[] var1);

   uz.b a(long[] var1);

   uz.b a(ve<?> var1, int var2);

   uz.a a(ve<?> var1);

   uz.a a(ve<?> var1, String var2);

   uz.a b(ve<?> var1, int var2);

   uz.b b();

   uz.b b(ve<?> var1);

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
