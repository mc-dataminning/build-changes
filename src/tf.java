public interface tf {
   tf.b a();

   tf.b a(String var1);

   tf.b a(byte var1);

   tf.b a(short var1);

   tf.b a(int var1);

   tf.b a(long var1);

   tf.b a(float var1);

   tf.b a(double var1);

   tf.b a(byte[] var1);

   tf.b a(int[] var1);

   tf.b a(long[] var1);

   tf.b a(tk<?> var1, int var2);

   tf.a a(tk<?> var1);

   tf.a a(tk<?> var1, String var2);

   tf.a b(tk<?> var1, int var2);

   tf.b b();

   tf.b b(tk<?> var1);

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
