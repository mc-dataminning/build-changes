import java.util.List;

public class sx {
   public static final ehs a = ehl.a(dxv.a.e);
   public static final ehs b = ehl.a(dxv.a.c);
   public static final ehs c = ehl.a(dxv.a.a);
   public static final ehs d = ehl.a(dxv.a.d);
   public static final ehs e = ehk.a(dyp.a(), dyp.b());
   public static final ehs f = ehk.a(dyp.b(10), dyp.c(10));
   public static final ehs g = ehk.a(dyp.b(8), dyp.c(8));
   public static final ehs h = ehk.a(dyp.b(4), dyp.c(4));
   public static final ehs i = ehk.a(dyp.a(), dyp.a(256));

   public static void a(rc<ehp> $$0) {
      sr.a($$0);
      ss.a($$0);
      st.a($$0);
      su.a($$0);
      sv.a($$0);
      sw.a($$0);
      sy.a($$0);
      sz.a($$0);
      ta.a($$0);
   }

   public static ale<ehp> a(String $$0) {
      return ale.a(lq.aI, new alf($$0));
   }

   public static void a(rc<ehp> $$0, ale<ehp> $$1, ji<eam<?, ?>> $$2, List<ehs> $$3) {
      $$0.a($$1, new ehp($$2, List.copyOf($$3)));
   }

   public static void a(rc<ehp> $$0, ale<ehp> $$1, ji<eam<?, ?>> $$2, ehs... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static ehs a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bpf<bqa> $$4 = bpf.<bqa>a().a(bpx.a($$0), (int)$$3 - 1).a(bpx.a($$0 + $$2), 1).a();
         return ehi.a(new bqh($$4));
      }
   }

   public static ehr a() {
      return ehe.a(dzc.c);
   }

   public static ehe a(dfa $$0) {
      return ehe.a(dzc.a($$0.o(), iz.c));
   }

   public static ji<ehp> a(ji<eam<?, ?>> $$0, ehs... $$1) {
      return ji.a(new ehp($$0, List.of($$1)));
   }

   public static <FC extends edd, F extends eaz<FC>> ji<ehp> a(F $$0, FC $$1, ehs... $$2) {
      return a(ji.a(new eam($$0, $$1)), $$2);
   }

   public static <FC extends edd, F extends eaz<FC>> ji<ehp> a(F $$0, FC $$1) {
      return a($$0, $$1, dzc.c);
   }

   public static <FC extends edd, F extends eaz<FC>> ji<ehp> a(F $$0, FC $$1, dzc $$2) {
      return a($$0, $$1, ehe.a($$2));
   }
}
