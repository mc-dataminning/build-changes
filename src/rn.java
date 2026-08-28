import java.util.List;

public class rn {
   public static void a(qm<eax<?, ?>> $$0) {
      rk.a($$0);
      rl.a($$0);
      rm.a($$0);
      ro.a($$0);
      rp.a($$0);
      rq.a($$0);
      rr.a($$0);
      rs.a($$0);
      rt.a($$0);
   }

   private static dzm a(List<dfh> $$0) {
      dzm $$1;
      if (!$$0.isEmpty()) {
         $$1 = dzm.a(dzm.c, dzm.a(jf.a.q(), $$0));
      } else {
         $$1 = dzm.c;
      }

      return $$1;
   }

   public static eeb a(int $$0, jj<eia> $$1) {
      return new eeb($$0, 7, 3, $$1);
   }

   public static <FC extends edo, F extends ebk<FC>> eeb a(F $$0, FC $$1, List<dfh> $$2, int $$3) {
      return a($$3, sc.a($$0, $$1, a($$2)));
   }

   public static <FC extends edo, F extends ebk<FC>> eeb a(F $$0, FC $$1, List<dfh> $$2) {
      return a($$0, $$1, $$2, 96);
   }

   public static <FC extends edo, F extends ebk<FC>> eeb a(F $$0, FC $$1) {
      return a($$0, $$1, List.of(), 96);
   }

   public static akj<eax<?, ?>> a(String $$0) {
      return akj.a(lr.aH, new akk($$0));
   }

   public static void a(qm<eax<?, ?>> $$0, akj<eax<?, ?>> $$1, ebk<edv> $$2) {
      a($$0, $$1, $$2, edo.m);
   }

   public static <FC extends edo, F extends ebk<FC>> void a(qm<eax<?, ?>> $$0, akj<eax<?, ?>> $$1, F $$2, FC $$3) {
      $$0.a($$1, new eax($$2, $$3));
   }
}
