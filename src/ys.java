import com.mojang.serialization.MapCodec;

public class ys implements yp {
   public static final yq<ys> a = new yq<ys>() {
      private static final MapCodec<ys> a = xw.b.a.xmap(ys::new, $$0 -> $$0.e);
      private static final yx<wk, ys> b = yx.a(xw.b.c, $$0 -> $$0.e, ys::new);

      @Override
      public MapCodec<ys> a() {
         return a;
      }

      @Override
      public yx<wk, ys> b() {
         return b;
      }
   };
   public static final ys b = new ys(xw.a);
   public static final ys c = new ys(xw.a.a(n.m));
   public static final ys d = new ys(xw.a.a(n.o));
   final xw e;

   public ys(xw $$0) {
      this.e = $$0;
   }

   @Override
   public xn a(int $$0) {
      return wz.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public yq<ys> a() {
      return a;
   }
}
