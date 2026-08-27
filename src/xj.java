import com.mojang.serialization.MapCodec;

public class xj implements xg {
   public static final xh<xj> a = new xh<xj>() {
      private static final MapCodec<xj> a = wn.b.a.xmap(xj::new, $$0 -> $$0.e);
      private static final xo<vb, xj> b = xo.a(wn.b.c, $$0 -> $$0.e, xj::new);

      @Override
      public MapCodec<xj> a() {
         return a;
      }

      @Override
      public xo<vb, xj> b() {
         return b;
      }
   };
   public static final xj b = new xj(wn.a);
   public static final xj c = new xj(wn.a.a(n.m));
   public static final xj d = new xj(wn.a.a(n.o));
   final wn e;

   public xj(wn $$0) {
      this.e = $$0;
   }

   @Override
   public we a(int $$0) {
      return vq.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public xh<xj> a() {
      return a;
   }
}
