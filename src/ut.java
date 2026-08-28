public interface ut {
   ut.b a();

   ut.b a(String var1);

   ut.b a(byte var1);

   ut.b a(short var1);

   ut.b a(int var1);

   ut.b a(long var1);

   ut.b a(float var1);

   ut.b a(double var1);

   ut.b a(byte[] var1);

   ut.b a(int[] var1);

   ut.b a(long[] var1);

   ut.b a(uy<?> var1, int var2);

   ut.a a(uy<?> var1);

   ut.a a(uy<?> var1, String var2);

   ut.a b(uy<?> var1, int var2);

   ut.b b();

   ut.b b(uy<?> var1);

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
