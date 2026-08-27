import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class tm {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "gameteststructures";
   public static String b = "gameteststructures";

   public static djr a(int $$0) {
      switch ($$0) {
         case 0:
            return djr.a;
         case 1:
            return djr.b;
         case 2:
            return djr.c;
         case 3:
            return djr.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(djr $$0) {
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

   public static etk a(dpb $$0) {
      return etk.a(b($$0));
   }

   public static egh b(dpb $$0) {
      in $$1 = c($$0);
      in $$2 = a($$1, $$0.j(), $$0.l());
      return egh.a($$1, $$2);
   }

   public static in c(dpb $$0) {
      return $$0.az_().a((jr)$$0.f());
   }

   public static void a(in $$0, in $$1, djr $$2, aqh $$3) {
      in $$4 = ekp.a($$0.a((jr)$$1), dib.a, $$2, $$0);
      $$3.b($$4, ddg.fN.n());
      dnw $$5 = (dnw)$$3.c_($$4);
      $$5.b().a("test runclosest");
      in $$6 = ekp.a($$4.b(0, 0, -1), dib.a, $$2, $$4);
      $$3.b($$6, ddg.dM.n().a($$2));
   }

   public static void a(String $$0, in $$1, jr $$2, djr $$3, aqh $$4) {
      egh $$5 = b($$1.c(), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, ddg.pa.n());
      dpb $$6 = (dpb)$$4.c_($$1);
      $$6.a(false);
      $$6.a(new akh($$0));
      $$6.a($$2);
      $$6.a(drr.a);
      $$6.e(true);
   }

   public static dpb a(sw $$0, in $$1, djr $$2, aqh $$3) {
      jr $$4 = $$3.q().b(new akh($$0.s())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.s())).a();
      egh $$5 = b($$1, $$4, $$2);
      in $$6;
      if ($$2 == djr.a) {
         $$6 = $$1;
      } else if ($$2 == djr.b) {
         $$6 = $$1.b($$4.w() - 1, 0, 0);
      } else if ($$2 == djr.c) {
         $$6 = $$1.b($$4.u() - 1, 0, $$4.w() - 1);
      } else {
         if ($$2 != djr.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$6 = $$1.b(0, 0, $$4.u() - 1);
      }

      b($$5, $$3);
      a($$5, $$3);
      return b($$0, $$6.d(), $$2, $$3);
   }

   public static void a(etk $$0, aqh $$1, boolean $$2) {
      in $$3 = in.a($$0.a, $$0.b, $$0.c).b(-1, 1, -1);
      in $$4 = in.a($$0.d, $$0.e, $$0.f);
      in.d($$3, $$4).forEach($$4x -> {
         boolean $$5 = $$4x.u() == $$3.u() || $$4x.u() == $$4.u() || $$4x.w() == $$3.w() || $$4x.w() == $$4.w();
         boolean $$6 = $$4x.v() == $$4.v();
         if ($$5 || $$6 && $$2) {
            $$1.b($$4x, ddg.hW.n());
         }
      });
   }

   public static void a(etk $$0, aqh $$1) {
      in $$2 = in.a($$0.a, $$0.b, $$0.c).b(-1, 1, -1);
      in $$3 = in.a($$0.d, $$0.e, $$0.f);
      in.d($$2, $$3).forEach($$3x -> {
         boolean $$4 = $$3x.u() == $$2.u() || $$3x.u() == $$3.u() || $$3x.w() == $$2.w() || $$3x.w() == $$3.w();
         boolean $$5 = $$3x.v() == $$3.v();
         if ($$1.a_($$3x).a(ddg.hW) && ($$4 || $$5)) {
            $$1.b($$3x, ddg.a.n());
         }
      });
   }

   private static void b(egh $$0, aqh $$1) {
      $$0.b().forEach($$1x -> $$1.a($$1x.e, $$1x.f, true));
   }

   public static void a(egh $$0, aqh $$1) {
      int $$2 = $$0.i() - 1;
      egh $$3 = new egh($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      in.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.m().a($$3);
      $$1.a($$3);
      etk $$4 = new etk((double)$$3.h(), (double)$$3.i(), (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), (double)$$3.m());
      List<brh> $$5 = $$1.a(brh.class, $$4, $$0x -> !($$0x instanceof clh));
      $$5.forEach(brh::am);
   }

   public static in a(in $$0, jr $$1, djr $$2) {
      in $$3 = $$0.a($$1).b(-1, -1, -1);
      return ekp.a($$3, dib.a, $$2, $$0);
   }

   public static egh b(in $$0, jr $$1, djr $$2) {
      in $$3 = a($$0, $$1, $$2);
      egh $$4 = egh.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<in> a(in $$0, int $$1, aqh $$2) {
      return c($$0, $$1, $$2).filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   public static Optional<in> b(in $$0, int $$1, aqh $$2) {
      Comparator<in> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      return c($$0, $$1, $$2).min($$3);
   }

   public static Stream<in> c(in $$0, int $$1, aqh $$2) {
      egh $$3 = new egh($$0).a($$1);
      return in.a($$3).filter($$1x -> $$2.a_($$1x).a(ddg.pa)).map(in::i);
   }

   private static dpb b(sw $$0, in $$1, djr $$2, aqh $$3) {
      $$3.b($$1, ddg.pa.n());
      dpb $$4 = (dpb)$$3.c_($$1);
      $$4.a(drr.b);
      $$4.a($$2);
      $$4.a(false);
      $$4.a(new akh($$0.s()));
      $$4.b($$0.b());
      if (!$$4.b($$3)) {
         throw new RuntimeException("Failed to load structure info for test: " + $$0.b() + ". Structure name: " + $$0.s());
      } else {
         return $$4;
      }
   }

   public static Stream<in> a(int $$0, etp $$1, aqh $$2) {
      in $$3 = in.a($$1.c, (double)$$2.a(dvz.a.b, in.a($$1)).v(), $$1.e);
      in $$4 = $$3.b(-$$0, 0, -$$0);
      in $$5 = $$3.b($$0, 0, $$0);
      return in.d($$4, $$5).filter($$1x -> $$2.a_($$1x).a(ddg.pa));
   }

   public static Stream<in> a(in $$0, brh $$1, aqh $$2) {
      int $$3 = 200;
      etp $$4 = $$1.bv();
      etp $$5 = $$4.e($$1.bJ().a(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, dno.u))
         .flatMap(Optional::stream)
         .filter($$2x -> a($$2x).b($$4, $$5).isPresent())
         .map(dnm::az_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, in $$1, aqh $$2) {
      dqh $$3;
      if ($$1.v() < $$0) {
         $$3 = ddg.b.n();
      } else {
         $$3 = ddg.a.n();
      }

      fu $$5 = new fu($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(in $$0, in $$1, aqh $$2) {
      dpb $$3 = (dpb)$$2.c_($$0);
      return b($$3).b($$1);
   }
}
