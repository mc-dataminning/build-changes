import java.util.List;

public class rx {
   public static final epp a = epi.a(efn.a.e);
   public static final epp b = epi.a(efn.a.f);
   public static final epp c = epi.a(efn.a.c);
   public static final epp d = epi.a(efn.a.a);
   public static final epp e = epi.a(efn.a.d);
   public static final epp f = eph.a(egh.a(), egh.b());
   public static final epp g = eph.a(egh.b(10), egh.c(10));
   public static final epp h = eph.a(egh.b(8), egh.c(8));
   public static final epp i = eph.a(egh.b(4), egh.c(4));
   public static final epp j = eph.a(egh.a(), egh.a(256));

   public static void a(qh<epm> $$0) {
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

   public static ald<epm> a(String $$0) {
      return ald.a(mg.aZ, ale.b($$0));
   }

   public static void a(qh<epm> $$0, ald<epm> $$1, je<eif<?, ?>> $$2, List<epp> $$3) {
      $$0.a($$1, new epm($$2, List.copyOf($$3)));
   }

   public static void a(qh<epm> $$0, ald<epm> $$1, je<eif<?, ?>> $$2, epp... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static epp a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bsj<btd> $$4 = bsj.<btd>b().a(bta.a($$0), (int)$$3 - 1).a(bta.a($$0 + $$2), 1).a();
         return epe.a(new btk($$4));
      }
   }

   public static epo a() {
      return epb.a(egu.c);
   }

   public static epb a(dlu $$0) {
      return epb.a(egu.a($$0.m(), iu.c));
   }

   public static je<epm> a(je<eif<?, ?>> $$0, epp... $$1) {
      return je.a(new epm($$0, List.of($$1)));
   }

   public static <FC extends ekx, F extends eit<FC>> je<epm> a(F $$0, FC $$1, epp... $$2) {
      return a(je.a(new eif($$0, $$1)), $$2);
   }

   public static <FC extends ekx, F extends eit<FC>> je<epm> a(F $$0, FC $$1) {
      return a($$0, $$1, egu.c);
   }

   public static <FC extends ekx, F extends eit<FC>> je<epm> a(F $$0, FC $$1, egu $$2) {
      return a($$0, $$1, epb.a($$2));
   }
}
