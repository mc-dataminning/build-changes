import java.util.List;

public class ru {
   public static final enq a = enj.a(edo.a.e);
   public static final enq b = enj.a(edo.a.f);
   public static final enq c = enj.a(edo.a.c);
   public static final enq d = enj.a(edo.a.a);
   public static final enq e = enj.a(edo.a.d);
   public static final enq f = eni.a(eei.a(), eei.b());
   public static final enq g = eni.a(eei.b(10), eei.c(10));
   public static final enq h = eni.a(eei.b(8), eei.c(8));
   public static final enq i = eni.a(eei.b(4), eei.c(4));
   public static final enq j = eni.a(eei.a(), eei.a(256));

   public static void a(qe<enn> $$0) {
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

   public static akt<enn> a(String $$0) {
      return akt.a(mc.aV, aku.b($$0));
   }

   public static void a(qe<enn> $$0, akt<enn> $$1, jr<egg<?, ?>> $$2, List<enq> $$3) {
      $$0.a($$1, new enn($$2, List.copyOf($$3)));
   }

   public static void a(qe<enn> $$0, akt<enn> $$1, jr<egg<?, ?>> $$2, enq... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static enq a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         brj<bsd> $$4 = brj.<bsd>b().a(bsa.a($$0), (int)$$3 - 1).a(bsa.a($$0 + $$2), 1).a();
         return enf.a(new bsk($$4));
      }
   }

   public static enp a() {
      return enc.a(eev.c);
   }

   public static enc a(dke $$0) {
      return enc.a(eev.a($$0.m(), ji.c));
   }

   public static jr<enn> a(jr<egg<?, ?>> $$0, enq... $$1) {
      return jr.a(new enn($$0, List.of($$1)));
   }

   public static <FC extends eiy, F extends egu<FC>> jr<enn> a(F $$0, FC $$1, enq... $$2) {
      return a(jr.a(new egg($$0, $$1)), $$2);
   }

   public static <FC extends eiy, F extends egu<FC>> jr<enn> a(F $$0, FC $$1) {
      return a($$0, $$1, eev.c);
   }

   public static <FC extends eiy, F extends egu<FC>> jr<enn> a(F $$0, FC $$1, eev $$2) {
      return a($$0, $$1, enc.a($$2));
   }
}
