import java.util.List;

public class rj {
   public static void a(qi<ejx<?, ?>> $$0) {
      rg.a($$0);
      rh.a($$0);
      ri.a($$0);
      rk.a($$0);
      rl.a($$0);
      rm.a($$0);
      rn.a($$0);
      ro.a($$0);
      rp.a($$0);
   }

   private static eim a(List<dne> $$0) {
      eim $$1;
      if (!$$0.isEmpty()) {
         $$1 = eim.a(eim.c, eim.a(jc.a.q(), $$0));
      } else {
         $$1 = eim.c;
      }

      return $$1;
   }

   public static ene a(int $$0, jg<erh> $$1) {
      return new ene($$0, 7, 3, $$1);
   }

   public static <FC extends emr, F extends ekm<FC>> ene a(F $$0, FC $$1, List<dne> $$2, int $$3) {
      return a($$3, ry.a($$0, $$1, a($$2)));
   }

   public static <FC extends emr, F extends ekm<FC>> ene a(F $$0, FC $$1, List<dne> $$2) {
      return a($$0, $$1, $$2, 96);
   }

   public static <FC extends emr, F extends ekm<FC>> ene a(F $$0, FC $$1) {
      return a($$0, $$1, List.of(), 96);
   }

   public static alj<ejx<?, ?>> a(String $$0) {
      return alj.a(mi.aL, alk.b($$0));
   }

   public static void a(qi<ejx<?, ?>> $$0, alj<ejx<?, ?>> $$1, ekm<emy> $$2) {
      a($$0, $$1, $$2, emr.m);
   }

   public static <FC extends emr, F extends ekm<FC>> void a(qi<ejx<?, ?>> $$0, alj<ejx<?, ?>> $$1, F $$2, FC $$3) {
      $$0.a($$1, new ejx($$2, $$3));
   }
}
