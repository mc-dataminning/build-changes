import java.util.List;

public class pg {
   public static final dup a = dui.a(dks.a.e);
   public static final dup b = dui.a(dks.a.c);
   public static final dup c = dui.a(dks.a.a);
   public static final dup d = dui.a(dks.a.d);
   public static final dup e = duh.a(dlm.a(), dlm.b());
   public static final dup f = duh.a(dlm.b(10), dlm.c(10));
   public static final dup g = duh.a(dlm.b(8), dlm.c(8));
   public static final dup h = duh.a(dlm.b(4), dlm.c(4));
   public static final dup i = duh.a(dlm.a(), dlm.a(256));

   public static void a(nr<dum> $$0) {
      pa.a($$0);
      pb.a($$0);
      pc.a($$0);
      pd.a($$0);
      pe.a($$0);
      pf.a($$0);
      ph.a($$0);
      pi.a($$0);
      pj.a($$0);
   }

   public static aev<dum> a(String $$0) {
      return aev.a(jc.ay, new aew($$0));
   }

   public static void a(nr<dum> $$0, aev<dum> $$1, he<dnj<?, ?>> $$2, List<dup> $$3) {
      $$0.a($$1, new dum($$2, List.copyOf($$3)));
   }

   public static void a(nr<dum> $$0, aev<dum> $$1, he<dnj<?, ?>> $$2, dup... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static dup a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bfi<bgd> $$4 = bfi.<bgd>a().a(bga.a($$0), (int)$$3 - 1).a(bga.a($$0 + $$2), 1).a();
         return duf.a(new bgk($$4));
      }
   }

   public static duo a() {
      return dub.a(dlz.c);
   }

   public static dub a(csv $$0) {
      return dub.a(dlz.a($$0.n(), gw.b));
   }

   public static he<dum> a(he<dnj<?, ?>> $$0, dup... $$1) {
      return he.a(new dum($$0, List.of($$1)));
   }

   public static <FC extends dqa, F extends dnw<FC>> he<dum> a(F $$0, FC $$1, dup... $$2) {
      return a(he.a(new dnj($$0, $$1)), $$2);
   }

   public static <FC extends dqa, F extends dnw<FC>> he<dum> a(F $$0, FC $$1) {
      return a($$0, $$1, dlz.c);
   }

   public static <FC extends dqa, F extends dnw<FC>> he<dum> a(F $$0, FC $$1, dlz $$2) {
      return a($$0, $$1, dub.a($$2));
   }
}
