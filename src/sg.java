import java.util.List;

public class sg {
   public static final eiy a = eir.a(dyy.a.e);
   public static final eiy b = eir.a(dyy.a.c);
   public static final eiy c = eir.a(dyy.a.a);
   public static final eiy d = eir.a(dyy.a.d);
   public static final eiy e = eiq.a(dzs.a(), dzs.b());
   public static final eiy f = eiq.a(dzs.b(10), dzs.c(10));
   public static final eiy g = eiq.a(dzs.b(8), dzs.c(8));
   public static final eiy h = eiq.a(dzs.b(4), dzs.c(4));
   public static final eiy i = eiq.a(dzs.a(), dzs.a(256));

   public static void a(qq<eiv> $$0) {
      sa.a($$0);
      sb.a($$0);
      sc.a($$0);
      sd.a($$0);
      se.a($$0);
      sf.a($$0);
      sh.a($$0);
      si.a($$0);
      sj.a($$0);
   }

   public static akq<eiv> a(String $$0) {
      return akq.a(lu.aQ, akr.b($$0));
   }

   public static void a(qq<eiv> $$0, akq<eiv> $$1, jm<ebq<?, ?>> $$2, List<eiy> $$3) {
      $$0.a($$1, new eiv($$2, List.copyOf($$3)));
   }

   public static void a(qq<eiv> $$0, akq<eiv> $$1, jm<ebq<?, ?>> $$2, eiy... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static eiy a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bpb<bpw> $$4 = bpb.<bpw>a().a(bpt.a($$0), (int)$$3 - 1).a(bpt.a($$0 + $$2), 1).a();
         return ein.a(new bqd($$4));
      }
   }

   public static eix a() {
      return eij.a(eaf.c);
   }

   public static eij a(dfy $$0) {
      return eij.a(eaf.a($$0.o(), jd.c));
   }

   public static jm<eiv> a(jm<ebq<?, ?>> $$0, eiy... $$1) {
      return jm.a(new eiv($$0, List.of($$1)));
   }

   public static <FC extends eei, F extends ece<FC>> jm<eiv> a(F $$0, FC $$1, eiy... $$2) {
      return a(jm.a(new ebq($$0, $$1)), $$2);
   }

   public static <FC extends eei, F extends ece<FC>> jm<eiv> a(F $$0, FC $$1) {
      return a($$0, $$1, eaf.c);
   }

   public static <FC extends eei, F extends ece<FC>> jm<eiv> a(F $$0, FC $$1, eaf $$2) {
      return a($$0, $$1, eij.a($$2));
   }
}
