import java.util.List;

public class qy {
   public static final dym a = dyf.a(dop.a.e);
   public static final dym b = dyf.a(dop.a.c);
   public static final dym c = dyf.a(dop.a.a);
   public static final dym d = dyf.a(dop.a.d);
   public static final dym e = dye.a(dpj.a(), dpj.b());
   public static final dym f = dye.a(dpj.b(10), dpj.c(10));
   public static final dym g = dye.a(dpj.b(8), dpj.c(8));
   public static final dym h = dye.a(dpj.b(4), dpj.c(4));
   public static final dym i = dye.a(dpj.a(), dpj.a(256));

   public static void a(pe<dyj> $$0) {
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

   public static ahf<dyj> a(String $$0) {
      return ahf.a(ke.aC, new ahg($$0));
   }

   public static void a(pe<dyj> $$0, ahf<dyj> $$1, ih<drg<?, ?>> $$2, List<dym> $$3) {
      $$0.a($$1, new dyj($$2, List.copyOf($$3)));
   }

   public static void a(pe<dyj> $$0, ahf<dyj> $$1, ih<drg<?, ?>> $$2, dym... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static dym a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bik<bjf> $$4 = bik.<bjf>a().a(bjc.a($$0), (int)$$3 - 1).a(bjc.a($$0 + $$2), 1).a();
         return dyc.a(new bjm($$4));
      }
   }

   public static dyl a() {
      return dxy.a(dpw.c);
   }

   public static dxy a(cwp $$0) {
      return dxy.a(dpw.a($$0.o(), hx.b));
   }

   public static ih<dyj> a(ih<drg<?, ?>> $$0, dym... $$1) {
      return ih.a(new dyj($$0, List.of($$1)));
   }

   public static <FC extends dtx, F extends drt<FC>> ih<dyj> a(F $$0, FC $$1, dym... $$2) {
      return a(ih.a(new drg($$0, $$1)), $$2);
   }

   public static <FC extends dtx, F extends drt<FC>> ih<dyj> a(F $$0, FC $$1) {
      return a($$0, $$1, dpw.c);
   }

   public static <FC extends dtx, F extends drt<FC>> ih<dyj> a(F $$0, FC $$1, dpw $$2) {
      return a($$0, $$1, dxy.a($$2));
   }
}
