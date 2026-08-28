import java.util.List;

public class ru {
   public static final ems a = eml.a(ecr.a.e);
   public static final ems b = eml.a(ecr.a.f);
   public static final ems c = eml.a(ecr.a.c);
   public static final ems d = eml.a(ecr.a.a);
   public static final ems e = eml.a(ecr.a.d);
   public static final ems f = emk.a(edl.a(), edl.b());
   public static final ems g = emk.a(edl.b(10), edl.c(10));
   public static final ems h = emk.a(edl.b(8), edl.c(8));
   public static final ems i = emk.a(edl.b(4), edl.c(4));
   public static final ems j = emk.a(edl.a(), edl.a(256));

   public static void a(qe<emp> $$0) {
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

   public static aku<emp> a(String $$0) {
      return aku.a(mc.aT, akv.b($$0));
   }

   public static void a(qe<emp> $$0, aku<emp> $$1, jr<efj<?, ?>> $$2, List<ems> $$3) {
      $$0.a($$1, new emp($$2, List.copyOf($$3)));
   }

   public static void a(qe<emp> $$0, aku<emp> $$1, jr<efj<?, ?>> $$2, ems... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static ems a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bqr<bro> $$4 = bqr.<bro>a().a(brl.a($$0), (int)$$3 - 1).a(brl.a($$0 + $$2), 1).a();
         return emh.a(new brv($$4));
      }
   }

   public static emr a() {
      return eme.a(edy.c);
   }

   public static eme a(djl $$0) {
      return eme.a(edy.a($$0.m(), ji.c));
   }

   public static jr<emp> a(jr<efj<?, ?>> $$0, ems... $$1) {
      return jr.a(new emp($$0, List.of($$1)));
   }

   public static <FC extends eib, F extends efx<FC>> jr<emp> a(F $$0, FC $$1, ems... $$2) {
      return a(jr.a(new efj($$0, $$1)), $$2);
   }

   public static <FC extends eib, F extends efx<FC>> jr<emp> a(F $$0, FC $$1) {
      return a($$0, $$1, edy.c);
   }

   public static <FC extends eib, F extends efx<FC>> jr<emp> a(F $$0, FC $$1, edy $$2) {
      return a($$0, $$1, eme.a($$2));
   }
}
