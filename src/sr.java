import java.util.List;

public class sr {
   public static final eli a = elb.a(ebj.a.e);
   public static final eli b = elb.a(ebj.a.c);
   public static final eli c = elb.a(ebj.a.a);
   public static final eli d = elb.a(ebj.a.d);
   public static final eli e = ela.a(ecd.a(), ecd.b());
   public static final eli f = ela.a(ecd.b(10), ecd.c(10));
   public static final eli g = ela.a(ecd.b(8), ecd.c(8));
   public static final eli h = ela.a(ecd.b(4), ecd.c(4));
   public static final eli i = ela.a(ecd.a(), ecd.a(256));

   public static void a(rb<elf> $$0) {
      sl.a($$0);
      sm.a($$0);
      sn.a($$0);
      so.a($$0);
      sp.a($$0);
      sq.a($$0);
      ss.a($$0);
      st.a($$0);
      su.a($$0);
   }

   public static alk<elf> a(String $$0) {
      return alk.a(ma.aR, all.b($$0));
   }

   public static void a(rb<elf> $$0, alk<elf> $$1, jq<eeb<?, ?>> $$2, List<eli> $$3) {
      $$0.a($$1, new elf($$2, List.copyOf($$3)));
   }

   public static void a(rb<elf> $$0, alk<elf> $$1, jq<eeb<?, ?>> $$2, eli... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static eli a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bqp<brm> $$4 = bqp.<brm>a().a(brj.a($$0), (int)$$3 - 1).a(brj.a($$0 + $$2), 1).a();
         return ekx.a(new brt($$4));
      }
   }

   public static elh a() {
      return eku.a(ecq.c);
   }

   public static eku a(dij $$0) {
      return eku.a(ecq.a($$0.m(), jh.c));
   }

   public static jq<elf> a(jq<eeb<?, ?>> $$0, eli... $$1) {
      return jq.a(new elf($$0, List.of($$1)));
   }

   public static <FC extends egt, F extends eep<FC>> jq<elf> a(F $$0, FC $$1, eli... $$2) {
      return a(jq.a(new eeb($$0, $$1)), $$2);
   }

   public static <FC extends egt, F extends eep<FC>> jq<elf> a(F $$0, FC $$1) {
      return a($$0, $$1, ecq.c);
   }

   public static <FC extends egt, F extends eep<FC>> jq<elf> a(F $$0, FC $$1, ecq $$2) {
      return a($$0, $$1, eku.a($$2));
   }
}
