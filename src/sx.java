import java.util.List;

public class sx {
   public static final ehr a = ehk.a(dxu.a.e);
   public static final ehr b = ehk.a(dxu.a.c);
   public static final ehr c = ehk.a(dxu.a.a);
   public static final ehr d = ehk.a(dxu.a.d);
   public static final ehr e = ehj.a(dyo.a(), dyo.b());
   public static final ehr f = ehj.a(dyo.b(10), dyo.c(10));
   public static final ehr g = ehj.a(dyo.b(8), dyo.c(8));
   public static final ehr h = ehj.a(dyo.b(4), dyo.c(4));
   public static final ehr i = ehj.a(dyo.a(), dyo.a(256));

   public static void a(rc<eho> $$0) {
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

   public static ale<eho> a(String $$0) {
      return ale.a(lq.aI, new alf($$0));
   }

   public static void a(rc<eho> $$0, ale<eho> $$1, ji<eal<?, ?>> $$2, List<ehr> $$3) {
      $$0.a($$1, new eho($$2, List.copyOf($$3)));
   }

   public static void a(rc<eho> $$0, ale<eho> $$1, ji<eal<?, ?>> $$2, ehr... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static ehr a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bpe<bpz> $$4 = bpe.<bpz>a().a(bpw.a($$0), (int)$$3 - 1).a(bpw.a($$0 + $$2), 1).a();
         return ehh.a(new bqg($$4));
      }
   }

   public static ehq a() {
      return ehd.a(dzb.c);
   }

   public static ehd a(dez $$0) {
      return ehd.a(dzb.a($$0.o(), iz.c));
   }

   public static ji<eho> a(ji<eal<?, ?>> $$0, ehr... $$1) {
      return ji.a(new eho($$0, List.of($$1)));
   }

   public static <FC extends edc, F extends eay<FC>> ji<eho> a(F $$0, FC $$1, ehr... $$2) {
      return a(ji.a(new eal($$0, $$1)), $$2);
   }

   public static <FC extends edc, F extends eay<FC>> ji<eho> a(F $$0, FC $$1) {
      return a($$0, $$1, dzb.c);
   }

   public static <FC extends edc, F extends eay<FC>> ji<eho> a(F $$0, FC $$1, dzb $$2) {
      return a($$0, $$1, ehd.a($$2));
   }
}
