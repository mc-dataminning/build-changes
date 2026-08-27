import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class sy {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "gameteststructures";
   public static String b = "gameteststructures";

   public static dik a(int $$0) {
      switch ($$0) {
         case 0:
            return dik.a;
         case 1:
            return dik.b;
         case 2:
            return dik.c;
         case 3:
            return dik.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dik $$0) {
      switch ($$0) {
         case a:
            return 0;
         case b:
            return 1;
         case c:
            return 2;
         case d:
            return 3;
         default:
            throw new IllegalArgumentException("Unknown rotation value, don't know how many steps it represents: " + $$0);
      }
   }

   public static erv a(dnu $$0) {
      return erv.a(b($$0));
   }

   public static eez b(dnu $$0) {
      ib $$1 = c($$0);
      ib $$2 = a($$1, $$0.j(), $$0.l());
      return eez.a($$1, $$2);
   }

   public static ib c(dnu $$0) {
      return $$0.aA_().a((jg)$$0.f());
   }

   public static void a(ib $$0, ib $$1, dik $$2, aps $$3) {
      ib $$4 = ejh.a($$0.a((jg)$$1), dgu.a, $$2, $$0);
      $$3.b($$4, dca.fN.n());
      dmp $$5 = (dmp)$$3.c_($$4);
      $$5.b().a("test runclosest");
      ib $$6 = ejh.a($$4.b(0, 0, -1), dgu.a, $$2, $$4);
      $$3.b($$6, dca.dM.n().a($$2));
   }

   public static void a(String $$0, ib $$1, jg $$2, dik $$3, aps $$4) {
      eez $$5 = b($$1.c(), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, dca.pa.n());
      dnu $$6 = (dnu)$$4.c_($$1);
      $$6.a(false);
      $$6.a(new ajt($$0));
      $$6.a($$2);
      $$6.a(dqj.a);
      $$6.e(true);
   }

   public static dnu a(si $$0, ib $$1, dik $$2, aps $$3) {
      jg $$4 = $$3.q().b(new ajt($$0.s())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.s())).a();
      eez $$5 = b($$1, $$4, $$2);
      ib $$6;
      if ($$2 == dik.a) {
         $$6 = $$1;
      } else if ($$2 == dik.b) {
         $$6 = $$1.b($$4.w() - 1, 0, 0);
      } else if ($$2 == dik.c) {
         $$6 = $$1.b($$4.u() - 1, 0, $$4.w() - 1);
      } else {
         if ($$2 != dik.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$6 = $$1.b(0, 0, $$4.u() - 1);
      }

      b($$5, $$3);
      a($$5, $$3);
      return b($$0, $$6.d(), $$2, $$3);
   }

   public static void a(erv $$0, aps $$1, boolean $$2) {
      ib $$3 = ib.a($$0.a, $$0.b, $$0.c).b(-1, 1, -1);
      ib $$4 = ib.a($$0.d, $$0.e, $$0.f);
      ib.b($$3, $$4).forEach($$4x -> {
         boolean $$5 = $$4x.u() == $$3.u() || $$4x.u() == $$4.u() || $$4x.w() == $$3.w() || $$4x.w() == $$4.w();
         boolean $$6 = $$4x.v() == $$4.v();
         if ($$5 || $$6 && $$2) {
            $$1.b($$4x, dca.hW.n());
         }
      });
   }

   public static void a(erv $$0, aps $$1) {
      ib $$2 = ib.a($$0.a, $$0.b, $$0.c).b(-1, 1, -1);
      ib $$3 = ib.a($$0.d, $$0.e, $$0.f);
      ib.b($$2, $$3).forEach($$3x -> {
         boolean $$4 = $$3x.u() == $$2.u() || $$3x.u() == $$3.u() || $$3x.w() == $$2.w() || $$3x.w() == $$3.w();
         boolean $$5 = $$3x.v() == $$3.v();
         if ($$1.a_($$3x).a(dca.hW) && ($$4 || $$5)) {
            $$1.b($$3x, dca.a.n());
         }
      });
   }

   private static void b(eez $$0, aps $$1) {
      $$0.b().forEach($$1x -> $$1.a($$1x.e, $$1x.f, true));
   }

   public static void a(eez $$0, aps $$1) {
      int $$2 = $$0.i() - 1;
      eez $$3 = new eez($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      ib.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.m().a($$3);
      $$1.a($$3);
      erv $$4 = new erv((double)$$3.h(), (double)$$3.i(), (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), (double)$$3.m());
      List<bpv> $$5 = $$1.a(bpv.class, $$4, $$0x -> !($$0x instanceof cjt));
      $$5.forEach(bpv::am);
   }

   public static ib a(ib $$0, jg $$1, dik $$2) {
      ib $$3 = $$0.a($$1).b(-1, -1, -1);
      return ejh.a($$3, dgu.a, $$2, $$0);
   }

   public static eez b(ib $$0, jg $$1, dik $$2) {
      ib $$3 = a($$0, $$1, $$2);
      eez $$4 = eez.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<ib> a(ib $$0, int $$1, aps $$2) {
      return c($$0, $$1, $$2).filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   public static Optional<ib> b(ib $$0, int $$1, aps $$2) {
      Comparator<ib> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      return c($$0, $$1, $$2).min($$3);
   }

   public static Stream<ib> c(ib $$0, int $$1, aps $$2) {
      eez $$3 = new eez($$0).a($$1);
      return ib.a($$3).filter($$1x -> $$2.a_($$1x).a(dca.pa)).map(ib::i);
   }

   private static dnu b(si $$0, ib $$1, dik $$2, aps $$3) {
      $$3.b($$1, dca.pa.n());
      dnu $$4 = (dnu)$$3.c_($$1);
      $$4.a(dqj.b);
      $$4.a($$2);
      $$4.a(false);
      $$4.a(new ajt($$0.s()));
      $$4.b($$0.b());
      if (!$$4.b($$3)) {
         throw new RuntimeException("Failed to load structure info for test: " + $$0.b() + ". Structure name: " + $$0.s());
      } else {
         return $$4;
      }
   }

   public static Stream<ib> a(int $$0, esa $$1, aps $$2) {
      ib $$3 = ib.a($$1.c, (double)$$2.a(dur.a.b, ib.a($$1)).v(), $$1.e);
      ib $$4 = $$3.b(-$$0, 0, -$$0);
      ib $$5 = $$3.b($$0, 0, $$0);
      return ib.b($$4, $$5).filter($$1x -> $$2.a_($$1x).a(dca.pa));
   }

   public static Stream<ib> a(ib $$0, bpv $$1, aps $$2) {
      int $$3 = 200;
      esa $$4 = $$1.bu();
      esa $$5 = $$4.e($$1.bI().a(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, dmh.u))
         .flatMap(Optional::stream)
         .filter($$2x -> a($$2x).b($$4, $$5).isPresent())
         .map(dmf::aA_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, ib $$1, aps $$2) {
      doz $$3;
      if ($$1.v() < $$0) {
         $$3 = dca.b.n();
      } else {
         $$3 = dca.a.n();
      }

      fj $$5 = new fj($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(ib $$0, ib $$1, aps $$2) {
      dnu $$3 = (dnu)$$2.c_($$0);
      return b($$3).b($$1);
   }
}
