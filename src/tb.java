import java.util.List;

public class tb {
   public static final enr a = enk.a(edq.a.e);
   public static final enr b = enk.a(edq.a.c);
   public static final enr c = enk.a(edq.a.a);
   public static final enr d = enk.a(edq.a.d);
   public static final enr e = enj.a(eek.a(), eek.b());
   public static final enr f = enj.a(eek.b(10), eek.c(10));
   public static final enr g = enj.a(eek.b(8), eek.c(8));
   public static final enr h = enj.a(eek.b(4), eek.c(4));
   public static final enr i = enj.a(eek.a(), eek.a(256));

   public static void a(rk<eno> $$0) {
      sv.a($$0);
      sw.a($$0);
      sx.a($$0);
      sy.a($$0);
      sz.a($$0);
      ta.a($$0);
      tc.a($$0);
      td.a($$0);
      te.a($$0);
   }

   public static aly<eno> a(String $$0) {
      return aly.a(mb.aT, alz.b($$0));
   }

   public static void a(rk<eno> $$0, aly<eno> $$1, jq<egi<?, ?>> $$2, List<enr> $$3) {
      $$0.a($$1, new eno($$2, List.copyOf($$3)));
   }

   public static void a(rk<eno> $$0, aly<eno> $$1, jq<egi<?, ?>> $$2, enr... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static enr a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         brr<bso> $$4 = brr.<bso>a().a(bsl.a($$0), (int)$$3 - 1).a(bsl.a($$0 + $$2), 1).a();
         return eng.a(new bsv($$4));
      }
   }

   public static enq a() {
      return end.a(eex.c);
   }

   public static end a(dkm $$0) {
      return end.a(eex.a($$0.m(), jh.c));
   }

   public static jq<eno> a(jq<egi<?, ?>> $$0, enr... $$1) {
      return jq.a(new eno($$0, List.of($$1)));
   }

   public static <FC extends eja, F extends egw<FC>> jq<eno> a(F $$0, FC $$1, enr... $$2) {
      return a(jq.a(new egi($$0, $$1)), $$2);
   }

   public static <FC extends eja, F extends egw<FC>> jq<eno> a(F $$0, FC $$1) {
      return a($$0, $$1, eex.c);
   }

   public static <FC extends eja, F extends egw<FC>> jq<eno> a(F $$0, FC $$1, eex $$2) {
      return a($$0, $$1, end.a($$2));
   }
}
