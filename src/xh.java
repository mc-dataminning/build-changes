import com.mojang.serialization.MapCodec;

public class xh implements xi {
   public static final xj<xh> a = new xj<xh>() {
      private static final MapCodec<xh> a = vu.a.fieldOf("value").xmap(xh::new, $$0 -> $$0.b);
      private static final xq<vd, xh> b = xq.a(vu.b, $$0 -> $$0.b, xh::new);

      @Override
      public MapCodec<xh> a() {
         return a;
      }

      @Override
      public xq<vd, xh> b() {
         return b;
      }
   };
   final vs b;

   public xh(vs $$0) {
      this.b = $$0;
   }

   @Override
   public wg a(int $$0) {
      return this.b.f();
   }

   @Override
   public xj<xh> a() {
      return a;
   }
}
