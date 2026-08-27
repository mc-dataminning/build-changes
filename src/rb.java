import java.util.List;

public class rb {
   public static final eas a = eal.a(dqv.a.e);
   public static final eas b = eal.a(dqv.a.c);
   public static final eas c = eal.a(dqv.a.a);
   public static final eas d = eal.a(dqv.a.d);
   public static final eas e = eak.a(drp.a(), drp.b());
   public static final eas f = eak.a(drp.b(10), drp.c(10));
   public static final eas g = eak.a(drp.b(8), drp.c(8));
   public static final eas h = eak.a(drp.b(4), drp.c(4));
   public static final eas i = eak.a(drp.a(), drp.a(256));

   public static void a(ph<eap> $$0) {
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

   public static aix<eap> a(String $$0) {
      return aix.a(kg.aC, new aiy($$0));
   }

   public static void a(ph<eap> $$0, aix<eap> $$1, ij<dtm<?, ?>> $$2, List<eas> $$3) {
      $$0.a($$1, new eap($$2, List.copyOf($$3)));
   }

   public static void a(ph<eap> $$0, aix<eap> $$1, ij<dtm<?, ?>> $$2, eas... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static eas a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bkg<blb> $$4 = bkg.<blb>a().a(bky.a($$0), (int)$$3 - 1).a(bky.a($$0 + $$2), 1).a();
         return eai.a(new bli($$4));
      }
   }

   public static ear a() {
      return eae.a(dsc.c);
   }

   public static eae a(cys $$0) {
      return eae.a(dsc.a($$0.o(), hz.c));
   }

   public static ij<eap> a(ij<dtm<?, ?>> $$0, eas... $$1) {
      return ij.a(new eap($$0, List.of($$1)));
   }

   public static <FC extends dwd, F extends dtz<FC>> ij<eap> a(F $$0, FC $$1, eas... $$2) {
      return a(ij.a(new dtm($$0, $$1)), $$2);
   }

   public static <FC extends dwd, F extends dtz<FC>> ij<eap> a(F $$0, FC $$1) {
      return a($$0, $$1, dsc.c);
   }

   public static <FC extends dwd, F extends dtz<FC>> ij<eap> a(F $$0, FC $$1, dsc $$2) {
      return a($$0, $$1, eae.a($$2));
   }
}
