import java.util.List;

public class sc {
   public static final eie a = ehx.a(dyg.a.e);
   public static final eie b = ehx.a(dyg.a.c);
   public static final eie c = ehx.a(dyg.a.a);
   public static final eie d = ehx.a(dyg.a.d);
   public static final eie e = ehw.a(dza.a(), dza.b());
   public static final eie f = ehw.a(dza.b(10), dza.c(10));
   public static final eie g = ehw.a(dza.b(8), dza.c(8));
   public static final eie h = ehw.a(dza.b(4), dza.c(4));
   public static final eie i = ehw.a(dza.a(), dza.a(256));

   public static void a(qm<eib> $$0) {
      rw.a($$0);
      rx.a($$0);
      ry.a($$0);
      rz.a($$0);
      sa.a($$0);
      sb.a($$0);
      sd.a($$0);
      se.a($$0);
      sf.a($$0);
   }

   public static akj<eib> a(String $$0) {
      return akj.a(lr.aP, new akk($$0));
   }

   public static void a(qm<eib> $$0, akj<eib> $$1, jj<eay<?, ?>> $$2, List<eie> $$3) {
      $$0.a($$1, new eib($$2, List.copyOf($$3)));
   }

   public static void a(qm<eib> $$0, akj<eib> $$1, jj<eay<?, ?>> $$2, eie... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static eie a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bor<bpm> $$4 = bor.<bpm>a().a(bpj.a($$0), (int)$$3 - 1).a(bpj.a($$0 + $$2), 1).a();
         return ehu.a(new bpt($$4));
      }
   }

   public static eid a() {
      return ehq.a(dzn.c);
   }

   public static ehq a(dfi $$0) {
      return ehq.a(dzn.a($$0.o(), ja.c));
   }

   public static jj<eib> a(jj<eay<?, ?>> $$0, eie... $$1) {
      return jj.a(new eib($$0, List.of($$1)));
   }

   public static <FC extends edp, F extends ebl<FC>> jj<eib> a(F $$0, FC $$1, eie... $$2) {
      return a(jj.a(new eay($$0, $$1)), $$2);
   }

   public static <FC extends edp, F extends ebl<FC>> jj<eib> a(F $$0, FC $$1) {
      return a($$0, $$1, dzn.c);
   }

   public static <FC extends edp, F extends ebl<FC>> jj<eib> a(F $$0, FC $$1, dzn $$2) {
      return a($$0, $$1, ehq.a($$2));
   }
}
