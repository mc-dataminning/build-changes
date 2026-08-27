import java.util.List;

public class si {
   public static final egs a = egl.a(dwv.a.e);
   public static final egs b = egl.a(dwv.a.c);
   public static final egs c = egl.a(dwv.a.a);
   public static final egs d = egl.a(dwv.a.d);
   public static final egs e = egk.a(dxp.a(), dxp.b());
   public static final egs f = egk.a(dxp.b(10), dxp.c(10));
   public static final egs g = egk.a(dxp.b(8), dxp.c(8));
   public static final egs h = egk.a(dxp.b(4), dxp.c(4));
   public static final egs i = egk.a(dxp.a(), dxp.a(256));

   public static void a(qo<egp> $$0) {
      sc.a($$0);
      sd.a($$0);
      se.a($$0);
      sf.a($$0);
      sg.a($$0);
      sh.a($$0);
      sj.a($$0);
      sk.a($$0);
      sl.a($$0);
   }

   public static akm<egp> a(String $$0) {
      return akm.a(lf.aI, new akn($$0));
   }

   public static void a(qo<egp> $$0, akm<egp> $$1, ix<dzm<?, ?>> $$2, List<egs> $$3) {
      $$0.a($$1, new egp($$2, List.copyOf($$3)));
   }

   public static void a(qo<egp> $$0, akm<egp> $$1, ix<dzm<?, ?>> $$2, egs... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static egs a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bog<bpb> $$4 = bog.<bpb>a().a(boy.a($$0), (int)$$3 - 1).a(boy.a($$0 + $$2), 1).a();
         return egi.a(new bpi($$4));
      }
   }

   public static egr a() {
      return ege.a(dyc.c);
   }

   public static ege a(dea $$0) {
      return ege.a(dyc.a($$0.n(), io.c));
   }

   public static ix<egp> a(ix<dzm<?, ?>> $$0, egs... $$1) {
      return ix.a(new egp($$0, List.of($$1)));
   }

   public static <FC extends ecd, F extends dzz<FC>> ix<egp> a(F $$0, FC $$1, egs... $$2) {
      return a(ix.a(new dzm($$0, $$1)), $$2);
   }

   public static <FC extends ecd, F extends dzz<FC>> ix<egp> a(F $$0, FC $$1) {
      return a($$0, $$1, dyc.c);
   }

   public static <FC extends ecd, F extends dzz<FC>> ix<egp> a(F $$0, FC $$1, dyc $$2) {
      return a($$0, $$1, ege.a($$2));
   }
}
