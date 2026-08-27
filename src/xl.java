import com.mojang.serialization.MapCodec;

public class xl implements xi {
   public static final xj<xl> a = new xj<xl>() {
      private static final MapCodec<xl> a = wp.b.a.xmap(xl::new, $$0 -> $$0.e);
      private static final xq<vd, xl> b = xq.a(wp.b.c, $$0 -> $$0.e, xl::new);

      @Override
      public MapCodec<xl> a() {
         return a;
      }

      @Override
      public xq<vd, xl> b() {
         return b;
      }
   };
   public static final xl b = new xl(wp.a);
   public static final xl c = new xl(wp.a.a(n.m));
   public static final xl d = new xl(wp.a.a(n.o));
   final wp e;

   public xl(wp $$0) {
      this.e = $$0;
   }

   @Override
   public wg a(int $$0) {
      return vs.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public xj<xl> a() {
      return a;
   }
}
