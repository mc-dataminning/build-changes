import java.util.List;

public class qw {
   public static final dyg a = dxz.a(doj.a.e);
   public static final dyg b = dxz.a(doj.a.c);
   public static final dyg c = dxz.a(doj.a.a);
   public static final dyg d = dxz.a(doj.a.d);
   public static final dyg e = dxy.a(dpd.a(), dpd.b());
   public static final dyg f = dxy.a(dpd.b(10), dpd.c(10));
   public static final dyg g = dxy.a(dpd.b(8), dpd.c(8));
   public static final dyg h = dxy.a(dpd.b(4), dpd.c(4));
   public static final dyg i = dxy.a(dpd.a(), dpd.a(256));

   public static void a(pc<dyd> $$0) {
      qq.a($$0);
      qr.a($$0);
      qs.a($$0);
      qt.a($$0);
      qu.a($$0);
      qv.a($$0);
      qx.a($$0);
      qy.a($$0);
      qz.a($$0);
   }

   public static ahc<dyd> a(String $$0) {
      return ahc.a(ke.aC, new ahd($$0));
   }

   public static void a(pc<dyd> $$0, ahc<dyd> $$1, ih<dra<?, ?>> $$2, List<dyg> $$3) {
      $$0.a($$1, new dyd($$2, List.copyOf($$3)));
   }

   public static void a(pc<dyd> $$0, ahc<dyd> $$1, ih<dra<?, ?>> $$2, dyg... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static dyg a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bif<bja> $$4 = bif.<bja>a().a(bix.a($$0), (int)$$3 - 1).a(bix.a($$0 + $$2), 1).a();
         return dxw.a(new bjh($$4));
      }
   }

   public static dyf a() {
      return dxs.a(dpq.c);
   }

   public static dxs a(cwj $$0) {
      return dxs.a(dpq.a($$0.o(), hx.b));
   }

   public static ih<dyd> a(ih<dra<?, ?>> $$0, dyg... $$1) {
      return ih.a(new dyd($$0, List.of($$1)));
   }

   public static <FC extends dtr, F extends drn<FC>> ih<dyd> a(F $$0, FC $$1, dyg... $$2) {
      return a(ih.a(new dra($$0, $$1)), $$2);
   }

   public static <FC extends dtr, F extends drn<FC>> ih<dyd> a(F $$0, FC $$1) {
      return a($$0, $$1, dpq.c);
   }

   public static <FC extends dtr, F extends drn<FC>> ih<dyd> a(F $$0, FC $$1, dpq $$2) {
      return a($$0, $$1, dxs.a($$2));
   }
}
