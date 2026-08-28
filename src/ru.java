import java.util.List;

public class ru {
   public static final emu a = emn.a(ect.a.e);
   public static final emu b = emn.a(ect.a.f);
   public static final emu c = emn.a(ect.a.c);
   public static final emu d = emn.a(ect.a.a);
   public static final emu e = emn.a(ect.a.d);
   public static final emu f = emm.a(edn.a(), edn.b());
   public static final emu g = emm.a(edn.b(10), edn.c(10));
   public static final emu h = emm.a(edn.b(8), edn.c(8));
   public static final emu i = emm.a(edn.b(4), edn.c(4));
   public static final emu j = emm.a(edn.a(), edn.a(256));

   public static void a(qe<emr> $$0) {
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

   public static aku<emr> a(String $$0) {
      return aku.a(mc.aT, akv.b($$0));
   }

   public static void a(qe<emr> $$0, aku<emr> $$1, jr<efl<?, ?>> $$2, List<emu> $$3) {
      $$0.a($$1, new emr($$2, List.copyOf($$3)));
   }

   public static void a(qe<emr> $$0, aku<emr> $$1, jr<efl<?, ?>> $$2, emu... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static emu a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bqt<brq> $$4 = bqt.<brq>a().a(brn.a($$0), (int)$$3 - 1).a(brn.a($$0 + $$2), 1).a();
         return emj.a(new brx($$4));
      }
   }

   public static emt a() {
      return emg.a(eea.c);
   }

   public static emg a(djn $$0) {
      return emg.a(eea.a($$0.m(), ji.c));
   }

   public static jr<emr> a(jr<efl<?, ?>> $$0, emu... $$1) {
      return jr.a(new emr($$0, List.of($$1)));
   }

   public static <FC extends eid, F extends efz<FC>> jr<emr> a(F $$0, FC $$1, emu... $$2) {
      return a(jr.a(new efl($$0, $$1)), $$2);
   }

   public static <FC extends eid, F extends efz<FC>> jr<emr> a(F $$0, FC $$1) {
      return a($$0, $$1, eea.c);
   }

   public static <FC extends eid, F extends efz<FC>> jr<emr> a(F $$0, FC $$1, eea $$2) {
      return a($$0, $$1, emg.a($$2));
   }
}
