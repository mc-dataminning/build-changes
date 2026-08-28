import java.util.List;

public class ri {
   public static void a(qh<ejv<?, ?>> $$0) {
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

   private static eik a(List<dnc> $$0) {
      eik $$1;
      if (!$$0.isEmpty()) {
         $$1 = eik.a(eik.c, eik.a(jb.a.q(), $$0));
      } else {
         $$1 = eik.c;
      }

      return $$1;
   }

   public static enc a(int $$0, jf<erf> $$1) {
      return new enc($$0, 7, 3, $$1);
   }

   public static <FC extends emp, F extends ekk<FC>> enc a(F $$0, FC $$1, List<dnc> $$2, int $$3) {
      return a($$3, rx.a($$0, $$1, a($$2)));
   }

   public static <FC extends emp, F extends ekk<FC>> enc a(F $$0, FC $$1, List<dnc> $$2) {
      return a($$0, $$1, $$2, 96);
   }

   public static <FC extends emp, F extends ekk<FC>> enc a(F $$0, FC $$1) {
      return a($$0, $$1, List.of(), 96);
   }

   public static alh<ejv<?, ?>> a(String $$0) {
      return alh.a(mh.aL, ali.b($$0));
   }

   public static void a(qh<ejv<?, ?>> $$0, alh<ejv<?, ?>> $$1, ekk<emw> $$2) {
      a($$0, $$1, $$2, emp.m);
   }

   public static <FC extends emp, F extends ekk<FC>> void a(qh<ejv<?, ?>> $$0, alh<ejv<?, ?>> $$1, F $$2, FC $$3) {
      $$0.a($$1, new ejv($$2, $$3));
   }
}
