import java.util.List;

public class qy {
   public static final dyn a = dyg.a(doq.a.e);
   public static final dyn b = dyg.a(doq.a.c);
   public static final dyn c = dyg.a(doq.a.a);
   public static final dyn d = dyg.a(doq.a.d);
   public static final dyn e = dyf.a(dpk.a(), dpk.b());
   public static final dyn f = dyf.a(dpk.b(10), dpk.c(10));
   public static final dyn g = dyf.a(dpk.b(8), dpk.c(8));
   public static final dyn h = dyf.a(dpk.b(4), dpk.c(4));
   public static final dyn i = dyf.a(dpk.a(), dpk.a(256));

   public static void a(pe<dyk> $$0) {
      qs.a($$0);
      qt.a($$0);
      qu.a($$0);
      qv.a($$0);
      qw.a($$0);
      qx.a($$0);
      qz.a($$0);
      ra.a($$0);
      rb.a($$0);
   }

   public static ahf<dyk> a(String $$0) {
      return ahf.a(ke.aC, new ahg($$0));
   }

   public static void a(pe<dyk> $$0, ahf<dyk> $$1, ih<drh<?, ?>> $$2, List<dyn> $$3) {
      $$0.a($$1, new dyk($$2, List.copyOf($$3)));
   }

   public static void a(pe<dyk> $$0, ahf<dyk> $$1, ih<drh<?, ?>> $$2, dyn... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static dyn a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bil<bjg> $$4 = bil.<bjg>a().a(bjd.a($$0), (int)$$3 - 1).a(bjd.a($$0 + $$2), 1).a();
         return dyd.a(new bjn($$4));
      }
   }

   public static dym a() {
      return dxz.a(dpx.c);
   }

   public static dxz a(cwq $$0) {
      return dxz.a(dpx.a($$0.o(), hx.b));
   }

   public static ih<dyk> a(ih<drh<?, ?>> $$0, dyn... $$1) {
      return ih.a(new dyk($$0, List.of($$1)));
   }

   public static <FC extends dty, F extends dru<FC>> ih<dyk> a(F $$0, FC $$1, dyn... $$2) {
      return a(ih.a(new drh($$0, $$1)), $$2);
   }

   public static <FC extends dty, F extends dru<FC>> ih<dyk> a(F $$0, FC $$1) {
      return a($$0, $$1, dpx.c);
   }

   public static <FC extends dty, F extends dru<FC>> ih<dyk> a(F $$0, FC $$1, dpx $$2) {
      return a($$0, $$1, dxz.a($$2));
   }
}
