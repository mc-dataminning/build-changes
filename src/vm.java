public interface vm {
   vm.b a();

   vm.b a(String var1);

   vm.b a(byte var1);

   vm.b a(short var1);

   vm.b a(int var1);

   vm.b a(long var1);

   vm.b a(float var1);

   vm.b a(double var1);

   vm.b a(byte[] var1);

   vm.b a(int[] var1);

   vm.b a(long[] var1);

   vm.b a(vr<?> var1, int var2);

   vm.a a(vr<?> var1);

   vm.a a(vr<?> var1, String var2);

   vm.a b(vr<?> var1, int var2);

   vm.b b();

   vm.b b(vr<?> var1);

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
