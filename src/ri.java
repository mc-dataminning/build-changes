import java.util.List;

public class ri {
   public static void a(qh<ejk<?, ?>> $$0) {
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

   private static ehz a(List<dmr> $$0) {
      ehz $$1;
      if (!$$0.isEmpty()) {
         $$1 = ehz.a(ehz.c, ehz.a(jb.a.q(), $$0));
      } else {
         $$1 = ehz.c;
      }

      return $$1;
   }

   public static emp a(int $$0, jf<eqr> $$1) {
      return new emp($$0, 7, 3, $$1);
   }

   public static <FC extends emc, F extends ejy<FC>> emp a(F $$0, FC $$1, List<dmr> $$2, int $$3) {
      return a($$3, rx.a($$0, $$1, a($$2)));
   }

   public static <FC extends emc, F extends ejy<FC>> emp a(F $$0, FC $$1, List<dmr> $$2) {
      return a($$0, $$1, $$2, 96);
   }

   public static <FC extends emc, F extends ejy<FC>> emp a(F $$0, FC $$1) {
      return a($$0, $$1, List.of(), 96);
   }

   public static alf<ejk<?, ?>> a(String $$0) {
      return alf.a(mh.aL, alg.b($$0));
   }

   public static void a(qh<ejk<?, ?>> $$0, alf<ejk<?, ?>> $$1, ejy<emj> $$2) {
      a($$0, $$1, $$2, emc.m);
   }

   public static <FC extends emc, F extends ejy<FC>> void a(qh<ejk<?, ?>> $$0, alf<ejk<?, ?>> $$1, F $$2, FC $$3) {
      $$0.a($$1, new ejk($$2, $$3));
   }
}
