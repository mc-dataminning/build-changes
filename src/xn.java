import com.mojang.serialization.MapCodec;

public class xn implements xk {
   public static final xl<xn> a = new xl<xn>() {
      private static final MapCodec<xn> a = wr.b.a.xmap(xn::new, $$0 -> $$0.e);
      private static final xs<vf, xn> b = xs.a(wr.b.c, $$0 -> $$0.e, xn::new);

      @Override
      public MapCodec<xn> a() {
         return a;
      }

      @Override
      public xs<vf, xn> b() {
         return b;
      }
   };
   public static final xn b = new xn(wr.a);
   public static final xn c = new xn(wr.a.a(n.m));
   public static final xn d = new xn(wr.a.a(n.o));
   final wr e;

   public xn(wr $$0) {
      this.e = $$0;
   }

   @Override
   public wi a(int $$0) {
      return vu.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public xl<xn> a() {
      return a;
   }
}
