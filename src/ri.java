import java.util.List;

public class ri {
   public static void a(qh<eiq<?, ?>> $$0) {
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

   private static ehf a(List<dma> $$0) {
      ehf $$1;
      if (!$$0.isEmpty()) {
         $$1 = ehf.a(ehf.c, ehf.a(ja.a.q(), $$0));
      } else {
         $$1 = ehf.c;
      }

      return $$1;
   }

   public static elv a(int $$0, je<epx> $$1) {
      return new elv($$0, 7, 3, $$1);
   }

   public static <FC extends eli, F extends eje<FC>> elv a(F $$0, FC $$1, List<dma> $$2, int $$3) {
      return a($$3, rx.a($$0, $$1, a($$2)));
   }

   public static <FC extends eli, F extends eje<FC>> elv a(F $$0, FC $$1, List<dma> $$2) {
      return a($$0, $$1, $$2, 96);
   }

   public static <FC extends eli, F extends eje<FC>> elv a(F $$0, FC $$1) {
      return a($$0, $$1, List.of(), 96);
   }

   public static alf<eiq<?, ?>> a(String $$0) {
      return alf.a(mg.aK, alg.b($$0));
   }

   public static void a(qh<eiq<?, ?>> $$0, alf<eiq<?, ?>> $$1, eje<elp> $$2) {
      a($$0, $$1, $$2, eli.m);
   }

   public static <FC extends eli, F extends eje<FC>> void a(qh<eiq<?, ?>> $$0, alf<eiq<?, ?>> $$1, F $$2, FC $$3) {
      $$0.a($$1, new eiq($$2, $$3));
   }
}
