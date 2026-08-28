import java.util.List;

public class ru {
   public static final emr a = emk.a(ecq.a.e);
   public static final emr b = emk.a(ecq.a.f);
   public static final emr c = emk.a(ecq.a.c);
   public static final emr d = emk.a(ecq.a.a);
   public static final emr e = emk.a(ecq.a.d);
   public static final emr f = emj.a(edk.a(), edk.b());
   public static final emr g = emj.a(edk.b(10), edk.c(10));
   public static final emr h = emj.a(edk.b(8), edk.c(8));
   public static final emr i = emj.a(edk.b(4), edk.c(4));
   public static final emr j = emj.a(edk.a(), edk.a(256));

   public static void a(qe<emo> $$0) {
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

   public static akt<emo> a(String $$0) {
      return akt.a(mc.aT, aku.b($$0));
   }

   public static void a(qe<emo> $$0, akt<emo> $$1, jr<efi<?, ?>> $$2, List<emr> $$3) {
      $$0.a($$1, new emo($$2, List.copyOf($$3)));
   }

   public static void a(qe<emo> $$0, akt<emo> $$1, jr<efi<?, ?>> $$2, emr... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static emr a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bqq<brn> $$4 = bqq.<brn>a().a(brk.a($$0), (int)$$3 - 1).a(brk.a($$0 + $$2), 1).a();
         return emg.a(new bru($$4));
      }
   }

   public static emq a() {
      return emd.a(edx.c);
   }

   public static emd a(djk $$0) {
      return emd.a(edx.a($$0.m(), ji.c));
   }

   public static jr<emo> a(jr<efi<?, ?>> $$0, emr... $$1) {
      return jr.a(new emo($$0, List.of($$1)));
   }

   public static <FC extends eia, F extends efw<FC>> jr<emo> a(F $$0, FC $$1, emr... $$2) {
      return a(jr.a(new efi($$0, $$1)), $$2);
   }

   public static <FC extends eia, F extends efw<FC>> jr<emo> a(F $$0, FC $$1) {
      return a($$0, $$1, edx.c);
   }

   public static <FC extends eia, F extends efw<FC>> jr<emo> a(F $$0, FC $$1, edx $$2) {
      return a($$0, $$1, emd.a($$2));
   }
}
