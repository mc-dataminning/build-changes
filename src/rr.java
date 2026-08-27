import java.util.List;

public class rr {
   public static final eeo a = eeh.a(dur.a.e);
   public static final eeo b = eeh.a(dur.a.c);
   public static final eeo c = eeh.a(dur.a.a);
   public static final eeo d = eeh.a(dur.a.d);
   public static final eeo e = eeg.a(dvl.a(), dvl.b());
   public static final eeo f = eeg.a(dvl.b(10), dvl.c(10));
   public static final eeo g = eeg.a(dvl.b(8), dvl.c(8));
   public static final eeo h = eeg.a(dvl.b(4), dvl.c(4));
   public static final eeo i = eeg.a(dvl.a(), dvl.a(256));

   public static void a(px<eel> $$0) {
      rl.a($$0);
      rm.a($$0);
      rn.a($$0);
      ro.a($$0);
      rp.a($$0);
      rq.a($$0);
      rs.a($$0);
      rt.a($$0);
      ru.a($$0);
   }

   public static ajs<eel> a(String $$0) {
      return ajs.a(ks.aE, new ajt($$0));
   }

   public static void a(px<eel> $$0, ajs<eel> $$1, il<dxi<?, ?>> $$2, List<eeo> $$3) {
      $$0.a($$1, new eel($$2, List.copyOf($$3)));
   }

   public static void a(px<eel> $$0, ajs<eel> $$1, il<dxi<?, ?>> $$2, eeo... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static eeo a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bmk<bnf> $$4 = bmk.<bnf>a().a(bnc.a($$0), (int)$$3 - 1).a(bnc.a($$0 + $$2), 1).a();
         return eee.a(new bnm($$4));
      }
   }

   public static een a() {
      return eea.a(dvy.c);
   }

   public static eea a(dby $$0) {
      return eea.a(dvy.a($$0.n(), ib.c));
   }

   public static il<eel> a(il<dxi<?, ?>> $$0, eeo... $$1) {
      return il.a(new eel($$0, List.of($$1)));
   }

   public static <FC extends dzz, F extends dxv<FC>> il<eel> a(F $$0, FC $$1, eeo... $$2) {
      return a(il.a(new dxi($$0, $$1)), $$2);
   }

   public static <FC extends dzz, F extends dxv<FC>> il<eel> a(F $$0, FC $$1) {
      return a($$0, $$1, dvy.c);
   }

   public static <FC extends dzz, F extends dxv<FC>> il<eel> a(F $$0, FC $$1, dvy $$2) {
      return a($$0, $$1, eea.a($$2));
   }
}
