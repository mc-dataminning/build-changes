import java.util.List;

public class sw {
   public static final ehq a = ehj.a(dxt.a.e);
   public static final ehq b = ehj.a(dxt.a.c);
   public static final ehq c = ehj.a(dxt.a.a);
   public static final ehq d = ehj.a(dxt.a.d);
   public static final ehq e = ehi.a(dyn.a(), dyn.b());
   public static final ehq f = ehi.a(dyn.b(10), dyn.c(10));
   public static final ehq g = ehi.a(dyn.b(8), dyn.c(8));
   public static final ehq h = ehi.a(dyn.b(4), dyn.c(4));
   public static final ehq i = ehi.a(dyn.a(), dyn.a(256));

   public static void a(rc<ehn> $$0) {
      sq.a($$0);
      sr.a($$0);
      ss.a($$0);
      st.a($$0);
      su.a($$0);
      sv.a($$0);
      sx.a($$0);
      sy.a($$0);
      sz.a($$0);
   }

   public static ald<ehn> a(String $$0) {
      return ald.a(lq.aI, new ale($$0));
   }

   public static void a(rc<ehn> $$0, ald<ehn> $$1, ji<eak<?, ?>> $$2, List<ehq> $$3) {
      $$0.a($$1, new ehn($$2, List.copyOf($$3)));
   }

   public static void a(rc<ehn> $$0, ald<ehn> $$1, ji<eak<?, ?>> $$2, ehq... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static ehq a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bpd<bpy> $$4 = bpd.<bpy>a().a(bpv.a($$0), (int)$$3 - 1).a(bpv.a($$0 + $$2), 1).a();
         return ehg.a(new bqf($$4));
      }
   }

   public static ehp a() {
      return ehc.a(dza.c);
   }

   public static ehc a(dey $$0) {
      return ehc.a(dza.a($$0.o(), iz.c));
   }

   public static ji<ehn> a(ji<eak<?, ?>> $$0, ehq... $$1) {
      return ji.a(new ehn($$0, List.of($$1)));
   }

   public static <FC extends edb, F extends eax<FC>> ji<ehn> a(F $$0, FC $$1, ehq... $$2) {
      return a(ji.a(new eak($$0, $$1)), $$2);
   }

   public static <FC extends edb, F extends eax<FC>> ji<ehn> a(F $$0, FC $$1) {
      return a($$0, $$1, dza.c);
   }

   public static <FC extends edb, F extends eax<FC>> ji<ehn> a(F $$0, FC $$1, dza $$2) {
      return a($$0, $$1, ehc.a($$2));
   }
}
