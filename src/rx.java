import java.util.List;

public class rx {
   public static final eri a = erb.a(ehd.a.e);
   public static final eri b = erb.a(ehd.a.f);
   public static final eri c = erb.a(ehd.a.c);
   public static final eri d = erb.a(ehd.a.a);
   public static final eri e = erb.a(ehd.a.d);
   public static final eri f = era.a(ehx.a(), ehx.b());
   public static final eri g = era.a(ehx.b(10), ehx.c(10));
   public static final eri h = era.a(ehx.b(8), ehx.c(8));
   public static final eri i = era.a(ehx.b(4), ehx.c(4));
   public static final eri j = era.a(ehx.a(), ehx.a(256));

   public static void a(qh<erf> $$0) {
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

   public static alh<erf> a(String $$0) {
      return alh.a(mh.bb, ali.b($$0));
   }

   public static void a(qh<erf> $$0, alh<erf> $$1, jf<ejv<?, ?>> $$2, List<eri> $$3) {
      $$0.a($$1, new erf($$2, List.copyOf($$3)));
   }

   public static void a(qh<erf> $$0, alh<erf> $$1, jf<ejv<?, ?>> $$2, eri... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static eri a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         btb<btw> $$4 = btb.<btw>b().a(btt.a($$0), (int)$$3 - 1).a(btt.a($$0 + $$2), 1).a();
         return eqx.a(new bud($$4));
      }
   }

   public static erh a() {
      return equ.a(eik.c);
   }

   public static equ a(dnc $$0) {
      return equ.a(eik.a($$0.m(), iv.c));
   }

   public static jf<erf> a(jf<ejv<?, ?>> $$0, eri... $$1) {
      return jf.a(new erf($$0, List.of($$1)));
   }

   public static <FC extends emp, F extends ekk<FC>> jf<erf> a(F $$0, FC $$1, eri... $$2) {
      return a(jf.a(new ejv($$0, $$1)), $$2);
   }

   public static <FC extends emp, F extends ekk<FC>> jf<erf> a(F $$0, FC $$1) {
      return a($$0, $$1, eik.c);
   }

   public static <FC extends emp, F extends ekk<FC>> jf<erf> a(F $$0, FC $$1, eik $$2) {
      return a($$0, $$1, equ.a($$2));
   }
}
