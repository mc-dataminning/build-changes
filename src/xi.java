import com.mojang.serialization.MapCodec;

public class xi implements xk {
   public static final xi a = new xi();
   public static final xl<xi> b = new xl<xi>() {
      private static final MapCodec<xi> a = MapCodec.unit(xi.a);
      private static final xs<vf, xi> b = xs.a(xi.a);

      @Override
      public MapCodec<xi> a() {
         return a;
      }

      @Override
      public xs<vf, xi> b() {
         return b;
      }
   };

   @Override
   public wi a(int $$0) {
      return vu.i();
   }

   @Override
   public xl<xi> a() {
      return b;
   }
}
