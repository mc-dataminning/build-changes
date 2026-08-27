import java.util.List;

public class pb {
   public static final drh a = dra.a(dhk.a.e);
   public static final drh b = dra.a(dhk.a.c);
   public static final drh c = dra.a(dhk.a.a);
   public static final drh d = dra.a(dhk.a.d);
   public static final drh e = dqz.a(die.a(), die.b());
   public static final drh f = dqz.a(die.b(10), die.c(10));
   public static final drh g = dqz.a(die.b(8), die.c(8));
   public static final drh h = dqz.a(die.b(4), die.c(4));
   public static final drh i = dqz.a(die.a(), die.a(256));

   public static void a(nm<dre> $$0) {
      ov.a($$0);
      ow.a($$0);
      ox.a($$0);
      oy.a($$0);
      oz.a($$0);
      pa.a($$0);
      pc.a($$0);
      pd.a($$0);
      pe.a($$0);
   }

   public static acp<dre> a(String $$0) {
      return acp.a(jc.ay, new acq($$0));
   }

   public static void a(nm<dre> $$0, acp<dre> $$1, he<dkb<?, ?>> $$2, List<drh> $$3) {
      $$0.a($$1, new dre($$2, List.copyOf($$3)));
   }

   public static void a(nm<dre> $$0, acp<dre> $$1, he<dkb<?, ?>> $$2, drh... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static drh a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bch<bdc> $$4 = bch.<bdc>a().a(bcz.a($$0), (int)$$3 - 1).a(bcz.a($$0 + $$2), 1).a();
         return dqx.a(new bdj($$4));
      }
   }

   public static drg a() {
      return dqt.a(dir.c);
   }

   public static dqt a(cpn $$0) {
      return dqt.a(dir.a($$0.n(), gu.b));
   }

   public static he<dre> a(he<dkb<?, ?>> $$0, drh... $$1) {
      return he.a(new dre($$0, List.of($$1)));
   }

   public static <FC extends dms, F extends dko<FC>> he<dre> a(F $$0, FC $$1, drh... $$2) {
      return a(he.a(new dkb($$0, $$1)), $$2);
   }

   public static <FC extends dms, F extends dko<FC>> he<dre> a(F $$0, FC $$1) {
      return a($$0, $$1, dir.c);
   }

   public static <FC extends dms, F extends dko<FC>> he<dre> a(F $$0, FC $$1, dir $$2) {
      return a($$0, $$1, dqt.a($$2));
   }
}
