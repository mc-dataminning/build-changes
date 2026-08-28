import java.util.List;

public class sf {
   public static final eit a = eim.a(dyv.a.e);
   public static final eit b = eim.a(dyv.a.c);
   public static final eit c = eim.a(dyv.a.a);
   public static final eit d = eim.a(dyv.a.d);
   public static final eit e = eil.a(dzp.a(), dzp.b());
   public static final eit f = eil.a(dzp.b(10), dzp.c(10));
   public static final eit g = eil.a(dzp.b(8), dzp.c(8));
   public static final eit h = eil.a(dzp.b(4), dzp.c(4));
   public static final eit i = eil.a(dzp.a(), dzp.a(256));

   public static void a(qp<eiq> $$0) {
      rz.a($$0);
      sa.a($$0);
      sb.a($$0);
      sc.a($$0);
      sd.a($$0);
      se.a($$0);
      sg.a($$0);
      sh.a($$0);
      si.a($$0);
   }

   public static akp<eiq> a(String $$0) {
      return akp.a(lu.aQ, akq.b($$0));
   }

   public static void a(qp<eiq> $$0, akp<eiq> $$1, jm<ebn<?, ?>> $$2, List<eit> $$3) {
      $$0.a($$1, new eiq($$2, List.copyOf($$3)));
   }

   public static void a(qp<eiq> $$0, akp<eiq> $$1, jm<ebn<?, ?>> $$2, eit... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static eit a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bpa<bpv> $$4 = bpa.<bpv>a().a(bps.a($$0), (int)$$3 - 1).a(bps.a($$0 + $$2), 1).a();
         return eij.a(new bqc($$4));
      }
   }

   public static eis a() {
      return eif.a(eac.c);
   }

   public static eif a(dfw $$0) {
      return eif.a(eac.a($$0.o(), jd.c));
   }

   public static jm<eiq> a(jm<ebn<?, ?>> $$0, eit... $$1) {
      return jm.a(new eiq($$0, List.of($$1)));
   }

   public static <FC extends eee, F extends eca<FC>> jm<eiq> a(F $$0, FC $$1, eit... $$2) {
      return a(jm.a(new ebn($$0, $$1)), $$2);
   }

   public static <FC extends eee, F extends eca<FC>> jm<eiq> a(F $$0, FC $$1) {
      return a($$0, $$1, eac.c);
   }

   public static <FC extends eee, F extends eca<FC>> jm<eiq> a(F $$0, FC $$1, eac $$2) {
      return a($$0, $$1, eif.a($$2));
   }
}
