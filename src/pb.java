import java.util.List;

public class pb {
   public static final dug a = dtz.a(dkj.a.e);
   public static final dug b = dtz.a(dkj.a.c);
   public static final dug c = dtz.a(dkj.a.a);
   public static final dug d = dtz.a(dkj.a.d);
   public static final dug e = dty.a(dld.a(), dld.b());
   public static final dug f = dty.a(dld.b(10), dld.c(10));
   public static final dug g = dty.a(dld.b(8), dld.c(8));
   public static final dug h = dty.a(dld.b(4), dld.c(4));
   public static final dug i = dty.a(dld.a(), dld.a(256));

   public static void a(nm<dud> $$0) {
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

   public static aeq<dud> a(String $$0) {
      return aeq.a(jc.ay, new aer($$0));
   }

   public static void a(nm<dud> $$0, aeq<dud> $$1, he<dna<?, ?>> $$2, List<dug> $$3) {
      $$0.a($$1, new dud($$2, List.copyOf($$3)));
   }

   public static void a(nm<dud> $$0, aeq<dud> $$1, he<dna<?, ?>> $$2, dug... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static dug a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bfa<bfv> $$4 = bfa.<bfv>a().a(bfs.a($$0), (int)$$3 - 1).a(bfs.a($$0 + $$2), 1).a();
         return dtw.a(new bgc($$4));
      }
   }

   public static duf a() {
      return dts.a(dlq.c);
   }

   public static dts a(csm $$0) {
      return dts.a(dlq.a($$0.n(), gu.b));
   }

   public static he<dud> a(he<dna<?, ?>> $$0, dug... $$1) {
      return he.a(new dud($$0, List.of($$1)));
   }

   public static <FC extends dpr, F extends dnn<FC>> he<dud> a(F $$0, FC $$1, dug... $$2) {
      return a(he.a(new dna($$0, $$1)), $$2);
   }

   public static <FC extends dpr, F extends dnn<FC>> he<dud> a(F $$0, FC $$1) {
      return a($$0, $$1, dlq.c);
   }

   public static <FC extends dpr, F extends dnn<FC>> he<dud> a(F $$0, FC $$1, dlq $$2) {
      return a($$0, $$1, dts.a($$2));
   }
}
