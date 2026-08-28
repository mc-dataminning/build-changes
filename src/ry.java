import java.util.List;

public class ry {
   public static final erk a = erd.a(ehf.a.e);
   public static final erk b = erd.a(ehf.a.f);
   public static final erk c = erd.a(ehf.a.c);
   public static final erk d = erd.a(ehf.a.a);
   public static final erk e = erd.a(ehf.a.d);
   public static final erk f = erc.a(ehz.a(), ehz.b());
   public static final erk g = erc.a(ehz.b(10), ehz.c(10));
   public static final erk h = erc.a(ehz.b(8), ehz.c(8));
   public static final erk i = erc.a(ehz.b(4), ehz.c(4));
   public static final erk j = erc.a(ehz.a(), ehz.a(256));

   public static void a(qi<erh> $$0) {
      rs.a($$0);
      rt.a($$0);
      ru.a($$0);
      rv.a($$0);
      rw.a($$0);
      rx.a($$0);
      rz.a($$0);
      sa.a($$0);
      sb.a($$0);
   }

   public static alj<erh> a(String $$0) {
      return alj.a(mi.bb, alk.b($$0));
   }

   public static void a(qi<erh> $$0, alj<erh> $$1, jg<ejx<?, ?>> $$2, List<erk> $$3) {
      $$0.a($$1, new erh($$2, List.copyOf($$3)));
   }

   public static void a(qi<erh> $$0, alj<erh> $$1, jg<ejx<?, ?>> $$2, erk... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static erk a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         btd<bty> $$4 = btd.<bty>b().a(btv.a($$0), (int)$$3 - 1).a(btv.a($$0 + $$2), 1).a();
         return eqz.a(new buf($$4));
      }
   }

   public static erj a() {
      return eqw.a(eim.c);
   }

   public static eqw a(dne $$0) {
      return eqw.a(eim.a($$0.m(), iw.c));
   }

   public static jg<erh> a(jg<ejx<?, ?>> $$0, erk... $$1) {
      return jg.a(new erh($$0, List.of($$1)));
   }

   public static <FC extends emr, F extends ekm<FC>> jg<erh> a(F $$0, FC $$1, erk... $$2) {
      return a(jg.a(new ejx($$0, $$1)), $$2);
   }

   public static <FC extends emr, F extends ekm<FC>> jg<erh> a(F $$0, FC $$1) {
      return a($$0, $$1, eim.c);
   }

   public static <FC extends emr, F extends ekm<FC>> jg<erh> a(F $$0, FC $$1, eim $$2) {
      return a($$0, $$1, eqw.a($$2));
   }
}
