import java.util.List;

public class qz {
   public static final dyv a = dyo.a(doy.a.e);
   public static final dyv b = dyo.a(doy.a.c);
   public static final dyv c = dyo.a(doy.a.a);
   public static final dyv d = dyo.a(doy.a.d);
   public static final dyv e = dyn.a(dps.a(), dps.b());
   public static final dyv f = dyn.a(dps.b(10), dps.c(10));
   public static final dyv g = dyn.a(dps.b(8), dps.c(8));
   public static final dyv h = dyn.a(dps.b(4), dps.c(4));
   public static final dyv i = dyn.a(dps.a(), dps.a(256));

   public static void a(pf<dys> $$0) {
      qt.a($$0);
      qu.a($$0);
      qv.a($$0);
      qw.a($$0);
      qx.a($$0);
      qy.a($$0);
      ra.a($$0);
      rb.a($$0);
      rc.a($$0);
   }

   public static ahg<dys> a(String $$0) {
      return ahg.a(ke.aC, new ahh($$0));
   }

   public static void a(pf<dys> $$0, ahg<dys> $$1, ih<drp<?, ?>> $$2, List<dyv> $$3) {
      $$0.a($$1, new dys($$2, List.copyOf($$3)));
   }

   public static void a(pf<dys> $$0, ahg<dys> $$1, ih<drp<?, ?>> $$2, dyv... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static dyv a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bim<bjh> $$4 = bim.<bjh>a().a(bje.a($$0), (int)$$3 - 1).a(bje.a($$0 + $$2), 1).a();
         return dyl.a(new bjo($$4));
      }
   }

   public static dyu a() {
      return dyh.a(dqf.c);
   }

   public static dyh a(cwy $$0) {
      return dyh.a(dqf.a($$0.o(), hx.b));
   }

   public static ih<dys> a(ih<drp<?, ?>> $$0, dyv... $$1) {
      return ih.a(new dys($$0, List.of($$1)));
   }

   public static <FC extends dug, F extends dsc<FC>> ih<dys> a(F $$0, FC $$1, dyv... $$2) {
      return a(ih.a(new drp($$0, $$1)), $$2);
   }

   public static <FC extends dug, F extends dsc<FC>> ih<dys> a(F $$0, FC $$1) {
      return a($$0, $$1, dqf.c);
   }

   public static <FC extends dug, F extends dsc<FC>> ih<dys> a(F $$0, FC $$1, dqf $$2) {
      return a($$0, $$1, dyh.a($$2));
   }
}
