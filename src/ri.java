import java.util.List;

public class ri {
   public static void a(qh<ejf<?, ?>> $$0) {
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

   private static ehu a(List<dmm> $$0) {
      ehu $$1;
      if (!$$0.isEmpty()) {
         $$1 = ehu.a(ehu.c, ehu.a(jb.a.q(), $$0));
      } else {
         $$1 = ehu.c;
      }

      return $$1;
   }

   public static emk a(int $$0, jf<eqm> $$1) {
      return new emk($$0, 7, 3, $$1);
   }

   public static <FC extends elx, F extends ejt<FC>> emk a(F $$0, FC $$1, List<dmm> $$2, int $$3) {
      return a($$3, rx.a($$0, $$1, a($$2)));
   }

   public static <FC extends elx, F extends ejt<FC>> emk a(F $$0, FC $$1, List<dmm> $$2) {
      return a($$0, $$1, $$2, 96);
   }

   public static <FC extends elx, F extends ejt<FC>> emk a(F $$0, FC $$1) {
      return a($$0, $$1, List.of(), 96);
   }

   public static alf<ejf<?, ?>> a(String $$0) {
      return alf.a(mh.aL, alg.b($$0));
   }

   public static void a(qh<ejf<?, ?>> $$0, alf<ejf<?, ?>> $$1, ejt<eme> $$2) {
      a($$0, $$1, $$2, elx.m);
   }

   public static <FC extends elx, F extends ejt<FC>> void a(qh<ejf<?, ?>> $$0, alf<ejf<?, ?>> $$1, F $$2, FC $$3) {
      $$0.a($$1, new ejf($$2, $$3));
   }
}
