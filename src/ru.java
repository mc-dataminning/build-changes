import java.util.List;

public class ru {
   public static final emt a = emm.a(ecs.a.e);
   public static final emt b = emm.a(ecs.a.f);
   public static final emt c = emm.a(ecs.a.c);
   public static final emt d = emm.a(ecs.a.a);
   public static final emt e = emm.a(ecs.a.d);
   public static final emt f = eml.a(edm.a(), edm.b());
   public static final emt g = eml.a(edm.b(10), edm.c(10));
   public static final emt h = eml.a(edm.b(8), edm.c(8));
   public static final emt i = eml.a(edm.b(4), edm.c(4));
   public static final emt j = eml.a(edm.a(), edm.a(256));

   public static void a(qe<emq> $$0) {
      ro.a($$0);
      rp.a($$0);
      rq.a($$0);
      rr.a($$0);
      rs.a($$0);
      rt.a($$0);
      rv.a($$0);
      rw.a($$0);
      rx.a($$0);
   }

   public static aku<emq> a(String $$0) {
      return aku.a(mc.aT, akv.b($$0));
   }

   public static void a(qe<emq> $$0, aku<emq> $$1, jr<efk<?, ?>> $$2, List<emt> $$3) {
      $$0.a($$1, new emq($$2, List.copyOf($$3)));
   }

   public static void a(qe<emq> $$0, aku<emq> $$1, jr<efk<?, ?>> $$2, emt... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static emt a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bqs<brp> $$4 = bqs.<brp>a().a(brm.a($$0), (int)$$3 - 1).a(brm.a($$0 + $$2), 1).a();
         return emi.a(new brw($$4));
      }
   }

   public static ems a() {
      return emf.a(edz.c);
   }

   public static emf a(djm $$0) {
      return emf.a(edz.a($$0.m(), ji.c));
   }

   public static jr<emq> a(jr<efk<?, ?>> $$0, emt... $$1) {
      return jr.a(new emq($$0, List.of($$1)));
   }

   public static <FC extends eic, F extends efy<FC>> jr<emq> a(F $$0, FC $$1, emt... $$2) {
      return a(jr.a(new efk($$0, $$1)), $$2);
   }

   public static <FC extends eic, F extends efy<FC>> jr<emq> a(F $$0, FC $$1) {
      return a($$0, $$1, edz.c);
   }

   public static <FC extends eic, F extends efy<FC>> jr<emq> a(F $$0, FC $$1, edz $$2) {
      return a($$0, $$1, emf.a($$2));
   }
}
