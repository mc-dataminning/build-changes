import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class si {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "gameteststructures";
   public static String b = "gameteststructures";

   public static dfe a(int $$0) {
      switch ($$0) {
         case 0:
            return dfe.a;
         case 1:
            return dfe.b;
         case 2:
            return dfe.c;
         case 3:
            return dfe.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dfe $$0) {
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

   public static enu a(dkl $$0) {
      return enu.a(b($$0));
   }

   public static ebd b(dkl $$0) {
      hz $$1 = c($$0);
      hz $$2 = a($$1, $$0.k(), $$0.m());
      return ebd.a($$1, $$2);
   }

   public static hz c(dkl $$0) {
      return $$0.aE_().a((jd)$$0.g());
   }

   public static void a(hz $$0, hz $$1, dfe $$2, aow $$3) {
      hz $$4 = efl.a($$0.a((jd)$$1), ddo.a, $$2, $$0);
      $$3.b($$4, cyu.fN.o());
      djh $$5 = (djh)$$3.c_($$4);
      $$5.c().a("test runclosest");
      hz $$6 = efl.a($$4.b(0, 0, -1), ddo.a, $$2, $$4);
      $$3.b($$6, cyu.dM.o().a($$2));
   }

   public static void a(String $$0, hz $$1, jd $$2, dfe $$3, aow $$4) {
      ebd $$5 = b($$1.c(), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, cyu.pa.o());
      dkl $$6 = (dkl)$$4.c_($$1);
      $$6.a(false);
      $$6.a(new aiy($$0));
      $$6.a($$2);
      $$6.a(dmt.a);
      $$6.e(true);
   }

   public static dkl a(rs $$0, hz $$1, dfe $$2, aow $$3) {
      jd $$4 = $$3.q().b(new aiy($$0.s())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.s())).a();
      ebd $$5 = b($$1, $$4, $$2);
      hz $$6;
      if ($$2 == dfe.a) {
         $$6 = $$1;
      } else if ($$2 == dfe.b) {
         $$6 = $$1.b($$4.w() - 1, 0, 0);
      } else if ($$2 == dfe.c) {
         $$6 = $$1.b($$4.u() - 1, 0, $$4.w() - 1);
      } else {
         if ($$2 != dfe.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$6 = $$1.b(0, 0, $$4.u() - 1);
      }

      b($$5, $$3);
      a($$5, $$3);
      return b($$0, $$6.d(), $$2, $$3);
   }

   private static void b(ebd $$0, aow $$1) {
      $$0.b().forEach($$1x -> $$1.a($$1x.e, $$1x.f, true));
   }

   public static void a(ebd $$0, aow $$1) {
      int $$2 = $$0.i() - 1;
      ebd $$3 = new ebd($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      hz.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.m().a($$3);
      $$1.a($$3);
      enu $$4 = new enu((double)$$3.h(), (double)$$3.i(), (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), (double)$$3.m());
      List<bnq> $$5 = $$1.a(bnq.class, $$4, $$0x -> !($$0x instanceof chl));
      $$5.forEach(bnq::am);
   }

   public static hz a(hz $$0, jd $$1, dfe $$2) {
      hz $$3 = $$0.a($$1).b(-1, -1, -1);
      return efl.a($$3, ddo.a, $$2, $$0);
   }

   public static ebd b(hz $$0, jd $$1, dfe $$2) {
      hz $$3 = a($$0, $$1, $$2);
      ebd $$4 = ebd.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<hz> a(hz $$0, int $$1, aow $$2) {
      return c($$0, $$1, $$2).filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   public static Optional<hz> b(hz $$0, int $$1, aow $$2) {
      Comparator<hz> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      return c($$0, $$1, $$2).min($$3);
   }

   public static Stream<hz> c(hz $$0, int $$1, aow $$2) {
      ebd $$3 = new ebd($$0).a($$1);
      return hz.a($$3).filter($$1x -> $$2.a_($$1x).a(cyu.pa)).map(hz::i);
   }

   private static dkl b(rs $$0, hz $$1, dfe $$2, aow $$3) {
      $$3.b($$1, cyu.pa.o());
      dkl $$4 = (dkl)$$3.c_($$1);
      $$4.a(dmt.b);
      $$4.a($$2);
      $$4.a(false);
      $$4.a(new aiy($$0.s()));
      $$4.b($$0.b());
      if (!$$4.b($$3)) {
         throw new RuntimeException("Failed to load structure info for test: " + $$0.b() + ". Structure name: " + $$0.s());
      } else {
         return $$4;
      }
   }

   public static Stream<hz> a(int $$0, enz $$1, aow $$2) {
      hz $$3 = hz.a($$1.c, (double)$$2.a(dqv.a.b, hz.a($$1)).v(), $$1.e);
      hz $$4 = $$3.b(-$$0, 0, -$$0);
      hz $$5 = $$3.b($$0, 0, $$0);
      return hz.b($$4, $$5).filter($$1x -> $$2.a_($$1x).a(cyu.pa));
   }

   public static Stream<hz> a(hz $$0, bnq $$1, aow $$2) {
      int $$3 = 200;
      enz $$4 = $$1.br();
      enz $$5 = $$4.e($$1.bF().a(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, diz.u))
         .flatMap(Optional::stream)
         .filter($$2x -> a($$2x).b($$4, $$5).isPresent())
         .map(dix::aE_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, hz $$1, aow $$2) {
      dlj $$3;
      if ($$1.v() < $$0) {
         $$3 = cyu.b.o();
      } else {
         $$3 = cyu.a.o();
      }

      fj $$5 = new fj($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(hz $$0, hz $$1, aow $$2) {
      dkl $$3 = (dkl)$$2.c_($$0);
      return b($$3).b($$1);
   }
}
