import java.util.List;

public class rx {
   public static final eqa a = ept.a(efy.a.e);
   public static final eqa b = ept.a(efy.a.f);
   public static final eqa c = ept.a(efy.a.c);
   public static final eqa d = ept.a(efy.a.a);
   public static final eqa e = ept.a(efy.a.d);
   public static final eqa f = eps.a(egs.a(), egs.b());
   public static final eqa g = eps.a(egs.b(10), egs.c(10));
   public static final eqa h = eps.a(egs.b(8), egs.c(8));
   public static final eqa i = eps.a(egs.b(4), egs.c(4));
   public static final eqa j = eps.a(egs.a(), egs.a(256));

   public static void a(qh<epx> $$0) {
      rr.a($$0);
      rs.a($$0);
      rt.a($$0);
      ru.a($$0);
      rv.a($$0);
      rw.a($$0);
      ry.a($$0);
      rz.a($$0);
      sa.a($$0);
   }

   public static alf<epx> a(String $$0) {
      return alf.a(mg.ba, alg.b($$0));
   }

   public static void a(qh<epx> $$0, alf<epx> $$1, je<eiq<?, ?>> $$2, List<eqa> $$3) {
      $$0.a($$1, new epx($$2, List.copyOf($$3)));
   }

   public static void a(qh<epx> $$0, alf<epx> $$1, je<eiq<?, ?>> $$2, eqa... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static eqa a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bsm<btg> $$4 = bsm.<btg>b().a(btd.a($$0), (int)$$3 - 1).a(btd.a($$0 + $$2), 1).a();
         return epp.a(new btn($$4));
      }
   }

   public static epz a() {
      return epm.a(ehf.c);
   }

   public static epm a(dma $$0) {
      return epm.a(ehf.a($$0.m(), iu.c));
   }

   public static je<epx> a(je<eiq<?, ?>> $$0, eqa... $$1) {
      return je.a(new epx($$0, List.of($$1)));
   }

   public static <FC extends eli, F extends eje<FC>> je<epx> a(F $$0, FC $$1, eqa... $$2) {
      return a(je.a(new eiq($$0, $$1)), $$2);
   }

   public static <FC extends eli, F extends eje<FC>> je<epx> a(F $$0, FC $$1) {
      return a($$0, $$1, ehf.c);
   }

   public static <FC extends eli, F extends eje<FC>> je<epx> a(F $$0, FC $$1, ehf $$2) {
      return a($$0, $$1, epm.a($$2));
   }
}
