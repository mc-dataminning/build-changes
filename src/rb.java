import java.util.List;

public class rb {
   public static final eal a = eae.a(dqo.a.e);
   public static final eal b = eae.a(dqo.a.c);
   public static final eal c = eae.a(dqo.a.a);
   public static final eal d = eae.a(dqo.a.d);
   public static final eal e = ead.a(dri.a(), dri.b());
   public static final eal f = ead.a(dri.b(10), dri.c(10));
   public static final eal g = ead.a(dri.b(8), dri.c(8));
   public static final eal h = ead.a(dri.b(4), dri.c(4));
   public static final eal i = ead.a(dri.a(), dri.a(256));

   public static void a(ph<eai> $$0) {
      qv.a($$0);
      qw.a($$0);
      qx.a($$0);
      qy.a($$0);
      qz.a($$0);
      ra.a($$0);
      rc.a($$0);
      rd.a($$0);
      re.a($$0);
   }

   public static aix<eai> a(String $$0) {
      return aix.a(kg.aC, new aiy($$0));
   }

   public static void a(ph<eai> $$0, aix<eai> $$1, ij<dtf<?, ?>> $$2, List<eal> $$3) {
      $$0.a($$1, new eai($$2, List.copyOf($$3)));
   }

   public static void a(ph<eai> $$0, aix<eai> $$1, ij<dtf<?, ?>> $$2, eal... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static eal a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bke<bkz> $$4 = bke.<bkz>a().a(bkw.a($$0), (int)$$3 - 1).a(bkw.a($$0 + $$2), 1).a();
         return eab.a(new blg($$4));
      }
   }

   public static eak a() {
      return dzx.a(drv.c);
   }

   public static dzx a(cyo $$0) {
      return dzx.a(drv.a($$0.o(), hz.c));
   }

   public static ij<eai> a(ij<dtf<?, ?>> $$0, eal... $$1) {
      return ij.a(new eai($$0, List.of($$1)));
   }

   public static <FC extends dvw, F extends dts<FC>> ij<eai> a(F $$0, FC $$1, eal... $$2) {
      return a(ij.a(new dtf($$0, $$1)), $$2);
   }

   public static <FC extends dvw, F extends dts<FC>> ij<eai> a(F $$0, FC $$1) {
      return a($$0, $$1, drv.c);
   }

   public static <FC extends dvw, F extends dts<FC>> ij<eai> a(F $$0, FC $$1, drv $$2) {
      return a($$0, $$1, dzx.a($$2));
   }
}
