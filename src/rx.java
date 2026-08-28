import java.util.List;

public class rx {
   public static final eqi a = eqb.a(egg.a.e);
   public static final eqi b = eqb.a(egg.a.f);
   public static final eqi c = eqb.a(egg.a.c);
   public static final eqi d = eqb.a(egg.a.a);
   public static final eqi e = eqb.a(egg.a.d);
   public static final eqi f = eqa.a(eha.a(), eha.b());
   public static final eqi g = eqa.a(eha.b(10), eha.c(10));
   public static final eqi h = eqa.a(eha.b(8), eha.c(8));
   public static final eqi i = eqa.a(eha.b(4), eha.c(4));
   public static final eqi j = eqa.a(eha.a(), eha.a(256));

   public static void a(qh<eqf> $$0) {
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

   public static alf<eqf> a(String $$0) {
      return alf.a(mg.bb, alg.b($$0));
   }

   public static void a(qh<eqf> $$0, alf<eqf> $$1, je<eiy<?, ?>> $$2, List<eqi> $$3) {
      $$0.a($$1, new eqf($$2, List.copyOf($$3)));
   }

   public static void a(qh<eqf> $$0, alf<eqf> $$1, je<eiy<?, ?>> $$2, eqi... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static eqi a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bso<bti> $$4 = bso.<bti>b().a(btf.a($$0), (int)$$3 - 1).a(btf.a($$0 + $$2), 1).a();
         return epx.a(new btp($$4));
      }
   }

   public static eqh a() {
      return epu.a(ehn.c);
   }

   public static epu a(dmf $$0) {
      return epu.a(ehn.a($$0.m(), iu.c));
   }

   public static je<eqf> a(je<eiy<?, ?>> $$0, eqi... $$1) {
      return je.a(new eqf($$0, List.of($$1)));
   }

   public static <FC extends elq, F extends ejm<FC>> je<eqf> a(F $$0, FC $$1, eqi... $$2) {
      return a(je.a(new eiy($$0, $$1)), $$2);
   }

   public static <FC extends elq, F extends ejm<FC>> je<eqf> a(F $$0, FC $$1) {
      return a($$0, $$1, ehn.c);
   }

   public static <FC extends elq, F extends ejm<FC>> je<eqf> a(F $$0, FC $$1, ehn $$2) {
      return a($$0, $$1, epu.a($$2));
   }
}
