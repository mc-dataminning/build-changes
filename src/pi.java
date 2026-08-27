import java.util.List;

public class pi {
   public static final dur a = duk.a(dku.a.e);
   public static final dur b = duk.a(dku.a.c);
   public static final dur c = duk.a(dku.a.a);
   public static final dur d = duk.a(dku.a.d);
   public static final dur e = duj.a(dlo.a(), dlo.b());
   public static final dur f = duj.a(dlo.b(10), dlo.c(10));
   public static final dur g = duj.a(dlo.b(8), dlo.c(8));
   public static final dur h = duj.a(dlo.b(4), dlo.c(4));
   public static final dur i = duj.a(dlo.a(), dlo.a(256));

   public static void a(nt<duo> $$0) {
      pc.a($$0);
      pd.a($$0);
      pe.a($$0);
      pf.a($$0);
      pg.a($$0);
      ph.a($$0);
      pj.a($$0);
      pk.a($$0);
      pl.a($$0);
   }

   public static aex<duo> a(String $$0) {
      return aex.a(je.ay, new aey($$0));
   }

   public static void a(nt<duo> $$0, aex<duo> $$1, hg<dnl<?, ?>> $$2, List<dur> $$3) {
      $$0.a($$1, new duo($$2, List.copyOf($$3)));
   }

   public static void a(nt<duo> $$0, aex<duo> $$1, hg<dnl<?, ?>> $$2, dur... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static dur a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bfk<bgf> $$4 = bfk.<bgf>a().a(bgc.a($$0), (int)$$3 - 1).a(bgc.a($$0 + $$2), 1).a();
         return duh.a(new bgm($$4));
      }
   }

   public static duq a() {
      return dud.a(dmb.c);
   }

   public static dud a(csx $$0) {
      return dud.a(dmb.a($$0.n(), gw.b));
   }

   public static hg<duo> a(hg<dnl<?, ?>> $$0, dur... $$1) {
      return hg.a(new duo($$0, List.of($$1)));
   }

   public static <FC extends dqc, F extends dny<FC>> hg<duo> a(F $$0, FC $$1, dur... $$2) {
      return a(hg.a(new dnl($$0, $$1)), $$2);
   }

   public static <FC extends dqc, F extends dny<FC>> hg<duo> a(F $$0, FC $$1) {
      return a($$0, $$1, dmb.c);
   }

   public static <FC extends dqc, F extends dny<FC>> hg<duo> a(F $$0, FC $$1, dmb $$2) {
      return a($$0, $$1, dud.a($$2));
   }
}
