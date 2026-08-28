import java.util.List;

public class sg {
   public static final eiw a = eip.a(dyy.a.e);
   public static final eiw b = eip.a(dyy.a.c);
   public static final eiw c = eip.a(dyy.a.a);
   public static final eiw d = eip.a(dyy.a.d);
   public static final eiw e = eio.a(dzs.a(), dzs.b());
   public static final eiw f = eio.a(dzs.b(10), dzs.c(10));
   public static final eiw g = eio.a(dzs.b(8), dzs.c(8));
   public static final eiw h = eio.a(dzs.b(4), dzs.c(4));
   public static final eiw i = eio.a(dzs.a(), dzs.a(256));

   public static void a(qq<eit> $$0) {
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

   public static akq<eit> a(String $$0) {
      return akq.a(lu.aQ, akr.b($$0));
   }

   public static void a(qq<eit> $$0, akq<eit> $$1, jm<ebq<?, ?>> $$2, List<eiw> $$3) {
      $$0.a($$1, new eit($$2, List.copyOf($$3)));
   }

   public static void a(qq<eit> $$0, akq<eit> $$1, jm<ebq<?, ?>> $$2, eiw... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static eiw a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bpb<bpw> $$4 = bpb.<bpw>a().a(bpt.a($$0), (int)$$3 - 1).a(bpt.a($$0 + $$2), 1).a();
         return eim.a(new bqd($$4));
      }
   }

   public static eiv a() {
      return eii.a(eaf.c);
   }

   public static eii a(dfy $$0) {
      return eii.a(eaf.a($$0.o(), jd.c));
   }

   public static jm<eit> a(jm<ebq<?, ?>> $$0, eiw... $$1) {
      return jm.a(new eit($$0, List.of($$1)));
   }

   public static <FC extends eeh, F extends ecd<FC>> jm<eit> a(F $$0, FC $$1, eiw... $$2) {
      return a(jm.a(new ebq($$0, $$1)), $$2);
   }

   public static <FC extends eeh, F extends ecd<FC>> jm<eit> a(F $$0, FC $$1) {
      return a($$0, $$1, eaf.c);
   }

   public static <FC extends eeh, F extends ecd<FC>> jm<eit> a(F $$0, FC $$1, eaf $$2) {
      return a($$0, $$1, eii.a($$2));
   }
}
