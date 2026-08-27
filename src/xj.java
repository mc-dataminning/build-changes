import com.mojang.serialization.MapCodec;

public class xj implements xk {
   public static final xl<xj> a = new xl<xj>() {
      private static final MapCodec<xj> a = vw.a.fieldOf("value").xmap(xj::new, $$0 -> $$0.b);
      private static final xs<vf, xj> b = xs.a(vw.b, $$0 -> $$0.b, xj::new);

      @Override
      public MapCodec<xj> a() {
         return a;
      }

      @Override
      public xs<vf, xj> b() {
         return b;
      }
   };
   final vu b;

   public xj(vu $$0) {
      this.b = $$0;
   }

   @Override
   public wi a(int $$0) {
      return this.b.f();
   }

   @Override
   public xl<xj> a() {
      return a;
   }
}
