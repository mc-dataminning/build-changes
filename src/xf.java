import com.mojang.serialization.MapCodec;

public class xf implements xg {
   public static final xh<xf> a = new xh<xf>() {
      private static final MapCodec<xf> a = vs.a.fieldOf("value").xmap(xf::new, $$0 -> $$0.b);
      private static final xo<vb, xf> b = xo.a(vs.b, $$0 -> $$0.b, xf::new);

      @Override
      public MapCodec<xf> a() {
         return a;
      }

      @Override
      public xo<vb, xf> b() {
         return b;
      }
   };
   final vq b;

   public xf(vq $$0) {
      this.b = $$0;
   }

   @Override
   public we a(int $$0) {
      return this.b.f();
   }

   @Override
   public xh<xf> a() {
      return a;
   }
}
