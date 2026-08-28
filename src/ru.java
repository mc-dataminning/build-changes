import java.util.List;

public class ru {
   public static void a(qt<edc<?, ?>> $$0) {
      rr.a($$0);
      rs.a($$0);
      rt.a($$0);
      rv.a($$0);
      rw.a($$0);
      rx.a($$0);
      ry.a($$0);
      rz.a($$0);
      sa.a($$0);
   }

   private static ebr a(List<dhj> $$0) {
      ebr $$1;
      if (!$$0.isEmpty()) {
         $$1 = ebr.a(ebr.c, ebr.a(jj.a.q(), $$0));
      } else {
         $$1 = ebr.c;
      }

      return $$1;
   }

   public static egh a(int $$0, jn<ekg> $$1) {
      return new egh($$0, 7, 3, $$1);
   }

   public static <FC extends efu, F extends edq<FC>> egh a(F $$0, FC $$1, List<dhj> $$2, int $$3) {
      return a($$3, sj.a($$0, $$1, a($$2)));
   }

   public static <FC extends efu, F extends edq<FC>> egh a(F $$0, FC $$1, List<dhj> $$2) {
      return a($$0, $$1, $$2, 96);
   }

   public static <FC extends efu, F extends edq<FC>> egh a(F $$0, FC $$1) {
      return a($$0, $$1, List.of(), 96);
   }

   public static alb<edc<?, ?>> a(String $$0) {
      return alb.a(lv.aJ, alc.b($$0));
   }

   public static void a(qt<edc<?, ?>> $$0, alb<edc<?, ?>> $$1, edq<egb> $$2) {
      a($$0, $$1, $$2, efu.m);
   }

   public static <FC extends efu, F extends edq<FC>> void a(qt<edc<?, ?>> $$0, alb<edc<?, ?>> $$1, F $$2, FC $$3) {
      $$0.a($$1, new edc($$2, $$3));
   }
}
