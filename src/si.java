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

   public static dfa a(int $$0) {
      switch ($$0) {
         case 0:
            return dfa.a;
         case 1:
            return dfa.b;
         case 2:
            return dfa.c;
         case 3:
            return dfa.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dfa $$0) {
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

   public static enn a(dkh $$0) {
      return enn.a(b($$0));
   }

   public static eaw b(dkh $$0) {
      hz $$1 = c($$0);
      hz $$2 = a($$1, $$0.k(), $$0.m());
      return eaw.a($$1, $$2);
   }

   public static hz c(dkh $$0) {
      return $$0.aE_().a((jd)$$0.g());
   }

   public static void a(hz $$0, hz $$1, dfa $$2, aov $$3) {
      hz $$4 = efe.a($$0.a((jd)$$1), ddk.a, $$2, $$0);
      $$3.b($$4, cyq.fN.o());
      djd $$5 = (djd)$$3.c_($$4);
      $$5.c().a("test runclosest");
      hz $$6 = efe.a($$4.b(0, 0, -1), ddk.a, $$2, $$4);
      $$3.b($$6, cyq.dM.o().a($$2));
   }

   public static void a(String $$0, hz $$1, jd $$2, dfa $$3, aov $$4) {
      eaw $$5 = b($$1.c(), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, cyq.pa.o());
      dkh $$6 = (dkh)$$4.c_($$1);
      $$6.a(false);
      $$6.a(new aiy($$0));
      $$6.a($$2);
      $$6.a(dmp.a);
      $$6.e(true);
   }

   public static dkh a(rs $$0, hz $$1, dfa $$2, aov $$3) {
      jd $$4 = $$3.q().b(new aiy($$0.s())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.s())).a();
      eaw $$5 = b($$1, $$4, $$2);
      hz $$6;
      if ($$2 == dfa.a) {
         $$6 = $$1;
      } else if ($$2 == dfa.b) {
         $$6 = $$1.b($$4.w() - 1, 0, 0);
      } else if ($$2 == dfa.c) {
         $$6 = $$1.b($$4.u() - 1, 0, $$4.w() - 1);
      } else {
         if ($$2 != dfa.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$6 = $$1.b(0, 0, $$4.u() - 1);
      }

      b($$5, $$3);
      a($$5, $$3);
      return b($$0, $$6.d(), $$2, $$3);
   }

   private static void b(eaw $$0, aov $$1) {
      $$0.b().forEach($$1x -> $$1.a($$1x.e, $$1x.f, true));
   }

   public static void a(eaw $$0, aov $$1) {
      int $$2 = $$0.i() - 1;
      eaw $$3 = new eaw($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      hz.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.m().a($$3);
      $$1.a($$3);
      enn $$4 = new enn((double)$$3.h(), (double)$$3.i(), (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), (double)$$3.m());
      List<bno> $$5 = $$1.a(bno.class, $$4, $$0x -> !($$0x instanceof chh));
      $$5.forEach(bno::am);
   }

   public static hz a(hz $$0, jd $$1, dfa $$2) {
      hz $$3 = $$0.a($$1).b(-1, -1, -1);
      return efe.a($$3, ddk.a, $$2, $$0);
   }

   public static eaw b(hz $$0, jd $$1, dfa $$2) {
      hz $$3 = a($$0, $$1, $$2);
      eaw $$4 = eaw.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<hz> a(hz $$0, int $$1, aov $$2) {
      return c($$0, $$1, $$2).filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   public static Optional<hz> b(hz $$0, int $$1, aov $$2) {
      Comparator<hz> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      return c($$0, $$1, $$2).min($$3);
   }

   public static Stream<hz> c(hz $$0, int $$1, aov $$2) {
      eaw $$3 = new eaw($$0).a($$1);
      return hz.a($$3).filter($$1x -> $$2.a_($$1x).a(cyq.pa)).map(hz::i);
   }

   private static dkh b(rs $$0, hz $$1, dfa $$2, aov $$3) {
      $$3.b($$1, cyq.pa.o());
      dkh $$4 = (dkh)$$3.c_($$1);
      $$4.a(dmp.b);
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

   public static Stream<hz> a(int $$0, ens $$1, aov $$2) {
      hz $$3 = hz.a($$1.c, (double)$$2.a(dqo.a.b, hz.a($$1)).v(), $$1.e);
      hz $$4 = $$3.b(-$$0, 0, -$$0);
      hz $$5 = $$3.b($$0, 0, $$0);
      return hz.b($$4, $$5).filter($$1x -> $$2.a_($$1x).a(cyq.pa));
   }

   public static Stream<hz> a(hz $$0, bno $$1, aov $$2) {
      int $$3 = 200;
      ens $$4 = $$1.br();
      ens $$5 = $$4.e($$1.bF().a(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, div.u))
         .flatMap(Optional::stream)
         .filter($$2x -> a($$2x).b($$4, $$5).isPresent())
         .map(dit::aE_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, hz $$1, aov $$2) {
      dlf $$3;
      if ($$1.v() < $$0) {
         $$3 = cyq.b.o();
      } else {
         $$3 = cyq.a.o();
      }

      fj $$5 = new fj($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(hz $$0, hz $$1, aov $$2) {
      dkh $$3 = (dkh)$$2.c_($$0);
      return b($$3).b($$1);
   }
}
