public interface st {
   st.b a();

   st.b a(String var1);

   st.b a(byte var1);

   st.b a(short var1);

   st.b a(int var1);

   st.b a(long var1);

   st.b a(float var1);

   st.b a(double var1);

   st.b a(byte[] var1);

   st.b a(int[] var1);

   st.b a(long[] var1);

   st.b a(sy<?> var1, int var2);

   st.a a(sy<?> var1);

   st.a a(sy<?> var1, String var2);

   st.a b(sy<?> var1, int var2);

   st.b b();

   st.b b(sy<?> var1);

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
