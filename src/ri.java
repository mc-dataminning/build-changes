import java.util.List;

public class ri {
   public static void a(qh<eiy<?, ?>> $$0) {
      rf.a($$0);
      rg.a($$0);
      rh.a($$0);
      rj.a($$0);
      rk.a($$0);
      rl.a($$0);
      rm.a($$0);
      rn.a($$0);
      ro.a($$0);
   }

   private static ehn a(List<dmf> $$0) {
      ehn $$1;
      if (!$$0.isEmpty()) {
         $$1 = ehn.a(ehn.c, ehn.a(ja.a.q(), $$0));
      } else {
         $$1 = ehn.c;
      }

      return $$1;
   }

   public static emd a(int $$0, je<eqf> $$1) {
      return new emd($$0, 7, 3, $$1);
   }

   public static <FC extends elq, F extends ejm<FC>> emd a(F $$0, FC $$1, List<dmf> $$2, int $$3) {
      return a($$3, rx.a($$0, $$1, a($$2)));
   }

   public static <FC extends elq, F extends ejm<FC>> emd a(F $$0, FC $$1, List<dmf> $$2) {
      return a($$0, $$1, $$2, 96);
   }

   public static <FC extends elq, F extends ejm<FC>> emd a(F $$0, FC $$1) {
      return a($$0, $$1, List.of(), 96);
   }

   public static alf<eiy<?, ?>> a(String $$0) {
      return alf.a(mg.aL, alg.b($$0));
   }

   public static void a(qh<eiy<?, ?>> $$0, alf<eiy<?, ?>> $$1, ejm<elx> $$2) {
      a($$0, $$1, $$2, elq.m);
   }

   public static <FC extends elq, F extends ejm<FC>> void a(qh<eiy<?, ?>> $$0, alf<eiy<?, ?>> $$1, F $$2, FC $$3) {
      $$0.a($$1, new eiy($$2, $$3));
   }
}
